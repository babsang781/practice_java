package hw211122;

import java.util.Scanner;

public class Ex211122_02 {

	public static void main(String[] args) {
		// ����� "�� ����" �Է� �޾Ƽ� ���ʺ��� �������� ����ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.print("�� ����: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - i); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();
	}

}
