package Stack;

public class ListStack {
	private Node top;
	
	private class Node{
		private Object data;
		private Node nextNode;
		
		Node(Object data){
			this.data=data;
			this.nextNode=null;
		}
	}
	
	
	public ListStack() {
		top=null;
	}
	
	public boolean empty() {
		return (top==null);
	}
	
	public void push(Object data) {
		Node newNode=new Node(data);
		newNode.nextNode=top;
		top=newNode;
		
	}
	
	public Object peek() {
		return top.data;
	}
	
	public Object pop() {
		Object o=peek();
		top=top.nextNode;
		return o;
		
		
	}

}
