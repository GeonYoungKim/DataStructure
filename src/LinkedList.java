
public class LinkedList {
	private Node head;
	private Node tail;
	private int size=0;
	
	
	private class Node {
		private Object data;
		private Node next;
		
		public Node(Object data){
			this.data=data;
			this.next=null;
			
		}
	}
	
	public void addFirst(Object data) {
		Node node=new Node(data);
		
		node.next=head;
		head=node;
		size++;
		if(head.next==null) {
			tail=head;
		}
	}
	

}
