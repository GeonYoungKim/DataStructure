package Sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arrs = { 69, 10, 30, 2, 16, 8, 31, 22 };

		quickSort(arrs, 0, arrs.length - 1);
		System.out.println("결과");

		for (int i = 0; i < arrs.length; i++) {
			System.out.println(arrs[i]);
		}
	}

	public static void quickSort(int[] arrs, int left, int right) {

		if (left < right) {
			int pivot = partition(arrs, left, right);
			quickSort(arrs, left, pivot - 1);
			quickSort(arrs, pivot + 1, right);
		}

	}

	public static int partition(int[] arrs,int left,int right) {
		int mid=arrs[(left+right)/2];
		while(left<right) {
			while(arrs[left]<mid) {
				left++;
			}
			while(arrs[right]>mid) {
				right--;
			}
			int temp=arrs[left];
			arrs[left]=arrs[right];
			arrs[right]=temp;
		}
		return left;
	}
}
