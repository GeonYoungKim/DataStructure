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
		array[start] = array[count];
		array[count] = 0;
		count--;

		while (true) {
			if (array[start] > array[start * 2] && array[start] > array[start * 2 + 1]) {
				break;
			} else if (array[start] > array[start * 2]) {
				swap(start, start * 2);
				start = start * 2;
			} else {
				swap(start, start * 2 + 1);
				start = start * 2 + 1;
			}

		}
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
