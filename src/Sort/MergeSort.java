package Sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
		int[] sorted = new int[arr.length];
		mergeSort(arr, 0, arr.length - 1, sorted);

		for (int i = 0; i < sorted.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void mergeSort(int[] arr, int left, int right, int[] sorted) {

		int mid = (left + right) / 2;

		if (left < right) {
			mergeSort(arr, left, mid, sorted);
			mergeSort(arr, mid + 1, right, sorted);
			merge(arr, left, mid, right, sorted);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right, int[] sorted) {
		int i = left;
		int j = mid + 1;
		int k = left;

		while (i <= mid && j <= right) {
			if (arr[i] < arr[j]) {
				sorted[k++] = arr[i++];
			} else {
				sorted[k++] = arr[j++];
			}
		}

		while (i <= mid) {
			sorted[k++] = arr[i++];
		}
		while (j <= right) {
			sorted[k++] = arr[j++];
		}
		for (int q = left; q <= right; q++) {
			arr[q] = sorted[q];
		}
	}

}
