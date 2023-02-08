package Programers;

public class TDArray {

	public TDArray() {
		// TODO Auto-generated constructor stub
	}
	 public int[][] solution(int[] num_list, int n) {
	        
	        int[][] answer = new int[num_list.length/n][n];
	        for(int i=0;i<num_list.length;i++){
	            answer[i/n][i%n] = num_list[i];
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = {1, 2, 3, 4, 5, 6, 7, 8};
		new TDArray().solution(t,2);
	}

}
