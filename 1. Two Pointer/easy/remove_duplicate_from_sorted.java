package easy;

public class remove_duplicate_from_sorted {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int newSize = removeDuplicates(arr);

		for (int i = 0; i < newSize; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int removeDuplicates(int[] arr) {
		int k = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				arr[k] = arr[i - 1];
				k++;
			}
		}
		while (k++ < arr.length - 1) {
			arr[k] = 0;
		}
		return k;
	}
}
