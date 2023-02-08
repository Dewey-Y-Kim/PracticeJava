package Jv04_DataStructure;

import java.util.Scanner;

public class Jv02_test {

	public Jv02_test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//queue 생성하기
		Jv02_Queue que = new Jv02_Queue(5);
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("1) enque  2) deque  3) peek  4) dump  5) data check  6) IndexOf  0) quit");
			int menu=sc.nextInt();
			if(menu==0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			switch(menu) {
			case 1 : //enqueue : 데이터를 큐의 끝에 추가하기
				try {
				System.out.println(" input data : ");
				int inData = sc.nextInt();
				que.enque(inData);
				}catch(Jv02_Queue.QueueOverflowException qoe) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
			case 2 : 
				try{
					int outData = que.deque();
					System.out.println("Deque : "+outData);
				}catch(Jv02_Queue.QueueEmptyException qee) {
					System.out.println("데이터가 없습니다.");
				}
				break;
			case 3 :
				try {
					System.out.println("Queue의 가장 앞 값 : "+que.peek());
				}catch(Jv02_Queue.QueueEmptyException qee) {
					System.out.println("데이터가 없습니다.");
				}
				break;
			case 4 : // 큐의 용량-capacity()/데이터의 수:/큐가 비어있는지/ 가득찼는지/큐의 제일 마지막 데이 
				try {
				System.out.println("용 량 : "+que.capacity());
				System.out.println("개체수 : "+que.size());
				System.out.println("큐는 "+(que.isEmpty()?"비어있습니다":"비어있지 않습니다."));
				System.out.println("큐는 "+(que.isFull()?"가득찼습니다.":"가득 차지 않았습니다."));
				System.out.println(que.peekLast() ==-1? "큐가 비어있습니다.":("마지막 데이터는 "+que.peekLast()+"입니다."));
				System.out.println("마지막 데이터 : "+que.pollLast());
				}catch(Jv02_Queue.QueueEmptyException qee) {
					System.out.println("데이터가 없습니다.");
				}
				
				
			
				break;
			case 5 : 
				System.out.println(que.datacheck());
				break;
			case 6 :
				System.out.println(" 찾을 값: ");
				int searchData = sc.nextInt();
				int idx = que.indexOf(searchData);
				System.out.println(idx==-1?searchData+"가 없습니다.":idx+"위치에 "+ searchData + "가 있습니다.");
				break;
			default : System.out.println("메뉴를 잘못 선택하였습니다.");
			}
		}
	}
}
