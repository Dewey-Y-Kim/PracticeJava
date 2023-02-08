package Jv05_Sort;

public class Jv02_ArrayInsertionSort {

	public Jv02_ArrayInsertionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*
		 * 삽입정렬
		 	* 배열의 모든 요소를 앞에서 부터 차례대로 이미 정렬된 부분과 비교하며, 자신의 위치를 찾아 삽입한다. 
		 */
		int arr[] =new int[10];
		for(int i=0; i<arr.length;i++) {
			arr[i]= (int)(Math.random()*99)+1;
		}
		System.out.println("======== 정렬전 =========");
		for(int i : arr) {
			System.out.print(i+"   ");
		}
		System.out.println();
		
		// insertion sort
		for(int i=1; i<arr.length; i++) { //i : 기준점
			int temp = arr[i];
			int j;
			for(j = i-1 ; j>=0 && temp<arr[j]; j--) {
				arr[j+1]=arr[j];
			}
			//temp보다 j번째 값보다 작으면
			arr[j+1]= temp;
			System.out.println("====== "+i+"차 정렬후 =========");
			
			for(int m:arr) {
				System.out.print(m+"   ");
			}
			System.out.println();
		}
		
		
	}
}
