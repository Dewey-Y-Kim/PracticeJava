package Jv01_Control;

import java.util.Random;
import java.util.Scanner;

public class NumberMaches_vertu {

	public NumberMaches_vertu() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		/* 
		 * [처리조건]
		 * 	두자리 수의 난수를 생성하여 맞추는 게임을 작성
		 *  
		 * [처리결과]
		 *  숫자 입력 = 56
		 *  컴퓨터의 수가 더 작습니다.
		 *  숫자 입력 = 24
		 *  컴퓨터의 수가 더 큽니다.
		 *  숫자 입력 = 25
		 *  축하 합니다. 3번만에 맞추셨습니다.
		 *  계속하시겠습니까(Y/y)? 
		 *  
		 */
		Scanner scan = new Scanner(System.in);
		String sign;
		do {
			//난수 생성
			int compute = (int)Math.random()*90+10;
			int cnt = 1;
			do {
				System.out.println("숫자 입력 = ");
				int userin= Integer.parseInt(scan.nextLine());
				
				if(compute > userin) {
					System.out.println("컴퓨터의 숫자가 더 큽니다.");
				} else if(compute <userin) {
						System.out.println("컴퓨터의 숫자가 더 작습니다.");
					} else {
						System.out.println("축하합니다. "+cnt+"번만에 맞추셨습니다.");
						break;
					}
				cnt ++;
			}while(true);
			System.out.println("계속 하시겠습니까? Y/y");
			sign=scan.nextLine();
			
		//}while(!sign.equals("Y")&&!sign.equals("y"));
		}while(sign.equalsIgnoreCase("Y"));
		
	}
}
