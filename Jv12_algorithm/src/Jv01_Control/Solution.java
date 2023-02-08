package Jv01_Control;


import java.util.Scanner;

class Solution
{
	static int result=1;
    static void call(int i, int j) {
		result*=i;
		if (j==1) return;
		call(i,j-1);
	}
    public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T=3;
		// T=sc.nextInt();
		System.out.println("시작");
		int re[] =new int[T];
		for(int t = 1; t <= T; t++)
		{
			
     	    String str= sc.nextLine();
     	    System.out.println(str);
     	    String st[]=str.split(" ");
			int i = Integer.parseInt(sc.next());
			int j = Integer.parseInt(sc.next());   
			result=1;
			call(i,j);
			re[t-1]= result;
			
		}
		for(int t=1; t<=T;t++) {
			System.out.println("#"+t+" "+re[t-1]);
		}
	}
	
}