package Jv01_Control;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonLeap {

	public CommonLeap() {
		/*
		 *  년도를 입력받아 윤년과 평년을 구별하여 출력하라.
		 *  첫번째 입력은 입력받을 년도의 개수
		 *  api 사용하지 말것
		 *  
		 *  [처리결과]
		 *  #1 윤년
		 *  #2 평년
		 *  #3 윤년
		 *  #4 윤년
		 *  #5 평년
		 *  #6 윤년
		 *  
		 */
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
		
		int rotation = Integer.parseInt(re.readLine());
		String nums = re.readLine(); 
		String[] numcutted = nums.split(" ");
		for (int i=0; i<rotation; i++) {
			int j= Integer.parseInt(numcutted[i]);
			String result;
			if (j%4==0 && j%100 !=0) { 
				result = "윤년";
			} else if( j%400 == 0) {
				result = "윤년";
			}else { result = "평년";}
			System.out.println("#"+(i+1)+" "+result);
		}
		
	}
	
}
