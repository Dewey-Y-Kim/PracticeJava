package Jv04_DataStructure;

import java.util.Scanner;

import Jv04_DataStructure.Jv01_Stack.EmptyIntStackException;
import Jv04_DataStructure.Jv01_Stack.OverflowIntStackException;

public class Jv01_test {

	public Jv01_test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 스텍 생성
		Jv01_Stack stack = new Jv01_Stack(5);
		
		while(true) {
			System.out.println("현재 데이터 수 :"+stack.size()+", 스텍의 크기 :"+stack.capacity());
			System.out.println("1) Push  2) Pop  3) Peek  4) Dump  5) Search  6) clear  7) Information  8)remove 0) quit");
			int menu = sc.nextInt();
			
			// menu == 0  quit
			if(menu == 0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			switch(menu) {
			case 1 : // push 데이터 담기
				try {
					System.out.print("* 데이터 값 : ");
					int data = sc.nextInt();
					stack.push(data);
				}catch(OverflowIntStackException oise) {
					System.out.println("*** 스텍이 가득 찼습니다.");
				}
				break;

			case 2 : // pop : 스택에서 마지막 데이터 꺼내기
				try {
					int popData=stack.pop();
					System.out.println("* pop 값은 "+popData+"입니다.");
				}catch(EmptyIntStackException eise) {
					System.out.println("*** 스택이 비었습니다.");
				}
				break;
				
			case 3 : // peek : 스택에서 마지막 데이터를 확인하는 메소드
				try {
					int peekData=stack.peek();
					System.out.println("* 스택의 가장 위의 값은 "+peekData+"입니다.");
				}catch(EmptyIntStackException eise) {
					System.out.println("*** 스택이 비었습니다.");
				}
				break;
			case 4 : // Dump : 스택의 모든 데이터를 출력
				stack.dump();
				break;
			case 5 : // Search
				System.out.println("찾으시는 값 :");
				int data= sc.nextInt();
				int result = stack.indexOf(data);
				if(result >=0) {
					System.out.println(data+"는 "+result+"위치에 있습니다.");
				}else {
					System.out.println(data+"는 스택에 없습니다.");
				}
				break;
			case 6 : // Empty
				stack.clear();
				break;
			case 7 : // Information
				stack.stackInfo();
				//용량
				//데이터 수
				// 스택이 비어있는지 여부
				// 스택이 가득 찼는지 여부
				break;
			case 8 :	
				System.out.print("삭제할 값 :");
				int idx= sc.nextInt();
				boolean delResult=stack.remove(idx);
				System.out.println(delResult?"삭제 되었습니다.":"삭제에 실패하였습니다.");
				break;
			default : System.out.println("잘못 입력 하였습니다.");
			}
			
			
		}
	}
}
