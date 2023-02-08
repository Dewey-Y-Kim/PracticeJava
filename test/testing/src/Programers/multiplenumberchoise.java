package Programers;

import java.util.ArrayList;

public class multiplenumberchoise {

	public multiplenumberchoise() {
		// TODO Auto-generated constructor stub
	}
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> al=new ArrayList<>(0);
        for(int index:numlist){
            if(index%n==0){
                al.add(index);
            }
        }
        int[] answer = new int[al.size()];
        for(int i=0 ; i<al.size();i++){
            answer[i]=(Integer)al.get(i);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
