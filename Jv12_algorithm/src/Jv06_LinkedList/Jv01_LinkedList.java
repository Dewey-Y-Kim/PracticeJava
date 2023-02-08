package Jv06_LinkedList;

import java.awt.List;
import java.util.Scanner;

public class Jv01_LinkedList {

	public Jv01_LinkedList() {
		// TODO Auto-generated constructor stub
	}
	static class Data{
		private Integer no;
		private String name;
		
		Data(){
		}
		
		public Integer getNo() {
			return no;
		}
		public void setNo(Integer no) {
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "[no=" + no + "], name=[" + name + "]";
		}
		
		
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu;
		Data data;
		Jv01_LinkedListData<Data> list = new Jv01_LinkedListData<>();
		
		// 메뉴 만들기
		do {
			String[] s= {"head에 node 삽입","tail에 node 삽입", "head node 삭제","선택 노드 삭제","모든 노드 출력", "종료?  ->"};
			for( int i = 0; i< s.length; i++) {
				System.out.printf("%2d)%10s\t",i+1, s[i]);
			}
			
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu){
				case 1:
					System.out.println("insert head node");
					
					data=  new Data();
					System.out.print("번호 입력 : ");
					data.setNo(Integer.parseInt(sc.nextLine()));
					System.out.print("이름 입력 : ");
					data.setName(sc.nextLine());
					
					//
					list.addFirst(data);
					break;
				case 2:
					System.out.println("꼬리에 노드 추가하기");
					data = new Data();
					System.out.print("번호 입력 : ");
					data.setNo(Integer.parseInt(sc.nextLine()));
					System.out.print("이름 입력 : ");
					data.setName(sc.nextLine());
					list.addLast(data);
					break;
				case 3: 
					list.removeFirst();
					break;
				case 4:
					/*
					 * System.out.println("노드 선택");
					 * list.remove(Integer.parseInt(sc.nextLine()));
					 */
					list.removecurrent();
					
					
				case 5:
					list.dump();
					break;
				default :
						
			}
		
		}while(true);
	}
}
