package Programers;


public class codeTest003 {

	public codeTest003() {
		// TODO Auto-generated constructor stub
	}
	
	    public String solution(String s) {
	        String answer = "";
	        char[] ch=s.toCharArray();
	        if (s.length()%2==0) {
	        	
	        	answer =answer+ch[s.length()/2-1]+ch[s.length()/2];
	           	}else {
	           		answer=answer+ch[s.length()/2];
	           	}
	        return answer;
	    }
	

	        
	        
	        
	//        return answer;
	    
	
	public static void main(String[] afrgs) {
		/*
		 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
		 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
		 * 재한사항s는 길이가 1 이상, 100이하인 스트링입니다.		 
		 */
		codeTest003 c = new codeTest003();
		System.out.println(c.solution("asedf"));

	}
}
