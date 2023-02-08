package Jv06_LinkedList;

public class Jv01_LinkedListData<E> {

	class Node<E>{
		private E data;// 현재 데이터
		private Node<E> next; //다음 데이터 포인트
		//생성자 메소드
		Node(E data, Node<E> next){
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E> head; //머리노드를 가질 변수
	private Node<E> ctrl; // 선택노드를 가질 변수
	
	public Jv01_LinkedListData() {
		// 객체 생성싱 머리노드 , 선택노드는 없으므로 null 로 초기화.
		head = ctrl = null;
	}
	//머리에 node 삽입
	public void addFirst(E obj) {
		/*
		 * 머리노드 null List 비어있고
		 * 머리노드 null 이 아니면 현재 노드의 next로 설정
		 */
		Node<E> ptr = head;
		ctrl = new Node(obj, ptr);
		head = ctrl;

	}
	
	//tail 에 node삽입
	public void addLast(E obj) {
		//노드가 없으면
		if (head == null) {
			addFirst(obj);
		} else { //노드가 1개 이상일 때
			Node<E> ptr =head;
			while(ptr.next != null) {
				ptr = ptr.next;
			}
			ctrl = new Node<E>(obj, null);
			ptr.next = ctrl;
		}
	}
	// head node remove
	public void removeFirst() {
		if (head != null) {
			head = ctrl = head.next;
		}
	}
	
	// node p remove
	public void remove(Node p) {
		if (head != null) {
			if (p== head) {
				removeFirst();
			}else {
				Node<E> ptr = head;
				
				while (ptr.next != p ) {
					ptr = ptr.next;
					if (ptr == null) return;
				}
				ptr.next = p.next;
				ctrl = ptr;
			}
		}
	}
	public void remove(Integer i) {
		Node<E>ptr = head;
		while(ptr != null) {
			/*
			if((((Object) ptr.Data.getNo())==i) {
				
			}
			*/
		}
		
	}
	public void removecurrent() {
		remove(ctrl);
	}
	public void dump() {
		Node<E> ptr = head;
		while(ptr != null) { // ptr 가 null이 아니면 노드가 존재한다.
			System.out.println(ptr.data.toString());
			ptr=ptr.next;
		}
		
	}
}
