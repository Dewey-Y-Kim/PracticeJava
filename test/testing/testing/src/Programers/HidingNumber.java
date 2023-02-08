package Programers;

import java.util.StringTokenizer;

public class HidingNumber {

	public HidingNumber() {
		// TODO Auto-generated constructor stub
	}
	public int solution(String my_string) {
			int answer=0;
		    StringTokenizer st= new StringTokenizer(my_string.replaceAll("[a-zA-Z]"," ")," ");
		    		
	        while(st.hasMoreTokens()){
	            answer+=Integer.parseInt(String.valueOf(st.nextToken()));
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
