package Jv05_Sort;

public class Jv03_ArraySelectionSort {
	
	public Jv03_ArraySelectionSort() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		for (int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*99) + 1; 
		}
		
		System.out.println("=========="+"정렬전"+"============");
		for (int i : arr) {
			System.out.printf("%d  ",i);
		}
		System.out.println();
		for ( int i = 0 ; i < arr.length-1 ; i++) {
			int min=i;
			for( int j=i ; j < arr.length ; j++) {
				if( arr[j] < arr[min] ) { 
					min=j;
				}
			}
			if(i!=min) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		
			System.out.println("=========="+i+"차 ============");
			for (int num : arr) {
				System.out.printf("%d  ",num);
			}
			System.out.println();
		}
		System.out.println("=========="+"정렬"+"============");
		for (int i : arr) {
			System.out.printf("%d  ",i);
		}
	}

}
