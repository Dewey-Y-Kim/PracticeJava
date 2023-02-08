package Programers;

public class HateEnglish {

	public HateEnglish() {
		// TODO Auto-generated constructor stub
	}
	public int solution(String numbers) {
		String[] num= {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for(int i=0;i<10;i++) {
				numbers=numbers.replaceAll(num[i],String.valueOf(i));
		}
		return Integer.parseInt(numbers);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="onetwothreefourfivesixseveneightnine";
		str=str.replaceAll("one", "1");
		System.out.println(str);
		System.out.println(new HateEnglish().solution(str));
	}

}
