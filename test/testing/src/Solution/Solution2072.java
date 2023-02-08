package Solution;

import java.util.Scanner;

public class Solution2072 {

	public Solution2072() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=Integer.parseInt(sc.nextLine());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int sum=0;
			String st= sc.nextLine();
			String[] ch =st.split(" ");
			for (int j = 0 ; j<10 ; j++) {
				if (Integer.parseInt(ch[j])%2==1) { 
					sum+=Integer.parseInt(ch[j]);}
			}
			System.out.println("#"+test_case+" "+sum);
		}
	}
}