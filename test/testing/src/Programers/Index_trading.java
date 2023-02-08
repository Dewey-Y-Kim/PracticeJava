package Programers;

public class Index_trading {

	public Index_trading() {
		// TODO Auto-generated constructor stub
	}
	public String solution(String my_string, int num1, int num2) {
        StringBuilder ans = new StringBuilder();
        ans.append(my_string.substring(0, num1));
        ans.append(my_string.charAt(num2));
        ans.append(my_string.substring(num1+1,num2));
        ans.append(my_string.charAt(num1));
        ans.append(my_string.substring(num2+1));
        return ans.toString();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		System.out.println("abcdefghijk");
		System.out.println(new Index_trading().solution("abcdefghijk",1,3));
	}

}
