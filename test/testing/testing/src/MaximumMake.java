import java.util.Arrays;

public class MaximumMake {

	public MaximumMake() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
