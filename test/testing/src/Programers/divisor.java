package Programers;
import java.util.List;
import java.util.TreeSet;

public class divisor {

	public divisor() {
		// TODO Auto-generated constructor stub
	}
	public Integer[] solution(int n) {
        TreeSet<Integer> al= new TreeSet<>();
        for (int i=1;i*i<=n;i++){
            if(n%i==0){if(i*i!=n){
                al.add(i);
                al.add(n/i);
                }else{
                al.add(i);
            }
                      }
        }
        Integer[] answer=al.toArray(new Integer[0]);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
