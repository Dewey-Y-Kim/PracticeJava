package Programers;

public class MostNearBigNum {

	public MostNearBigNum() {
		// TODO Auto-generated constructor stub
	}
	public int[] Solution(int[] numbers) {
		int[] solution = new int[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			for(int j=i;j<numbers.length;j++) {
				if (numbers[i]<numbers[j]) {
					solution[i] = numbers[j];
					break;
				}
			}
			if(solution[i]==0) solution[i]=-1;
		}
		return solution;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {2, 3, 3, 5};	
		int[] result= new int[numbers.length];
		result=new MostNearBigNum().Solution(numbers);
		for(int i : result) {
			System.out.print(i+"  ");
		}
	}

}
