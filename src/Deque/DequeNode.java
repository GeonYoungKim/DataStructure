package Deque;

public class DequeNode {
	char data;
	DequeNode left;
	DequeNode right;
	
	public DequeNode() {
		this.left=null;
		this.right=null;
	}
	
	public DequeNode(char c) {
		this.data=c;
		this.left=null;
		this.right=null;
	}
}
