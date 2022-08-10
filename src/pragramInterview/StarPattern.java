package pragramInterview;

public class StarPattern {

	public static void main(String[] args) {

		// int[] a={8,6,7,4,5,3,1,2,9};

		int[] a = { 8, 6, 7, 4, 5, 3, 1, 2, 9 };
		int tmp;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;

				}

			}

		}

		for (int k : a) {
		}

	}

}
