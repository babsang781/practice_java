package hw211126;

public class Ex211126_01 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = num;
				num++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println("");
		}

	}

}
