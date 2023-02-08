package Backjun;

import java.util.Scanner;

public class Back1244_VerTu {

	public Back1244_VerTu() {
		// TODO Auto-generated constructor stub
	}
	static Scanner scan= new Scanner(System.in);
	static int arr[];
	// 남
	static void man(int swNum) {
		for ( int i=swNum; i<arr.length;i+=swNum) {
			arr[i] ^= 1; //^ :대입연산
		}
	}
	
	// 여
	static void woman(int swNum) {
		int left=swNum-1;
		int right=swNum+1;
		while(true) {
			/* 브레이크가 걸려야 하는 경우
			 * left가 1보다 작은경우
			 * right가 배열의 길이보다 크거나 같은 경우
			 * left != right 값이 다르면 
			 */
			
			if (left<1 || right>=arr.length) break;
			if (left != right) break;
			//left right 값이 대칭
			left--; 
			right++;
		}
		left++;
		right--;
		for(int i=left;i<=right;i++) {
			arr[i]^=1;
		}
	}
	
	static void switchprint() {
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
			if(i%20==0) {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		// 스위치 갯수 입력
		int n = scan.nextInt()+1;
		arr = new int[n];
		
		for (int i=1; i<=n;i++) {
			arr[i]=scan.nextInt();
		}
		// 학생 수 입력
		int stu = scan.nextInt();
		
		for ( int s=1; s<=stu; s++) {
			int gender = scan.nextInt();// 성별
			int swNum = scan.nextInt();// 스위치 번호
			if (gender == 1) {
				man(swNum);
			} else if(gender == 2) {
				woman(swNum);
			}
		}
		switchprint();
	}

}
