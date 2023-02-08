package Programers;
import java.util.Arrays;
public class Maximum_2 {

	public Maximum_2() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        if(numbers[0]*numbers[1]<numbers[(numbers.length-1)]*numbers[numbers.length-2]) {
        answer=numbers[numbers.length-1]*numbers[numbers.length-2];
        }else{
        answer= numbers[0]*numbers[1];
        }
        
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
