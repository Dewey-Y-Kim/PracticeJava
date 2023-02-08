package testing;


import java.util.Scanner;

public class oddiusNumber {

	public oddiusNumber() {
		// TODO Auto-generated constructor stub
	}
	public String oddiusnum(int i) {
		String t= Integer.toBinaryString(i),answer="not Oddius Number";
		char[] p=t.toCharArray();
		int check=checkOne(p);
		if (check%2 != 0) { 
			answer ="Oddius Number";
		}
		return answer;
	}
	
	public int checkOne(char[] i) {
		int num=0;
		for(char ch :i ) {
			if( ch == '1') {
				num++;
			}
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(3));
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		String answer=new oddiusNumber().oddiusnum(i);
		System.out.println(i+" is "+answer);
		
		
	}
	

}
