package Sort;

import java.util.Scanner;

public class InsertSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i < n;i++) {
			int insertNum=arr[i];
			while(i>0&&arr[i-1]>arr[i]){
				arr[i]=arr[i-1];
				arr[i-1]=insertNum;
				i--;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
