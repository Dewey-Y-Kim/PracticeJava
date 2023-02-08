import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution2027 {

	public Solution2027() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException  {
		System.setIn(new FileInputStream("src/input (1).txt"));
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int test=sc.nextInt();
			int[] result= new int[101];
			int[] t= new int[1000];
			for(int i = 0 ; i<1000; i++) {
				t[i]=sc.nextInt();
			}
			for(int i=0;i<1000;i++) {
				result[t[i]]++;
			}
			int max=0,maxaddr=0;
			for(int i=0;i<=100;i++) {
				if(result[i]>=max) {max=result[i];maxaddr=i;}
			}
			System.out.println("#"+test_case+" "+maxaddr);
			System.out.println(max);
		}
	}
	
}
