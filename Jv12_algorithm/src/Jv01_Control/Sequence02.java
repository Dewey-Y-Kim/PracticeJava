package Jv01_Control;

import java.util.Scanner;

public class Sequence02 {

	public Sequence02() {
/*
9
         *
        **
       ***
      ****    
     *****
    ******
       *
       *
       *
**********
*/
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		for(int i=0; i<p ; i++) {
			/*
			for(int j=0;j<p-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			*/
			for (int j=0;j<p;j++) {
				String t=" ";
				if (j>=p-i-1) { 
					t="*";
				}else {
					t= " ";
				}
				System.out.print(t);
			}
			System.out.println();
		}
		sc.close();
	}
	
}
