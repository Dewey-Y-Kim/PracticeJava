package Jv03_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchSeque {

	public SearchSeque() {
		// TODO Auto-generated constructor stub
	}
	public static int ran(int i) {
		return (int)((Math.random()*(i-1)) +1);
	}
	//while문을 이용하여 선형 검색
	public static int linear(int[] arr,int n,int key) {
		//배열에서 key값을 찾아 index를 리턴하고, 찾는 값이 없으면 -1을 리턴한다.
		int i = 0;
		while(true) {
			if(i==n) {
				return -1;
			}
			if(arr[i] == key) { //key의 값과 	i번째 index값이 같으면 i리턴
				return i;
			}else 
			i++;
		}
	}
	public static int linear2(int[] arr,int n,int key) {
		for(int i=0;i<n;i++) {
			if(arr[i]== key) {
				return i;
			}
		}
		return -1;
	}
	public static int bins(int[] arr,int n,int key) {
		//검색 범위의 시작 index
		int pl =0;
		int pr =n-1;
		for (int i:arr) {
			System.out.print(i+"  ");
		}
		do {
			int t=((pl+pr)/2);
			if(arr[t]==key) {
				return t;
			}else if(arr[t]>key) {
				pr=t-1;
			}else {
				pl=t+1;
			}
			
		}while(pl<=pr);
		return -1;
	}
	public static int binery(int[] arr, int key) {
		return binery(arr, 0, arr.length, key);
	}
	public static int binery(int[] arr,int i, int j, int key) {
		
		int t= (i+j)/2;
		
		if(i>j)  {
			return -1; 
		}
			
		if (key < arr[t]) {t= binery(arr,i,t-1,key);}
		else if(key == arr[t]) {
			return t;
			} else if(key>arr[t]){
				t= binery(arr,t+1,j,key );
		}
		return t;

	} 
	public static void main(String[] args) {
		// 요소수 입력 받아 난수 생성후 searching algorithm
		Scanner sc = new Scanner(System.in);
		System.out.println("난수 범위");
		int t = sc.nextInt();
		System.out.println("개체 수");
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=new SearchSeque().ran(t);
			
		}
		System.out.println("검색할 값 : ");
		int key=sc.nextInt();
		int idx = linear(arr, n, key);
		for (int i : arr) {
			System.out.print(i+"  ");
		}
		
		if(idx == -1) {System.out.println("찾는 값이 없습니다.");
		}else {
			System.out.println("\n검색한 값의 index : "+idx);
		}
		Arrays.sort(arr);
		System.out.println("Binery Serching");
		for (int i:arr) {
			System.out.print(i+"  ");
		}
		idx = binery(arr,key);
		 
		if(idx == -1) {System.out.println("찾는 값이 없습니다.");
		}else {
			System.out.println("\n검색한 값의 index : "+idx);
		}
		idx =binery(arr, 0, arr.length, key);
		if(idx == -1) {System.out.println("찾는 값이 없습니다.");
		}else {
			System.out.println("\n검색한 값의 index : "+idx);
		}
		/*
		idx = bins(arr,n,key);
		System.out.println("\n"+idx);
		if(idx == -1) {System.out.println("찾는 값이 없습니다.");
		}else {
			System.out.println("검색한 값의 index : "+idx);
		} */
	}

}
