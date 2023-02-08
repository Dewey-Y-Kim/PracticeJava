package Programers;

public class CutAndArray {

	public CutAndArray() {
		// TODO Auto-generated constructor stub
	}
	public String[] solution(String my_Str, int n) {
		int leng=0;
		if (my_Str.length()%n==0) {
			leng=my_Str.length()/n;
		}else {
			leng=my_Str.length()/n+1;
		}
		String[] answer = new String[leng];
		for(int i=0; i<leng-1;i++) {
			answer[i]=my_Str.substring(i*n,(i+1)*n);
		}
		answer[leng-1]=my_Str.substring((leng-1)*n);
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= new CutAndArray().solution("abc1Addfggg4556b",6);
		for(String t: a) {
			System.out.println(t);
		}
	}

}
