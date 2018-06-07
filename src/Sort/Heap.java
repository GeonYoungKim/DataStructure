package Sort;

public class Heap {

	static int[] arr=new int[100];
	static int count=0;
	public void insertHeap(int i) {
		count++;
		arr[count]=i;
		int index=count;
		while(index>1) {
			if(arr[index]>arr[index/2]) {
				int temp=arr[index];
				arr[index]=arr[index/2];
				arr[index/2]=temp;
				index=index/2;
			}else {
				break;
			}
		}
	}

	public int deleteHeap() {
		int parent,child;
		int value=arr[1];
		int tmp=arr[count];
		count--;
		parent=1;
		child=2;
		
		while(child<=count) {
			if(arr[child]<arr[child+1]) {
				child++;
			}
			if(tmp>=arr[child]) {
				break;
			}
			
			arr[parent]=arr[child];
			parent=child;
			child*=2;
		}
		arr[parent]=tmp;
		
		return value;
	}

	
	

}
