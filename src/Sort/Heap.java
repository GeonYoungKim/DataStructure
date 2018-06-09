package Sort;

public class Heap {

	
	static int[] arr=new int[1000];
	static int count=0;
	public void insert(int i) {
		count++;
		arr[count]=i;
		int index=count;
		
		while(count>1) {
			if(arr[index]>arr[(index/2)]) {
				int temp=arr[index];
				arr[index]=arr[(index/2)];
				arr[(index/2)]=temp;
				index=(index/2);
			}else {
				break;
			}
		}
	}

	public int delete() {
		int value=arr[1];
		int parent=1;
		int child=2;
		int tmp=arr[count];
		count--;
		
		while(child<=count) {
			if(arr[child]<arr[child+1]) {
				child++;
			}
			if(tmp>=arr[child]) {
				break;
			}
			arr[parent]=arr[child];
			parent=child;
			child=child*2;
			
			
		}
		arr[parent]=tmp;
		
		return value;
	}

	public void print() {
		for(int i=1;i<=count;i++) {
			System.out.println(arr[i]);
		}
		
	}

	

}