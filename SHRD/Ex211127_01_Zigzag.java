package hw211127;

import java.util.Scanner;

public class Ex211127_01_Zigzag {

	public static void main(String[] args) {

		// 지그재그 ㄹ모양으로 N*N 2차원 배열에 숫자 입력하고 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("n 값을 입력하세요 >> ");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("");

			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					cnt++;
					arr[i][j] = cnt;
					System.out.printf(" %2d", arr[i][j]);
				}

			} else {
				for (int j = (n - 1); j >= 0; j--) {
					cnt++;
					arr[i][j] = cnt;
					System.out.printf(" %2d", arr[i][j]);
				}
			}
		}
		sc.close();
	}
}