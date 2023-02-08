package Programers;

import java.util.Arrays;

public class Array_cutting {

	public Array_cutting() {
		// TODO Auto-generated constructor stub
	}
	public int[] solution(int[] numbers, int num1, int num2) {
			int answer[] = new int[num2-num1+1];
			for (int i=num1;i<=num2;i++) {
				answer[i-num1]=numbers[i-1];
			}
			return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t= {1,2,3,4,1,2,3,4,5};
		System.out.println(Arrays.toString(new Array_cutting().solution(t,3,4)));
	}
}


