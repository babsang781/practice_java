package hw211122;

import java.util.Scanner;

public class Ex211122_01 {

	public static void main(String[] args) {
		// ���� n �� �Է¹޾� 1,2,4,7,11,16,22 �� ���� ������ n ��° �ױ��� �����Ͻÿ�

		Scanner sc = new Scanner(System.in);
		System.out.print("n �Է� : ");
		int n = sc.nextInt();

		int result = 1;
		for (int i = 0; i < n; i++) {
			result += i;
			System.out.print(result + " ");
		}

		sc.close();
	}

}
