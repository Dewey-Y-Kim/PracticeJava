package Jv01_Control;

import java.util.Scanner;

public class NumberMaches {

	public NumberMaches() {
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
		Scanner sc = new Scanner(System.in);
		boolean re =true;
		do {
			int t = (int)((Math.random()*89)+10);

			System.out.println("숫자 입력 = ");
			int tryNum = 0;
			do {
				try {
					int i;
					boolean s = false;
					i = Integer.parseInt(sc.next());
					s=true;
					tryNum++;
					if (t>i) { //t, i 비교
						System.out.println("컴퓨터의 숫자가 더 큽니다.");
					}else {
						if (t<i) {
							System.out.println("컴퓨터의 숫자가 더 작습니다.");
						}else {
							System.out.println("축하합니다. "+tryNum+"번만에 맞추셨습니다.");
							break;
						}
					} //t i 비교 끝
				}catch(NumberFormatException num) {}
				
			}while(true);
			System.out.println("계속 하시겠습니까?");
			String reg = sc.next();
			if( reg.equals('y')||reg.equals('Y')) { }else {break;} 
		}while(true);
		
	}
}
