package Jung;

import java.util.Scanner;

public class Jung1291 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int step=1;
			if( s>1&&s<10 &&e>1&&e<10) {
				if(s>=e) {
					step = -1;
					for (int i=1;i<=9;i++) {
						if (s>=e) {
							for(int j=s;j>=e;j+=step) {
								System.out.printf("%d *%2d = %2d   ",j,i,i*j);
							}
							System.out.println();
						}
					}
				}else if(s<e) {
					step = 1;
					for (int i=1;i<=9;i++) {
						for(int j=s;j<=e;j+=step) {
							System.out.printf("%d *%2d = %2d   ",j,i,i*j);
						}
						System.out.println();
					}
				}
				break;
			}else {
				System.out.println("INPUT ERROR!");
			}
		}
		sc.close();
	}
}
			
