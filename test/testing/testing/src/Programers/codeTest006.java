package Programers;


public class codeTest006 {

	public codeTest006() {
		// TODO Auto-generated constructor stub
	}

	public static void solution(int numer1, int denom1, int numer2, int denom2) {
		int p,q,numf=0,denomf=0;
		boolean check;
		if(denom1>denom2){
			p=denom1;
			q=denom2;
			check=true;
		} else{
			p=denom2;
			q=denom1;
			check=false;
		}
		int t=0;
		for (int i=1; i<=p;i++){
			if((p*i)%q==0){ t=i; denomf=p*i;break;}
		}
		if(check){
			numf=numer1*t+numer2*(p*t/q);
		}else{
			numf=numer1*(p*t/q)+numer2*t;
		}
		System.out.println(numf);
		a:for(int i=1;i<1000;i++){
			for(int j=2;j<1000;j++){
				if(numf%j==0 &&denomf%j==0){
					numf/=j;
					denomf/=j;
					break;
				}
				if(numf==1||denomf==1||numf<j||denomf<j){break a;}
			}
			if(numf==1||denomf==1){break;}
			
		}
		System.out.println(numf+"+"+denomf);
		//int[] answer = {numf,denomf};
		//return answer;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(1000,3,500,3);
	}

}
