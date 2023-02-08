package Programers;

public class codeTest_divisors {

	public codeTest_divisors() {
		// TODO Auto-generated constructor stub
	}
	
	public int solution(int n) {
		String s=""; 
        for (int i =1; i*i<=n; i++) {
            if(n%i==0) {
                s=s+i+" ";
                }
        }
    String[] ch= s.split(" ");
    if((int)Math.sqrt(n)==(double)(Math.sqrt(n))) {
            return ch.length*2-1;
        } else {
            return ch.length*2;
        }
	}
	
	public static void main(String[] args) {
	    
	}

}
