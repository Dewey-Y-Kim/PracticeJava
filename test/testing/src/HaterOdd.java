
public class HaterOdd {

	public HaterOdd() {
		// TODO Auto-generated constructor stub
	}
	public int[] solution(int n) {
        int[] answer = {};
        n= (n%2==0)? n/2 :n/2+1;
        for(int i=0; i<n;i++){
            answer[i]=2*i+1;
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
