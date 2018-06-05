package Queue;

public class ArrayQueue {
	private int front;
	private int rear;
	private int maxSize;
	private Object[] queueArray;
	
	public ArrayQueue(int maxSize) {
		this.maxSize=maxSize;
		queueArray=new Object[maxSize];
		this.front=0;
		this.rear=-1;
	}
	
	public boolean empty() {
		return (front==rear+1);
	}
	
	public boolean full() {
		return (rear==maxSize-1);
	}

	public void insert(Object item) {
		queueArray[++rear]=item;
	}
	
	public Object peek() {
		return queueArray[front];
	}
	
	public Object pop() {
		Object o=peek();
		front++;
		return o;
	}
}
