package Programers;

public class NCM {

	public NCM() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int balls, int share) {
		 double answer =1;
			for(int i=balls;i>share;i--) {
	                answer= answer*i/(i-share);
	            }
	     return (int)Math.round(answer);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
