package Programers;

public class StringCompute {

	public StringCompute() {
		// TODO Auto-generated constructor stub
	}
	public int solution(String my_string) {
		int answer = 0;
		my_string=my_string.replaceAll(" ","");
		String[] com=my_string.replaceAll("[0-9]","").split("");
		String[] num=my_string.replaceAll("[+-]"," ").split(" ");
		answer+=Integer.parseInt(num[0]);
		for(int i=0;i<com.length;i++) {
			if(com[i].equals("+")) {
				answer+=Integer.parseInt(num[i+1]);
			}else {
				answer-=Integer.parseInt(num[i+1]);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
