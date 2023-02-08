package Jv01_Control;

import java.util.Scanner;

public class Diamond_vertu_1 {
	int num=0;
	public Diamond_vertu_1() {
		// TODO Auto-generated constructor stub
	}
	public void triangle(int max) {
		//int max =9
		for( int i = 1; i<=max; i+=2) {
			//공백출력 (max-i)/2
			for(int s=1; s<=(max-i)/2 ;s++) {// 1-->4
				System.out.print(" ");
			}
			for( int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void triangle2(int max) {
		//int max =9
		for( int i = max-2; i>0; i-=2) {
			//공백출력 (max-i)/2
			for(int s=1; s<=(max-i)/2 ;s++) {// 1-->4
				System.out.print(" ");
			}
			for( int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		new Diamond_vertu_1().triangle(2*t-1);
		new Diamond_vertu_1().triangle2(2*
				t-1);
	}

}
