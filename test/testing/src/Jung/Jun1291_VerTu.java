package Jung;

import java.util.Scanner;

public class Jun1291_VerTu {

	public Jun1291_VerTu() {
		// TODO Auto-generated constructor stub
	}
	public static void gugudan(int s, int e) {
		if(s>e) {
			for(int i = 1 ; i <= 9 ; i++) {
				for( int d = s ; d >= e ; d--) {
					guguPrint(d, i);
				}
				System.out.println();
			}
		}else {
			for(int i =1 ; i<= 9 ; i++) {
				for(int d=s; d<=e; d++) {
					guguPrint(d,i);
				}
			}
		}
	}
	
	public static void guguPrint(int d, int i) {
		System.out.printf("%d * %d = %2d   ", d, i, d*i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int s = scan.nextInt(); // 시작단
			int e = scan.nextInt(); // 끝 단
			if(s<2 || s>9 || e<2 || e>9) {
				System.out.println();
			}else {
				// 5 3 -> 5 4 3
				// 3 5 -> 3 4 5
				gugudan(s,e);
				break;
			}
		}
	}

}
