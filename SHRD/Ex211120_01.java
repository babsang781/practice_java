package hw211120;

import java.util.Scanner;

public class Ex211120_01 {

	public static void main(String[] args) {
		// �� ������ �ִ� ����� �ּҰ���� ���

		// �ִ�����(greatest commom divider)���ϱ�
		// �� ������ �Է� �޴´�.
		// 1���� ������ ������ ������ % �� �� 0�� ���� ã�´�.
		// �ش��ϴ� ���� gcd�� �����Ѵ�

		// �ּҰ����(least common multiple) ���ϱ�
		// �� ����num1,2�� gcd�� ������.num1/gcd, num2/gcd
		// ���� �� �� ���� gcd�� ���Ѵ�.* gcd
		// * / �ϳ��� ������ ���Ѵ�. lcm = num1*num2/gcd;

		Scanner sc = new Scanner(System.in);
		int lcm = 0;
		int gcd = 1;

		System.out.println("�ִ� �����&�ּ� ����� ���ϱ�");
		System.out.print("���� 1 �Է�>> ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 �Է�>> ");
		int num2 = sc.nextInt();

		for (int i = 2; i < num1; i++) {

			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}

		lcm = num1 * num2 / gcd;
		System.out.println("�ִ�����: " + gcd);
		System.out.println("�ּҰ����: " + lcm);
	}

}
