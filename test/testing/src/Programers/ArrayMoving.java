package Programers;
import java.util.ArrayList;
public class ArrayMoving {

	public ArrayMoving() {
		// TODO Auto-generated constructor stub
	}
	public int[] solution(int[] numbers, String direction) {
        int leng=numbers.length;
        ArrayList<Integer> al= new ArrayList<>();
        for(int i:numbers){
            al.add(i);
        }
        switch(direction){
            case "left" : al.remove(0);al.add(numbers[0]);break;
            case "right" : al.remove(leng-1);al.add(0,numbers[leng-1]);break;
        }
        int[] answer=new int[leng];
        for(int i=0;i<numbers.length;i++) {
        	answer[i]=al.get(i);
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
