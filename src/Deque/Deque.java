package Deque;

public class Deque {

	DequeNode front;
	DequeNode rear;

	public Deque() {
		this.front = null;
		this.rear = null;
	}

	public boolean empty() {
		return (front == null);
	}

	public void insertFront(char data) {
		DequeNode newNode = new DequeNode(data);
		if (empty()) {
			front = newNode;
			rear = newNode;
			newNode.right = null;
			newNode.left = null;
		} else {
			newNode.right = front;
			newNode.left = null;
			front.left = newNode;
			front = newNode;
		}
	}

	public char deleteFront() {
		if (empty()) {
			System.out.println("덱이 비어있습니다.");
			return 0;
		} else {
			char data = front.data;
			if (front.right == null) {
				front = null;
				rear = null;
			} else {				
				front = front.right;
				front.left = null;
			}
			return data;
		}

	}
	public void insertRear(char item){
        DequeNode node =  new DequeNode(item);
        if(empty()){
            front = node;
            rear = node;
            node.right = null;
            node.left = null;
        }else{
            node.left = rear;
            node.right = null;
            rear.right = node;
            rear = node;
        }
    }
	public char deleteRear(){
        if(empty()){
            System.out.println("덱이 비어있습니다.");
            return 0;
        }else{
            char data = rear.data;
            if(rear.left==null){
                front = null;
                rear = null;
            }else{
                rear = rear.left;
                rear.right = null;
            }
            return data;
        }
    }
	public char peekRear(){
        if(empty()){
            System.out.println("덱이 비어있습니다.");
            return 0;
        }else{
            return rear.data;
        }
    }
    
    public char peekFront(){
        if(empty()){
            System.out.println("덱이 비어있습니다.");
            return 0;
        }else{
            return front.data;
        }
    }
    public void print(){
        if(empty()){
            System.out.println("덱이 비어있습니다.");
        }else{
            DequeNode node = front;
            while(node!=null){
                System.out.print(node.data + " ");
                node = node.right;
            }
            System.out.println();
        }
    }

}
