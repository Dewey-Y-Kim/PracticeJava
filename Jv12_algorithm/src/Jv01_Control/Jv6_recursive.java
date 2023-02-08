package Jv01_Control;

import java.util.Scanner;

public class Jv6_recursive {

	public Jv6_recursive() {
		// TODO Auto-generated constructor stub
	}
	static int result=1;
	public void re(int i, int j){//
		result*=i;
		j-=1;
		if(j==0) return; /// System.out.println();
		else re(i,j);
	}
	public int re2(int i, int j) {
		
		if(j==1) return i;
		
		return i*re2(i,j-1);
	}
	public static void main(String[] args) {
		/* 
		 * 두 수를 입력 받아 거듭제곱을 재귀호출로 구성하라.
		 * [입력]
		 * 5
		 * 3
		 * 125
		 */
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		int j=sc.nextInt();
		new Jv6_recursive().re(i,j);
		System.out.println( result );
		System.out.println( new Jv6_recursive().re2(i,j));
		sc.close();
	}

}
