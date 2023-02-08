package Jv05_Sort;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto_ver_tutor {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	public Lotto_ver_tutor() {
		// Lotto 6/45 treeSet 중복x 정렬 o
		/*
		 * 한게임 하나에 한줄
		 * 마지막 생성 - 중복 x
		 * 게임수 입력
		 * 계속할지 여부 확인
		 * 로또번호 생성
		 * 
		 */
	}
	
	
	public void gameStart() {
		do {
			int cnt = gameCount();
			for (int i=1; i<=cnt; i++) {
				System.out.print( i+"게임 : ");
				createLotto();
				
			}
			if(!endQuestion()) {System.out.println(" 프로그램이 종료되었습니다."); break;}
		}while(true);
	}
	public int gameCount() {
		do {
			try {
				System.out.println("게임 수 : ");
				// int cnt = scan.nextInt();
				String cntstr = scan.nextLine();
				int cnt = Integer.parseInt(cntstr); // 1~10, 38.2, -58, mn
				
				if(cnt>=1 && cnt <=10) { //정상게임수}
					return cnt;
				} else { //범위 벗어남
					System.out.println("게임수는 1~10까지만 가능합니다.");
				}
				
				//게임 수의 최대 최소 범위 확인
			}catch(NumberFormatException nnf) { System.out.println("게임 수는 숫자이어야 합니다.");}
		}while(true);
	}
	
	public void createLotto() {
		// 번호 6개와 마지막 생성된 보너스 번호 1개를 생성
		// 정렬, 중복 검사
		int[] lotto =new int[7];
		int ran = 0;
		for (int i=0;i<7;i++) {
			ran = random.nextInt(45)+1;
			for (int j=0; j<=i ;j++) {
				if(lotto[j]==ran) {
					ran = random.nextInt(45)+1;;
					j=0;
				}
			}
			lotto[i]=ran;
		}
		sort2(lotto);
		for (int i=0; i<6;i++) {
		System.out.printf("%3d\t",lotto[i]);
		}
		System.out.println(", Bonus = "+lotto[6]);
			
		
	}
	public void sort(int[] lotto) {
		for (int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=temp;
					temp=0;
				}
			}
		}
		
		//return lotto;
	}
	public void sort2(int[] lotto) {
		for (int i=0;i<6;i++) {
			int min=i;
			for(int j=i; j<6; j++) {
				if(lotto[j]<lotto[min]) { 
					min=j;
				}
			}
			if(i!=min) {
				int temp=lotto[i];
				lotto[i]=lotto[min];
				lotto[min]=temp;
			}
		}
	}
	public boolean endQuestion() {
		// y, Y :  예
		// n, N : 아니오
		// 그외 다시 질문
		do {
			System.out.println("계속하시겠습니까?(Y or y : 예, n or N: 아니오)?");
			String yn=scan.nextLine();
			if(yn.equalsIgnoreCase("Y")) {//계속
				return true;}else if(yn.equalsIgnoreCase("N")) { return false; }
			} while(true); 
		}

	public static void main(String[] args) {
		Lotto_ver_tutor lotto = new Lotto_ver_tutor();
		lotto.gameStart();
	}
	
}
