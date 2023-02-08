
public class CtrlZ {

	public CtrlZ() {
		// TODO Auto-generated constructor stub
	}
	public int solution(String s) {
		int answer=0;
		String[] str=s.split(" ");
		for (int i=0; i < str.length; i++) {
			System.out.println(str[i]);
			if(str[i].equals("[0-9]")){
				answer = answer + Integer.parseInt(str[i]);
			}
			if(str[i]=="Z"){ 
				answer= answer - Integer.parseInt(str[i-1]); 
				
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1 2 Z 3";
		System.out.println(new CtrlZ().solution(s));
	}

}
