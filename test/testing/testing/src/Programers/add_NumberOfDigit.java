package Programers;

public class add_NumberOfDigit {

	public add_NumberOfDigit() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int n) {
		int answer =0;
		String[] number=(Integer.toString(n)).split("");
		for(String i:number) {
			answer +=Integer.parseInt(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
	}

}
