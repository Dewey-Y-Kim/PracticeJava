package Programers;


public class CordingTest003 {

	public CordingTest003() {
		// TODO Auto-generated constructor stub
	}
	 public int[] solution(int num, int total) {
	        // num%2 == 1 --> num/2+1 -> 2*num+ N
	        // num%2 == 0 -->num /2
		 int[] answer=new int[num];
		 int a= total/2-(num-1)/2;
		 for (int i=0;i<num;i++) {
			 answer[i]= a+i;
		 }
		
		 
		 return answer;
	 }

}
