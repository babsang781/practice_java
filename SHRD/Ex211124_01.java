package hw211124;

import java.util.Scanner;

public class Ex211124_01 {

	public static void main(String[] args) {

		// N,X �� �Է¹޴´�.
		// N ���� ������ �Է� �޴´�.
		// X ���� ���� ���� ����Ѵ�.

		// N,X �� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N �Է� >> ");
		int N = sc.nextInt();
		System.out.print("X �Է� >> ");
		int X = sc.nextInt();
		
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print((i + 1) + "��° ���� �Է� >>");
			array[i] = sc.nextInt();
		}

		System.out.print("��� >> ");
		for (int i = 0; i < N; i++) {
			if (array[i] < X) {
				System.out.print(array[i] + " ");
			}

		}
	}

}
