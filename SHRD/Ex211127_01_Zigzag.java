package hw211127;

import java.util.Scanner;

public class Ex211127_01_Zigzag {

	public static void main(String[] args) {

		// ������� ��������� N*N 2���� �迭�� ���� �Է��ϰ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("n ���� �Է��ϼ��� >> ");
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