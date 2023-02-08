package Jv01_Control;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonLeap_vertu {

	public CommonLeap_vertu() {
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
	static void startCommonLeaf() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int cnt =Integer.parseInt(br.readLine());
			//년도 입력
			String[] y = br.readLine().split(" ");
			String[] re = new String[cnt]; // cnt == y.length
			//윤년과 평년
			for(int i=0; i<y.length; i++) {
				int year = Integer.parseInt(y[i]);
				if((year%4==0 && year%100 != 0)||year%400 == 0 ) { //윤년
					re[i]="윤년";
				}else { 
					re[i]="평년";
				}
			}
			print(re);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void print(String[] re) {
		for(int i=0 ; i<re.length ; i++) {
			System.out.printf("#%d %s\n", i+1, re[i]);
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		startCommonLeaf();
		
	}
	
}
