package hw211127;

public class Ex211127_02_Turn90d {

	public static void main(String[] args) {

		int n = 5;
		int[][] arr = new int[n][n];
		int cnt = 0;

		System.out.println("원본");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				cnt++;
				arr[i][j] = cnt;
				System.out.printf(" %2d", arr[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("90도 회전");
		for (int j = (n - 1); j >= 0; j--) {
			for (int i = 0; i < n; i++) {
				System.out.printf(" %2d", arr[i][j]);
			}
			System.out.println("");
		}

	}

}
