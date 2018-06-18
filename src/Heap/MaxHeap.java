package Heap;

import java.util.Scanner;

public class MaxHeap {

	static int[] array = new int[100];
	static int count = 0;

	public static void swap(int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void push(int n) {
		count++;
		int index = count;
		array[count] = n;

		while (index > 1) {
			if (array[index] > array[index / 2]) {
				swap(index, (index / 2));
				index = index / 2;
			} else {
				break;
			}
		}
	}

	public static void pop() {
		int start = 1;
		int tmp=array[start];
		int parent=1;
		int child=2;
		array[start] = array[count];
		array[count] = 0;
		count--;

		while(child<=count) {
			if(array[child]<array[child+1]) {
				child++;
			}
			if(tmp>=array[child]) {
				break;
			}
			array[parent]=array[child];
			parent=child;
			child=child*2;
			
			
		}
		array[parent]=tmp;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			if (n == -1) {
				break;
			}
			array[count + 1] = n;
			count++;
		}
		
		
		push(10);
		pop();
	}
}
