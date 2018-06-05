package Stack;

public class ArrayStack {
	private int top;
	private int maxSize;
	private Object[] stackArray;

	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new Object[maxSize];
		this.top = -1;
	}

	public boolean empty() {
		return (top == -1);
	}

	public boolean full() {
		return (top == maxSize - 1);
	}

	public void push(Object item) {
		if (full()) {
			System.out.println("FULL!!!!");
			return;
		}
		top++;
		stackArray[top] = item;

	}
	
	public Object peek() {
		return stackArray[top];
	}
	
	public Object pop() {
		
		Object o=stackArray[top];
		top--;
		
		return o;
	}
}
