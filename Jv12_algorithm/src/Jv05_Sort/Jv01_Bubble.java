package Jv05_Sort;

import java.util.Random;

public class Jv01_Bubble {

	public Jv01_Bubble() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* bubble sort
		 * 두 인접한 요소를 검사하여 정렬하는 방법
		 *	장점
		 *		구현이 쉽다
		 *		이미 정렬된 데이터를 정렬할 때 빠르다
		 *	단점
		 *		다른 정렬에 비해 정렬속도가 느리다
		 *		역순배열을 정렬할때 가장 느리다. 
		 */
		Random ran = new Random();
		int arr[] = new int[10];
		for ( int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(100)+1;
		}
		
		System.out.println("===== 정렬 전 =====");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		
		for (int route = 0; route< arr.length-1; route++) {
			
			for (int i=0; i<arr.length-1-route;i++) {
				if (arr[i] > arr[i+1]) { 
					int temp = arr[i]; 
					arr[i] = arr[i+1]; 
					arr[i+1] = temp;
				}
			}
			System.out.println("\n=== "+(route+1)+"회 정렬 후 ===");
			for (int i : arr) {
				System.out.print(i +"\t");
			}
		}
	}
}
