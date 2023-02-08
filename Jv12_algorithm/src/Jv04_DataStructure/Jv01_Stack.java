package Jv04_DataStructure;

public class Jv01_Stack {
	int stack[]; //null
	int pointer; // 스택의 포인터 - 스택에 쌓여 있는 데이터의 
	int max; //스택의 크기 - 스택에 넣을 수 있는 데이터의 갯수
	public Jv01_Stack() {
		// 배열(스택)의 크기를 선택하지 않는 경우, 20개의 데이터를 저장할 수 있도록 배열 생성
		this(20);
		/*
		try {
		
			stack = new int[20];
			max = 20;
		}catch(OutOfMemoryError omE) {
			max =0; //스택 크기 초기화
		} */
	}
	public Jv01_Stack(int max) {
		try {
			
			stack = new int[max];
			this.max = max;
		}catch(OutOfMemoryError omE) {
			max =0;
		}
	}
	/////////////////////////////////////////////
	
	public class OverflowIntStackException extends RuntimeException {
		// 실행시 overflow Exception class
		public OverflowIntStackException() { }
		// 실행시 비어있는 stack에서 pop()을 하면 발생하는 예외 클래스
	}
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
		
	}
	/////////////////////////////////////////////
	// 데이터의 수
	public int size() {
		return pointer;
	}
	
	// 스택의 크기 : 확보된 메모리의 크기
	public int capacity() {
		return max;
	}
	
	// input data
	public int push(int data) throws OverflowIntStackException {
		//스텍이 overflow일때 데이터를 푸시하면 예외 발생
		if(pointer >= max) {
			throw new OverflowIntStackException();
		}
		return stack[pointer++] = data;
	}
	// pop data
	public int pop() throws EmptyIntStackException {
		if( pointer == 0) {
			throw new EmptyIntStackException();
		}
		return stack[--pointer];
	}
	// data 확인
	public int peek() throws EmptyIntStackException {
		if( pointer == 0) {
			throw new EmptyIntStackException();
		}
		return stack[pointer-1];
	}
	// 정상부터 출력
	public void dump() {
		/*
		if(pointer==0) {
			System.out.println("* []");
		} else {
			System.out.print("*");
			for(int i=pointer-1; i>=0; i--) { //9, 8, 7 .... 0
				System.out.println("["+stack[i]+"]\t");
		}
		return;
		}
		*/
		//[ 8, 9, 0] [] [8]
		String str = "[ ";
		for(int i=pointer-1; i>=0; i--) { //9, 8, 7 .... 0
			str+=stack[i];
			if (i>0) {
				str+=", ";
			}
		}
		str+="]";
		System.out.println(str);
	}
	// 검색
	public int indexOf(int data) {
		for(int i=pointer-1; i>=0; i--) { //9, 8, 7 .... 0
			if(stack[i]==data) {
				return i;
			}
		}
		return -1; // 찾는 값이 없을때.
	}
	// clear - 스택비우기 스택은 포인트를 이용해서 데이터의 위치와 수를 정하므로 
	// point의 값을 초기화하면 된다.
	public void clear() {
		pointer=0;
		return;
	}
	
	public void stackInfo() {
		System.out.println("스택의 용량은 "+capacity()+"입니다.");
		System.out.println("데이터의 수 :" + pointer);
		System.out.println("스택이 "+(isempty()?"비어있습니다.":"비어있지 않습니다."));
		System.out.println("스택이 "+(isfull()?"가득 찼습니다.":"가득 차지 않았습니다."));
	}
	public boolean isempty() {
		return pointer==0? true: false;
	}
	public boolean isfull() {
		return(pointer == max)? true: false;
	}
	public boolean remove(int delData) {
		if(isempty()) {
			return false;
			}else if(indexOf(delData)==0) {
				pointer--;
				return true;
			}
		if(indexOf(delData)==-1) {return false;
		} else {
			pointer--;
			for (int i=indexOf(delData); i<pointer;i++) {
			stack[i]=stack[i+1];
			}
		return true;
		}
	}
	public String toString() {
		String tostr="";
		for (int i=pointer-1 ; i>=0 ; i--) {
			tostr+="["+stack[i]+"]\t";
		}
		return tostr;
	}
}
