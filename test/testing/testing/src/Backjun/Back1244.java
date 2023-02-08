package Backjun;

import java.util.Scanner;

public class Back1244 {

	public Back1244() {
		// TODO Auto-generated constructor stub
	}
	static int array[];
	
	public static void changeArr(int n) {
		
		if (array[n]== 1) {
			array[n]=0;
		}else if (array[n]==0) {
			array[n]=1;
		}
	}
	
	public static void male(int n) {
		for(int i=1; n*i-1<array.length;i++) {
			changeArr(n*i-1);
		}
	}
	
	public static void female(int n) {
		n--;
		
		if (n<0||n>=array.length) { 
			return;
			}
		
		changeArr(n);
		
		for (int num=1;num<=n;num++) {
			if(n+num>=array.length||n-num<0) {
				return;
				}
				
			if(array[n-num]==array[n+num]) {
				changeArr(n-num);
				changeArr(n+num);
			} else {
				return;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int line=sc.nextInt();
		array = new int[line];
		for(int i=0;i<line;i++) {
			array[i] = sc.nextInt();
		}
		
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int gen = sc.nextInt();
			int sw = sc.nextInt();
			if (gen==1) {
				male(sw);
			}else if(gen==2) {
				female(sw);
			}
		}
		
		for(int i=0; i < array.length; i++) {
			if((i+1)%20==0) {
				System.out.println();
			}
			System.out.print(array[i]+" ");
		}
		
		sc.close();
	} 
}
