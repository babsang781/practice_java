import java.util.Iterator;

public class Exam03 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int num = 21;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
