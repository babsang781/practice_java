package hw211125;

import java.util.Scanner;

public class Ex211125_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 5;
		int[] array1 = new int[n];

		// ���� �Է� �޴� �ݺ���
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "��° ���� �Է�>> ");
			array1[i] = sc.nextInt();
		}
		// min ���� �����ؼ� �Է��� �� �迭 ���� ����
		int[] arrayMin = new int[n];
		int min = 10;

		// ù��° min �� ���ϴ� �ݺ���
		for (int i = 0; i < n; i++) {
			if (array1[i] < min) {
				min = array1[i];
			}
		}

		for (int i = 0; i < n; i++) {
			arrayMin[i] = min; // min �迭[i]�� �ּڰ� �Է�
			min = 10;
			for (int j = 0; j < n; j++) {
				// if ���ų� ���� �� �����ϰ� ���߿� �ٽ� if min �� ���ؼ� ���� ������ min �迭�� ����
				if (arrayMin[i] < array1[j]) {
					if (min > array1[j]) {
						min = array1[j];
					}
				}
			}
		}
		System.out.println("���� ��");
		for (int i = 0; i < n; i++) {
			System.out.print(arrayMin[i] + " ");
		}

		sc.close();
	}

}
