package Jv04_DataStructure;

public class Jv02_Queue {
	private int max; // 용량
	private int front; // dequeue
	private int rear; // enqueue
	private int num; //데이터의 수
	
	private int queue[]; //queue 처리할 배
	
	public Jv02_Queue() {
		this(10);
	}
	public Jv02_Queue(int capacity) {
		num=front=rear=0;
		max = capacity;
		try {
		queue= new int[max];
		}catch(OutOfMemoryError oome) {
			max=0;
		}
	}
	///////////////////////////////////////////////
	public class QueueOverflowException extends RuntimeException {
		public QueueOverflowException() {
			// overflow exception
		}
	}
	public class QueueEmptyException extends RuntimeException{
		public QueueEmptyException() {
			// empty exception
		}
	}
	//////////////////////////////////////////////
	//enque : 큐의 마지막에 데이터 추가
	public int enque(int data) {
		if(num == max) {throw new QueueOverflowException();}// queue에 여유없을때 예외 발생
		queue[rear++]=data;
		num++;
		if (max == rear) rear=0;		
		return data;
	}
	// deque : 큐의 가장 앞 데이터 꺼내기, 지워짐
	public int deque() {
		if (num == 0) { throw new QueueEmptyException();}
		// front의 값을 구하고 다음 위치 값으로 설정하기 위해 1증가.
		int data=queue[front];
		queue[front]=0; // 사용상으로는 데이터를 초기화시키지는 않음. 지금은 확인용
		front++;
		num--;
		if(front == max) { front = 0; }
		return data;
	}
	// front 위치의 데이터 구함. 값 지워지지 않음
	public int peek() {
		if(num==0) {throw new QueueEmptyException();}
		return queue[front];
	}
	
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public boolean isEmpty() {
		return (num==0)?true:false;
	}
	public boolean isFull() {
		return (num==max)?true:false;
	}
	public int peekLast() {
		if(num==0) {return -1;}
		int t;
		if(rear==0) {t=max-1;} else {t =rear-1;}
		return queue[t];
	}
	public int pollLast() {
		if(num==0) {return -1;}
		int idx=rear-1;
		if (idx<0) {idx= max-1;}
		rear = idx;
		num--;
		return queue[idx];
	}
	public int indexOf(int data) {
		for ( int i=0; i<num; i++) {
			int idx =(front +i) % max;
			if(queue[idx]==data) {return idx;}
		}
		return -1;
	}
	public String datacheck() {
		String str="** [";
		for(int i=0 ; i<queue.length; i++) {
			if(i==rear) {str+="*";}
			if(i==front) {str+="!";}
			str += "queue["+i+"]="+queue[i];
			if(i!=max-1 ) str += ",";
		}
		return str;
	}
	
}
