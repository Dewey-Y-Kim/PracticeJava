package Programers;

public class AddingBinery {

	class Solution {
	    public String solution(String bin1, String bin2) {
	    	String answer;
	    	if(bin1.length()>bin2.length()){ 
	    		//자리수 맞추기 자리수 차이만큼 작은 숫자 앞에 0붙이기
	    		int t=bin1.length()-bin2.length();
	    		setnum(bin2, t);
	    	} else if(bin1.length()<bin2.length()){
	    		int t=bin2.length()-bin1.length();
	    		setnum(bin1, t);
	    	}
	    	
	    	String[] str1 = bin1.split("");
	    	String[] str2 = bin2.split("");
	    	String[] str3 = new String[str1.length];
	    	
	    	for(int i=0; i<str1.length;i++) {
	    		str3[i]=adder(str1[i],str2[i]);
	    	}
	    	answer=check(str3);
	    	return answer;
	    }
	    public String[] check(String[] str) {
	    	StringBuilder result=new StringBuilder(0);
	    	for(int i=str.length-1;i>=1;i--) {
	    		switch(str[i]) {
	    		case "c":result.append(0);if(str[i-1]=="1") else{str[i-1]="c";
	    		}
	    	}
	    	
	    	String re="";
	    	for(String i:result) {
	    		re+=i;
	    	}
	    	return re;
	    }
	    public String adder(String i, String j){
	    	if(i.equals(j)){
	    		if (i.equals("1")) {
	    			return "c";
	    		} else {
	    			return "0";
	    		}
	    	}else {
	    		return "1";
	    	}
	    }
	    
	}
	public String setnum(String bin, int num){//자리수 맞추기위해 앞에 0추가
		String str = "";
		for (int i=0;i<num;i++){
			str+="0";
		}
		str+=bin;
		return str;
	}
}
	