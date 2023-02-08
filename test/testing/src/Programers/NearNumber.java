package Programers;

import java.util.Arrays;

public class NearNumber {

	public NearNumber() {
		// TODO Auto-generated constructor stub
	}
	static int repeat=1;
	public int solution(int[] array, int n) {
		int answer = 0;
		Arrays.sort(array);
		int differ = Math.abs(n-array[0]),idx=0;
		
		
		for ( int sol = 1; sol < array.length; sol++){
			if (Math.abs(n-array[sol]) < differ) {
				differ = Math.abs(n-array[sol]);
				idx=sol;
			}
		}
		return array[idx];
	}
	
		
		
		
		
		/*
     *  int answer = 0;
        Arrays.sort(array);
        int t=0;
        if(array[0]>n) {
        	return array[0];
        	}else if(array[array.length-1]<n) {
        		return array[array.length-1];
        	}else{
        		t=searchNum(array,n,0,array.length-1,1);
        	}
        if (n<array[t-1]) {
        	answer =array[t-1];
        } else if (n>array[t-1]&& n<array[t]) {
        	answer = (2*n-array[t-1]-array[t]>0)? array[t]:array[t-1];
        } else if (n>array[t] && n<array[t+1]) {
        	answer = (2*n-array[t]-array[t+1]>0)? array[t+1]: array[t];
        } else answer = array[t+1];
        
        return answer;	  
	}
    
	public int searchNum(int[] array,int n,int i,int j,int k) {
		
		if(array[(i+j)/2]<n && array[(i+j)/2+1]>n){ return (i+j)/2;
		}else if (n> array[(i+j)/2+1]) {
			searchNum(array, n, (i+j)/2+2, j, 2*k);
		}else {
			searchNum(array, n, i, (i+j)/2-1,2*k);
			}
		return (int)(i+j)/2;
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {15, 11, 13};
		System.out.println(new NearNumber().solution(a,14));
	}

}
