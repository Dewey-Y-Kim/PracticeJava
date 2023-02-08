package Jv01_Control;

import java.util.Scanner;

public class Sequence01 {

	public Sequence01() {
		/*
		 * [실행결과]
		 * 15
		 * 1 2 4 7 8  11 13 14 //oddius number 아님.....
		 */
	}
	public void seqPrint(int max) {
		for(int i = 1; i<max; i++) {
			if(i%3!=0 && i%5!=0) {
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		new Sequence01().seqPrint(max);
	}

}
