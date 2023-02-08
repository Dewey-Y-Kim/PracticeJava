package Programers;

import java.util.Arrays;

public class NotAppeared {

	public NotAppeared() {
		// TODO Auto-generated constructor stub
	}
	public String solution(String s) {
        String answer="";
        String temp[]=s.split("");
        Arrays.sort(temp);
        for(String t:temp) {
        	if(s.indexOf(t)==s.lastIndexOf(t)) {
        		answer += t;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123123";
		StringBuilder str=new StringBuilder(s);
		
		
	}

}
