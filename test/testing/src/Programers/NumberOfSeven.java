package Programers;

public class NumberOfSeven {

	public NumberOfSeven() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int[] array) {
		int answer=0;
		for(int i:array) {
			String[] str=String.valueOf(i).split("");
			for(String text:str) {
				if(text=="7") answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= new int[];
		
		new NumberOfSeven().solution(array);
	}

}
