package Jv01_Basic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArrayScore {
	static String stdName[];
	static int stdScore[][];//각 과목의 점수, 개인별 총점, 평균, 석차, 과목별 총점, 과목별평균을 저장할 배열
	static int stdCount; // 학생수
	static int subjectCount; // 과목수
	public ArrayScore() {
		// TODO Auto-generated constructor stub
	}
	// 이름과 점수를 배열에 저장
	public static void setData() throws NumberFormatException, IOException {
		FileReader fr = new FileReader(new File("src/sungjuk.txt"));
		BufferedReader br = new BufferedReader(fr);
		//학생 수 읽어 오기
		stdCount = Integer.parseInt(br.readLine());
		subjectCount = Integer.parseInt(br.readLine());
		
		//학생이름 , 점수를 2차원 배열에 저장
		stdName = new String[stdCount];
		stdScore = new int[stdCount+2][subjectCount+3]; //12행 6열
		
		for(int i=0; i<stdCount;i++) { //0, 1,, 2, ....,9
			String[] line = br.readLine().split(","); // i+2번째 줄 입력
			// i를 stdName 의 index로 사용
			stdName[i]= line[0];
			for(int j=0;j<subjectCount;j++) { //1,2,3
				stdScore[i][j]=Integer.parseInt(line[j+1]);
				/*
				 * stdScore[i][subjectCount]+=stdScore[i][j];
				 * stdScore[stdCount][j]+=stdScore[i][j];
				 * stdScore[i][subjectCount+1]=stdScore[i][subjectCount]/3; //평
				 * stdScore[stdCount+1][j]=stdScore[stdCount][j]/stdCount;
				 */
				
			}
			
			
		}
		
	}
	public static void scorecess() {
		//개인별 총점, 개인별 평균, 과목별 총점, 과목별 평균.
		for(int r=0; r<stdCount; r++) { //학생 수 만큼 반복
			for ( int c = 0 ; c < subjectCount; c++) {
				stdScore[r][subjectCount]+=stdScore[r][c]; // 개인별 총점 누적
				stdScore[stdCount][c]+= stdScore[r][c];
			}
			stdScore[r][subjectCount+1]= stdScore[r][subjectCount]/ subjectCount;
		}
		for (int c =0; c<subjectCount ; c++) {
			stdScore[stdCount+1][c]=stdScore[stdCount][c]/stdCount;
		}
		scoreRank();
	}
	public static void scoreRank() {
		for(int s=0;s<stdCount;s++) { //0,1,2 ... stdcount-1
			//r 위치 = 기준 점수
			for(int r=0;r<stdCount;r++) {
				if(stdScore[r][subjectCount]>stdScore[s][subjectCount]) {
					stdScore[s][subjectCount+2]++;
				}
			}
			stdScore[s][subjectCount+2]++;
		}
		
	}
	
	
	public static void printArr() {
		
		for (int r = 0; r<stdScore.length;r++) {
			if(r<stdName.length) {
				System.out.printf("%10s\t",stdName[r]);
			} else if(r==stdCount){
				System.out.printf("%10s\t","과목별 총점");
			} else if(r==stdCount+1) {
				System.out.printf("%10s\t","과목별 평균");
			}
			for (int c = 0; c<stdScore[r].length;c++) {
				System.out.print(stdScore[r][c]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			setData();
			scorecess();
			printArr();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
