package Programers;

public class EvenOddNum {

	public EvenOddNum() {
		// TODO Auto-generated constructor stub
	}
	public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int check : num_list) {
        	if(check%2==0) {
        		answer[0]++;
        	}
        }
        answer[1]=num_list.length-answer[0];
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
