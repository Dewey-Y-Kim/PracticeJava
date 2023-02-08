package Programers;

public class SameCharacterRemove {

	public SameCharacterRemove() {
		// TODO Auto-generated constructor stub
	}
	public String solution(String my_string) {
        StringBuilder solution = new StringBuilder(my_string);
        for(int i=0;i<solution.length();i++){
            for(int j=i;j<solution.length();j++){
            	if(j!=i && solution.charAt(i)==solution.charAt(j)){
                    solution.deleteCharAt(j);
                    j--;
                }
            }
        }
        return solution.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SameCharacterRemove().solution("people"));
	}

}
