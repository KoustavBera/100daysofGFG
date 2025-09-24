public class dutchnational {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 0, 1, 2 };
		int n = a.length;

		sort012(a);

		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	static void sort012(int[] arr) {
		int n = arr.length;
		int low = 0, mid = 0, high = n - 1;
		while (mid <= high) {
			// arr[mid] == 0 then swap it with low
			if (arr[mid] == 0) {
				int temp = arr[low];
				arr[low++] = arr[mid];
				arr[mid++] = temp;
			} else if (arr[mid] == 1) {
				// already is 1 just mid++
				mid++;
			} else {

				// mid is 2 swap with
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high--] = temp;
			}
		}
	}
}
