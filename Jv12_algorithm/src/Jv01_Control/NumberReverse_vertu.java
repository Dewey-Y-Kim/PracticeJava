package Jv01_Control;

public class NumberReverse_vertu {

	public NumberReverse_vertu() {
		// TODO Auto-generated constructor stub
	}
	static void numberReverse(int data) {
		// 방법 1 api 클래스 이용
		StringBuilder sb = new StringBuilder(String.valueOf(data));
		sb.reverse();
		System.out.println(Integer.parseInt(sb.toString())+ 0);

	}
	
	static void numberReverseArray(int data) {
		//방법 2 배열이용
		numberReverseArray(String.valueOf(data));
		
	}
	static void numberReverseArray(String data) {
		//배열로
		char[] c = data.toCharArray();
		for (int i=0; i<(c.length)/2; i++) {
			//배열 교환 i <-> c.length-1-i
			char temp = c[i];
			c[i]=c[c.length-1-i];
			c[c.length-1-i]=temp;
		}
		System.out.println(String.valueOf(c));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열
		numberReverse(86152);
		//클래스
		numberReverseArray(48285);
		numberReverseArray("asdgh");
		/*
		 * 숫자 -> 문자 : String.valueOf  , 123+"" 
		 * 문자 -> 숫자 : Integer.parse()
		 */
		
		
	}

}
