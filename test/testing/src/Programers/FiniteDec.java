package Programers;

public class FiniteDec {

	public FiniteDec() {
		// TODO Auto-generated constructor stub
	}
	class Solution {
	    public int solution(int a, int b) {
	        int answer = 0;
	        b= b/rutine(a,b);
	        b= removeFive(b);
	        b= removeTwo(b);
	        if(b==1){
	            return 1;
	        } else{
	            return 2;
	        }
	    }
	    
	    public int rutine(a,b) {
	        if( a%b ==0) retrun b;
	        rutine(b,a%b);
	    }
	    
	    public int removeFive(b){
	        if(b%5==0) removefive(b/5);
	        return b;
	    }
	    
	    public int removeTwo(b){
	        if(b%2==0) removeTwo(b/2);
	        return b;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
