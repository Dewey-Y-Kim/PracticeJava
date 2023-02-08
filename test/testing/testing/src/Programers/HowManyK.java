package Programers;

public class HowManyK {

	public HowManyK() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int i, int j, int k) {
        int answer = 0;
        String chk = String.valueOf(k);
        for(int s=i; s<=j; s++){
            String[] str= String.valueOf(s).split("");
            for(String st: str) {
            	if(st.equals(chk)) {
            		System.out.println(st);
            		answer++;
            	}
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HowManyK().solution(1,13,1);
	}

}
