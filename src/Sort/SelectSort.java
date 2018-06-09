package Sort;

import java.util.Scanner;

public class SelectSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			int min = arr[i];
			int minIndex = i;
			for (int j = i; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
