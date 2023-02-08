

package Programers;

import java.util.ArrayList;

public class primenum {

	public primenum() {
		// TODO Auto-generated constructor stub
	}


	class Solution {
		public int[] solution(int n) {
			ArrayList<Integer> num=new ArrayList<>();
			if (n%2==0) {
				n=removeNum(n,2);
				num.add(2);
			}
			for (int i=3; i*i<=n; i+=2){
				if( n%i ==0){
					n=removeNum(n,i);
				}
			}
			int[] answer = new int[num.size()];
			for(int i=0; i<num.size();i++) {
				answer[i]=num.get(i);
			}
			String string="asdgadsgsd";
			
			return answer;
		}
	}
	
		
	    public int removeNum(int n, int m){
	        while(n%m==0){
	            n/=m;
	        }
	        return n;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
