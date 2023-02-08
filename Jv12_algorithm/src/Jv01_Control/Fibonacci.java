package Jv01_Control;

import java.util.Scanner;

public class Fibonacci {
	static Scanner sc=new Scanner(System.in);
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void fibo1(){
		int[] fibo = new int[sc.nextInt()];
		fibo[0]= 1;
		fibo[1]= 1;
		for (int i=2; i<fibo.length; i++) {
			fibo[i]=fibo[i-2]+fibo[i-1];
		}
		for(int i=0;i<fibo.length;i++) {
			System.out.printf("%3d  ",i);
			if((i+1)%20==0) {
				System.out.println();
			}
		}
	}
	public static void fibo2(int n) {
		int num1 =0, num2 =1, sum =1;
		for( int i = 0; i<n; i++) {
			System.out.print(sum+" ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		System.out.println();
	}
	static int terminate, k=3;
	public static void fibo3(int i, int j) {
		System.out.print((i + j)+" ");
		if(k==terminate) {
			return;
			} else {
				k++;
				fibo3(j,i+j);
			}
	}
	
	static int fibo4(int n) {
		if (n<=1) {
			return n;
		}else {
			return fibo4(n-2)+ fibo4(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		fibo2(n);
		terminate=n;
		System.out.print(1+" "+1+" ");
		fibo3(1,1);
	}
}
