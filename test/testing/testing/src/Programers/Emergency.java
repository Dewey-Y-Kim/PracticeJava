package Programers;
import java.util.Arrays;
public class Emergency {
	public int[] solution(int[] emergency) {
        int[] chk=Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(chk);
        int[] answer=new int[chk.length];
        for(int i=0; i < chk.length; i++) {
        	for(int j=0; j < chk.length; j++) {
        		answer[j]=(emergency[j]<chk[i])? answer[j]-1 : answer[j];
        	}
        }
        for (int i=0; i< chk.length; i++) {
        	answer[i]=Math.abs(answer[i]-1);
        }
        return answer;
	}
	public Emergency() {
		// TODO Auto-generated constructor stub
	}

}
