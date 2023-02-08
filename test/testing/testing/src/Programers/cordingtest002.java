package Programers;


public class cordingtest002 {

	public cordingtest002() {
		// TODO Auto-generated constructor stub
	}
	class Solution {
	    public String solution(int a, int b) {
	        String answer = "";
	        int i=0;
	        switch(a) {
	        case 12 : i+=30;
	        case 11 : i+=31;
	        case 10 : i+=30;
	        case 9 : i+=31;
	        case 8 : i+=31;
	        case 7 : i+=30;
	        case 6 : i+=31;
	        case 5 : i+=30;
	        case 4 : i+=31;
	        case 3 : i+=29;
	        case 2 : i+=31;
	        default:
	        }
	        switch((i+b)%7){
	        case 0: answer = "THU";break; 
	        case 1: answer = "FRI";break;
	        case 2: answer = "SAT";break;
	        case 3: answer = "SUN";break;
	        case 4: answer = "MON";break;
	        case 5: answer = "TUE";break;
	        case 6: answer = "WED";break;
	        }
	        
	        
	        
	        
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		/*
		 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
		 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
		 * 요일의 이름은 일요일부터 토요일까지 각각 SAT,MON,TUE,WED,THU,FRI,SAT입니다. 
		 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
		 */
		
	}

}
