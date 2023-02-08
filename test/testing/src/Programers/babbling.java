
package Programers;

import java.util.Arrays;

public class babbling {
    public int solution(String[] babbling) {
            int answer =0, check =0; 
            for (String str: babbling) {
   				int leng= str.length();
   				while(leng>0) {
   					switch(str.charAt(0)){
   						case 'a': 
   							if(cutFirst(str,3)=="aya") {
   								answer =1;
   								str=cutLast(str,3);
   								leng -=3;
   								break;
   							}else { answer=0;}
   						case 'w': 
   							if(cutFirst(str,3)=="aya") {
   								answer =1;
   								str=cutLast(str,3);
   								leng -=3;
   								break;
   							}else { answer=0;}
   						case 'm': 
   							if(cutFirst(str,3)=="aya") {
   								answer =1;
   								str=cutLast(str,3);
   								leng -=3;
   								break;
   							}else { answer=0;}
   						case 'y':
   							if(cutFirst(str,3)=="aya") {
   								answer =1;
   								str=cutLast(str,3);
   								leng -=3;
   								break;
   							}else { answer=0;}
   						default : leng=0;
   					}
   				}
            	
            	}
            return answer;
            }
    public int checkStr(String str, String check) {
    	if(cutFirst(str,3)=="aya") {
				answer =1;
				str=cutLast(str,3);
				leng -=3;
				break;
			}else { answer=0;}
    }
    
    public String cutFirst(String str,int num) {
		char[] charArray=str.toCharArray();
		char[] spell= new char[num];
		for(int i=0;i<num;i++) {
			spell[i]=charArray[i];
		}
		return String.valueOf(spell);
	}
	public String cutLast(String str, int num) {
		char[] charArray=str.toCharArray();
		char[] spell=new char[str.length()-num];
		for(int i=num-1;i<str.length()-1;i++) {
			spell[i-num+1]=charArray[i];
		}
		return String.valueOf(spell);
	}    
 
    public static void main(String[] args) {
    	//String s[]={"aya", "yee", "u", "maa", "wyeoo"};
    	
    	//int t =new babbling().solution(s);
    	//System.out.println(t);
    	String s="wyeoggasdgao";
    	System.out.println(cutFirst(s,3));
    	System.out.println(cutLast(s,3));
    	}
    
	
}