package Programers;

public class UpperAndLower {

	public UpperAndLower() {
		// TODO Auto-generated constructor stub
	}
	
	public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        for(char c: ch){
        	if(c<='Z') {
        		c+=32; 
        		answer+=c; 
        	}else if( c<='z') {
        		c-=32;
        		answer+=c;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new UpperAndLower().solution("CCCccc"));
	}

}
