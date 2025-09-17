public class reverse_string_preserving {

	public static void main(String[] args) {
		String s = "internship at geeks for geeks";
		System.out.println(preserveSpace(s));
	}

	private static String preserveSpace(String s) {
		int n = s.length();
		int start = 0, end = n - 1;
		char[] strChar = s.toCharArray();

		while (start < end) {
			if (strChar[start] == ' ') {
				start++;
				continue;
			} else if (strChar[end] == ' ') {
				end--;
				continue;
			} else {
				char temp = strChar[start];
				strChar[start] = strChar[end];
				strChar[end] = temp;
				start++;
				end--;
			}
		}
		return String.valueOf(strChar);
	}
}