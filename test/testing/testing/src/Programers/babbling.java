package Programers;

public class babbling {
    public int solution(String[] babbling) {
        int answer = 0;
        int result =0;
	boolean check = false;
	StringBuffer bab=new StringBuffer();
	//aya woo ba ye	
	for(String ba : babbling){
		bab.setLength(0);
		;
		while(bab.length()>1) {
			if(bab.substring(0,3)=="aya"||bab.substring(0,3)=="woo") {
				bab.delete(0, 3);
				}else if(bab.substring(0,2)=="ye"||bab.substring(0,2)=="ba") {
					bab.delete(0, 2);
				}else {
					check=false;
					break;
				}
		}
		if (bab.length()>=1) {
			check=false;
		}
		if (check&&bab.length()==0) {result++;}
		}
	return result;
	}
   public static void main(String[] args) {
    	String s[]={"aya", "yee", "u", "maa", "wyeoo"};
    	int t =new babbling().solution(s);
    	System.out.println(t);
    }
}