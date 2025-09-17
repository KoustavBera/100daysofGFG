// move_all_zeroes_to_end.java
public class move_all_zeroes_to_end {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
		pushZerosToEnd(arr);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	private static void pushZerosToEnd(int[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[k] = arr[i];
				k++;
			}
		}
		while (k++ < arr.length - 1) {
			arr[k] = 0;
		}

	}
}
