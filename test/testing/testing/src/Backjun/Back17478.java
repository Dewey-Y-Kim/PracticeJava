package Backjun;

import java.util.Scanner;

public class Back17478 {

	public Back17478() {
		// TODO Auto-generated constructor stub
	}
	static int repeatNum,num=0,dest=0;
	public static void printstr(String str) {
		for (int i=0;i<(num)*4; i++) {
			System.out.print("_");
		}
		System.out.println(str);
	}
	public static void rec() {
		if(dest ==0 ) {
			printstr("\"재귀함수가 뭔가요?\"");
			printstr("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
			printstr("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
			printstr("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
			num++;
			if(repeatNum>num&&dest==0) {
				rec();
			}
		}
		if(dest==0) {
			printstr("\"재귀함수가 뭔가요?\"");
			printstr("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			printstr("라고 답변하였지.");
		}
		dest=1;
		num--;
		if(dest==1) {
			printstr("라고 답변하였지.");
			if(num==1) {
				dest=2;
			}
		}
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		repeatNum= sc.nextInt();
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		rec();
	}
}
