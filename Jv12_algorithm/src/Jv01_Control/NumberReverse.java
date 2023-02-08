package Jv01_Control;

public class NumberReverse {

	public NumberReverse() {
		// TODO Auto-generated constructor stub
	}
	static void numberReverse(int data) {
		//74747585 -> 58574747
		// 정수형을 역순으로
		char[] ch = Integer.toString(data).toCharArray();
		String re="";
		for (int i = 0 ; i < ch.length; i++) {
			re +=ch[ch.length-1-i];
		}
		int result = Integer.parseInt(re);
		System.out.println(data+"->"+result);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberReverse s = new NumberReverse();
		s.numberReverse(74747585);
	}

}
