package Sort;

import java.util.Scanner;

public class HeapSort {

	public static void heapsort(int[] arr) {
		Heap heap=new Heap();
		
		for(int i=0;i<arr.length;i++) {
			heap.insert(arr[i]);
		}
		//heap.print();
		
		for(int i=arr.length-1;i>=0;i--) {
			int value=heap.delete();
			
			arr[i]=value;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

		
}
