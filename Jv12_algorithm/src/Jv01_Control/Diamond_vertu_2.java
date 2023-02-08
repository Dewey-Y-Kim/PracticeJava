package Jv01_Control;

import java.util.Scanner;

public class Diamond_vertu_2 {

	public Diamond_vertu_2() {
		// TODO Auto-generated constructor stub
	}
	// 정수입력
	static int dataIn() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력(1~49)=");
		int max = scan.nextInt();
		if (max%2 == 0 ) {
			max++;
		}
		scan.close();
		return max;
	}
	
	static void diamondPrint(int max) {
		int step = 2;
		char str = 'A';
		for ( int i = 1; i >= 1 ; i+=step) {
			//공백
			for(int j=1;j<=(max-i)/2;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(str++);//다음 문자가 만들어짐
				if(str>'Z') {
					str='A';
				}
			}
			System.out.println();
			if(i==max) {
				step=-2;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamondPrint(dataIn());
	}

}
