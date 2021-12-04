package hw3rdWeek;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex211203_MergeArray {

	public static void main(String[] args) {

		int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int[] Merge = mergeArray(A, B);

	}

	public static int[] mergeArray(int[] a, int[] b) {

		int[] merge = new int[(a.length + b.length)];

		for (int i = 0; i < (a.length + b.length); i++) {
			if (i < a.length) {
				merge[i] = a[i];
			} else {
				merge[i] = b[i - a.length];
			}
		}
		
		Arrays.sort(merge);
		
		System.out.print("Merge :");
		System.out.print(Arrays.toString(merge));

		return merge;
	}

}
