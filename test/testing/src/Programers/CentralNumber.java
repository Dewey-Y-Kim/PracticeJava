package Programers;
 import java.util.Arrays;
public class CentralNumber {

	public CentralNumber() {
		// TODO Auto-generated constructor stub
	}
	
	    public int solution(int[] array) {
	        Arrays.sort(array);
	        int answer = array[array.length/2];
	        return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = {1,2,7,10,11};
		System.out.println(new CentralNumber().solution(t));
	}

}
