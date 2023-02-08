package Programers;

import java.util.Arrays;

public class SortingString {

	public SortingString() {
		// TODO Auto-generated constructor stub
	}
	public String solution(String my_string) {
        char[] s=(my_string.toLowerCase()).toCharArray();
	    Arrays.sort(s);
	    String answer="";
	    for(char k:s) {
	    answer+=k;
	    }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SortingString().solution("Hello"));
	}

}
