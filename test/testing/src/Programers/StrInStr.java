package Programers;

public class StrInStr {

	public StrInStr() {
		// TODO Auto-generated constructor stub
	}
	public int solution(String str1, String str2) {
        int answer = 0;
        String temp ="";
        System.out.println(str1.length()+"+"+str2.length());
        if(str1.length()<str2.length()) { 
        	temp=str1; 
        	str1=str2; 
        	str2 = temp;
        	}
        System.out.println(str1+"+"+str2);
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        boolean t=false;
        a: for(int i = 0 ; i <= ch1.length-ch2.length ; i++) {
        	if(ch2.length==1) {t=true;break a;}
        	if (ch1[i]==ch2[0]) {
        		for (int j=1;j<ch2.length;j++) {
        			if (ch1[i+j]==ch2[j]) {t= true;}else {t=false; break;}
        		}
        		if(t==true)break a;
        	}
        }
	
        if(t) {answer=1;}else{answer=2;}
        return answer;
    }
	public int solution2(String str1, String str2) {
		return str1.contains(str2)? 1 : 2; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new StrInStr().solution("ppprrrogrammers", "ppp"));

	}

}
