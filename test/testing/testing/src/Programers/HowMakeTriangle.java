package Programers;

public class HowMakeTriangle {

	public HowMakeTriangle() {
		/*
		 * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
		 * 삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
		 */
		
	}
	public int solution(int[] sides) {
        int answer=0,l,s;
        if(sides[0]>sides[1]) {
        	s=sides[1];
        	l=sides[0];
        } else {
        	l=sides[1];
        	s=sides[0];
        }
        System.out.println(l+"  "+s);
        for(int i=l-s+1; i<l+s;i++) {
        	System.out.println(i);
        	answer++;
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sides= {1,2};
		System.out.println(new HowMakeTriangle().solution(sides));
	}

}
