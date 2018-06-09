import java.util.ListIterator;

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
	
	public void addLast(Object data) {
		if(size==0) {
			addFirst(data);
		}else{
			Node node=new Node(data);
			Node lastNode=tail;
			lastNode.next=node;
			tail=node;
			size++;
		}
	}
	public Node node(int index) {
		Node node=head;
		
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
	}
	
	public void add(int k,Object data) {
	
		
		if(k==0) {
			addFirst(data);
		}else {
			Node addNode=new Node(data);
			Node beforeNode=node(k-1);
			Node afterNode=beforeNode.next;
			beforeNode.next=addNode;
			addNode.next=afterNode;
			size++;	
			
			if(addNode.next==null) {
				tail=addNode;
			}
		}
		
	}
	public String toString(){
		
		if(head==null) {
			return "[]";
		}
		String result="[";
		
		Node node=head;
		
		while(node.next!=null) {
			result+=node.data+" , ";
			node=node.next;
		}
		result+=node.data;
		return result+"]";
	}
	
	public Object removeFirst() {
		Node node=head;
		Node secondNode=node.next;
		head=secondNode;
		size--;
		Object data=node.data;
		node=null;
		
		return data;
	}
	
	public Object remove(int k) {
		
		if(k==0) {
			return removeFirst();
		}else {
			Node node=node(k-1);
			Node removeNode=node.next;
			node.next=removeNode.next;
			
			Object data=removeNode.data;
			if(removeNode==tail) {
				tail=node;
			}
			removeNode=null;
			size--;
			return data;
		}
	}
	
	public Object removeLast() {
		return remove(size-1);
	}
	
	public int size(){
        return size;
    }
	
	public Object get(int k) {
		Node node=node(k);
		
		return node.data;
	}
	
	public int indexOf(Object data) {
		int index=0;
		Node node=head;
		
		while(node!=tail) {
			if(node.data==data) {
				break;
			}
			node=node.next;
			index++;
			
		}
		
		if(node==tail&&node.data!=data) {
			return -1;
		}
		return index;
	}
	
}
