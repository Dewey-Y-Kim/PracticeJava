package Jv02_api;

public class MathRandom {

	public static void main(String[] args) {
		// 난수는 0.0보다 크고 1.0보다 작은 실수를 1개 만들어준다.
		
		for(int i=1; i<=100; i++) {
			double ran = Math.random();
			//0~99   ->  난수*(큰값-작은값+1)
			//0~15   ->  
			//  15 -> 0~14   100->0~99     
			//        20~40  난수*(큰값-작은값+1)+작은값
			//                     40-20+1        1~50
			int ranInt = (int)(ran*(50-1+1))+1;
			
			System.out.print(ranInt+"\t");
			if(i%10==0) System.out.println();
		}

	}

}
