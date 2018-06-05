package Queue;

public class CircularQueue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];

	public CircularQueue(int queueSize) {
		this.front = 0;
		this.rear = 0;
		this.queueSize = queueSize;
		itemArray = new char[queueSize];
	}

	public boolean empty() {
		return (front==rear);
	}
	
	public boolean full() {
		return((rear+1)%queueSize==front);
	}
	
	public void inqueue(char item) {
		
		if(full()) {
			System.out.println("FULL!!");
		}else {
			rear=(rear+1)%queueSize;
			itemArray[rear]=item;
		}
	}
	
	public char dequeue() {
		if(empty()) {
			System.out.println("EMPTY!!");
			return 0;
		}else {
			front=(front+1)%queueSize;
			return itemArray[front];	
		}	
	}
	public void delete() {
        if(empty()){
            System.out.println("삭제할 큐가 없음");
        }else{
            front = (front+1)%queueSize;
        }
    }
	public char peek() {
        if(empty()){
            System.out.println("큐가 비어있음");
            return 0;
        }else{
            return itemArray[(front+1)%queueSize];
        }
    }

	public void print() {
		int start=front;
		
		while(start!=rear) {
			start=(start+1)%queueSize;
			System.out.println(itemArray[start]+" ");
		}
	}
	
	
}
