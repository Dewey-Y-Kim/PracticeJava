package Programers;

import java.util.ArrayList;
import java.util.Arrays;

public class StringToSort {

	public StringToSort() {
		// TODO Auto-generated constructor stub
	}
	 public int[] solution2(String my_string) {
	        ArrayList<String> list = new ArrayList<>();
	        for(char c:my_string.toCharArray()) {
	            if (Character.isDigit(c)) {
	                list.add(String.valueOf(c));
	            }
	        }
	        return list.stream().sorted().mapToInt(Integer::parseInt).toArray();
	}
	 
	public int[] solution(String my_string) {
		
		String[] string=(my_string.replaceAll("[A-Za-z]","")).split("");
		Arrays.sort(string);
		int[] answer=new int[string.length];
		for(int i=0;i<string.length;i++) {
			answer[i]=Integer.parseInt(string[i]);
		}
		return answer;
	}
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringToSort().solution("hi12392");
	}

}
