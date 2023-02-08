package Jv01_Control;

import java.util.Scanner;

public class recuve {

	public recuve() {
		// TODO Auto-generated constructor stub
	}
	
	static int result=1;
	static void call(int i, int j) {
		result*=i;
		if (j==1) return;
		call(i,j-1);
	}
	
	static int call2(int i, int j) {
		if (j==1) return i;
		return i*call2(i,j-1);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int T = sc.nextInt();
		
		String str= sc.nextLine();
		String st[]=str.split(" ");
		int i = Integer.parseInt(st[0]);
		int j = Integer.parseInt(st[1]);	
		call(i,j);
		System.out.println(result);
		result=1;
		call(i,j);
		System.out.println(result);
		
	}

}
