package Queue;

public class ListQueue {
	private class Node {
		private Object data;
		private Node nextNode;

		Node(Object data) {
			this.data = data;
			nextNode = null;
		}
	}

	private Node front;
	private Node rear;

	public ListQueue() {
		this.front = null;
		this.rear = null;
	}

	public boolean empty() {
		return (front == null);
	}

	public void insert(Object data) {
		Node newNode = new Node(data);
		newNode.nextNode = null;
		if (empty()) {

			rear = newNode;
			front = newNode;

		}else{
			rear.nextNode = newNode;
			rear = newNode;	
		}
	}
	
	public Object peek() {
		return front.data;
	}
	
	public Object pop() {
		Object o=front.data;
		front=front.nextNode;
		return o;
	}
}
