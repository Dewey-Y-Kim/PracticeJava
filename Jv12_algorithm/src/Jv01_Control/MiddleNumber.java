package Jv01_Control;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



public class MiddleNumber {
	Scanner sc = new Scanner(System.in);
	public MiddleNumber() {
		/* 
		 * 세개의 정수를 입력 받아 중간값을 출력하라.
		 * 
		 * [실행결과]
		 * 54
		 * 75
		 * 34
		 * 54
		 */
	}
	public void middleNumberSecond() {
		// BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			/* int a= br.read();
			int b= br.read();
			int c= br.read();
			*/
			int a = Integer.parseInt(sc.next());
			int b  = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			if ((b>=a &&a>c) || (c>=a&& a>b)) {
				System.out.println(a);
			}else if((a>b&&b>=c) || (c>b&& b>a)) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void middleNumberFirst() {
		
		TreeSet<Integer> tm = new TreeSet<>();
		for(int i = 0 ; i<3; i++) {
			int t=sc.nextInt();
			tm.add(t);
		}
		tm.pollFirst();
		System.out.println(tm.iterator().next());
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		new MiddleNumber().middleNumberSecond();
		
	}
	
}
