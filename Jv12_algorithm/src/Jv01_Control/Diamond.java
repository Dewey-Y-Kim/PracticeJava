package Jv01_Control;

import java.util.Scanner;

public class Diamond {
	int num=0;
	public Diamond() {
		// TODO Auto-generated constructor stub
	}
	
	public void triangle(int t) {
		for(int i=0; i<t ;i++) {
			for(int j=0; j<t*2+1 ; j++) {
				line(i, j, t);
			}
			System.out.println();
		}
		for(int i=t-2; i>=0 ;i--) {
			for(int j = 0 ; j < t*2+1 ; j++) {
				line(i, j,t);
			}
			System.out.println();
		}
	}
	
	public void line(int i, int j,int t) {
		char s;
		if (( j < t - i )||( j > t + i)) {
			s=' ';
		} else {
			s=ch();
			num++;
		}
		System.out.print(s);
	}
	
	public char ch() {
		char ch ='A';
		ch+=(num%26);
		return ch;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		new Diamond().triangle(t);
	}
}