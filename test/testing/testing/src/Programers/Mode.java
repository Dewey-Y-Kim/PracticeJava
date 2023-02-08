package Programers;

import java.util.Arrays;

public class Mode {

	public Mode() {
		// TODO Auto-generated constructor stub
		
	}
	
	public int solution(int[] array) {
		int answer = 0;
		int[] arr= new int[1000];
		for(int n:array){
			arr[n]++;
		}
		int max=0,sec =0;
		for (int i=0;i<1000;i++) {
			if(arr[i]>=arr[max]) {
				sec=max;
				max=i;
			}
		}
		if(arr[max]!=arr[sec]) {
			answer=max;
		} else {
			answer= -1;
		}
		return answer;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,1,2,1,2,2};
		System.out.println(new Mode().solution(array));
	}

}
