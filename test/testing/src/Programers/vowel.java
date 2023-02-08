package Programers;

public class vowel {

	public vowel() {
		// TODO Auto-generated constructor stub
	}
	public String solution(String my_string) {
		StringBuilder str= new StringBuilder(my_string);
		for(int i=0;i<str.length();i++) {
			char t=str.charAt(i);
			switch(t){
				case 'a': case 'e': case 'i' : case 'o': case 'u':str.deleteCharAt(i); i--;break;
			}
			
		}
		return str.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new vowel().solution("aaaa"));
	}

}
