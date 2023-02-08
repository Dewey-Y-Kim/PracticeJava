package Jv05_Sort;

public class Jv04_QuickSort {

	public Jv04_QuickSort() {
		// TODO Auto-generated constructor stub
	}
	
	public void quicksort(int[] arr,int left,int right) {
		int pleft=left;// 왼쪽위치
		int pright = right;// 오른쪽 위치
		int pivot = (left+right)/2; //fivot
		
		int midium =arr[pivot];
		do {
			// 왼쪽에서 pivot보다 큰 값 찾기
			while(arr[pleft]<midium) {
				pleft++;
				
			}
			// 오른쪽에서 pivot보다 작은 값 찾기
			while(midium<arr[pright]) {
				pright--;
			}
			//pleft의 값과 pright 값 교환
			if (pleft<= pright) {
				swap( arr, pleft++, pright--);
			}
		}while(pleft<=pright);
		
		//재귀 호출
		if(left<pright) quicksort(arr,left,pright);
		if(pleft<right) quicksort(arr,pleft,right);
		
	}
	
	public void swap(int[] arr,int idx1,int idx2){
		int temp=arr[idx1];
		arr[idx1]= arr[idx2];
		arr[idx2]=temp;
		
	}
	public static void main(String[] args) {
		/* QuickSort :
		 * 중간점 - pivot - 설정
		 * 그룹 나눔 -> pivot ->그룹나눔 -> .... ->그룹크기가 1이면 정렬 종료
		 * 리스트에서 가운데 값을 선택하여 작은것은 왼쪽, 큰것 오른쪽 이동 O(n^2) O (nlogn)
		 */
		int[] arr = new int[10];
		System.out.println("==================== 정렬 전 =======================");
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*99)+1;
		}
		for (int i : arr) {
			System.out.printf("%d  ",i);
		}
		System.out.println();
		new Jv04_QuickSort().quicksort(arr, 0, arr.length-1);
		
		System.out.println("==================== 정렬 후 =======================");
		for (int i : arr) {
			System.out.printf("%d  ",i);
		}
		System.out.println();
	}
}
