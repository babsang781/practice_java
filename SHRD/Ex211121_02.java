package hw211121;

import java.util.Scanner;

public class Ex211121_02 {

	public static void main(String[] args) {
		// �� ���ڸ� �Է� �޾� ���� ���, �� �� 0 �̸� ����

		Scanner sc = new Scanner(System.in);
		int A = 1, B = 1;
		int result = 0;

		while (A != 0 && B != 0) {
			System.out.print("A �Է�>> ");
			A = sc.nextInt();
			System.out.print("B �Է�>> ");
			B = sc.nextInt();
			if (A != 0 && B != 0) {
				result = A - B;
				System.out.println("���>> " + result);
			}
		}

		sc.close();

	}

}
