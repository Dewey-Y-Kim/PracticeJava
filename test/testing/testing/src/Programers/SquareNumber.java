package Programers;

public class SquareNumber {

	public SquareNumber() {
		// TODO Auto-generated constructor stub
	}
	
	public int solution(int n) {
        return (n==(int)(Math.sqrt(n))*(int)(Math.sqrt(n)))? 1: 2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SquareNumber().solution(4));
	}

}
