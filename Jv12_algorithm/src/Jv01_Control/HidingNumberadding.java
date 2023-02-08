package Jv01_Control;

import java.util.ArrayList;
import java.util.HashSet;

public class HidingNumberadding {

	public HidingNumberadding() {
		// TODO Auto-generated constructor stub
	}
	public int solution(String my_string) {
        int answer = 0;
        ArrayList s= new ArrayList();
        String[] str=my_string.split("[azAZ");
        for(int i = 0; i<str.length; i++) {
        	s.add(str[i]);
        }
        for(int i = 0 ; i<s.size(); i++) {
        }
        
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=new HidingNumberadding().solution("aAb1B2cC34oOp");
		System.out.println(i);
		
	}

}
