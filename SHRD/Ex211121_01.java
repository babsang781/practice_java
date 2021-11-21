package hw211121;

import java.util.Scanner;

public class Ex211121_01 {

	public static void main(String[] args) {
		// ���μ����� ����:
		// ���� �Է¹޾Ƽ�, [(�Է¹��� ��) = (���μ�)*(���μ�)*...]���� ���

		// -> ���μ����� �ϴ� ��:
		// 1. �������� �Ҽ� i =1 ����
		// 2. �ݺ��� i <= num����
		// 3. (if) i �� ���� �������� 0 �� �ƴϸ�, i ���� �ٽ� �ݺ�
		// 4. i �� ���� �������� 0 �� ������,
		// 5. ���� �ݺ���: i ���� ������ ���� ���μ�i �� ������ ��� Ȯ��
		// 6. (if)�������� ���� i�� (num/result)�� ���� �������� 0���� Ȯ��
		// 7. ���� i �� ������ ���� ("*" +i); ��� && result �� i ����
		// 8. �� Ȯ���ϸ� ���� �ݺ��� ������
		// 9. (if)���μ����� �Ϸ� Ȯ�� , �̿Ϸ�� * ���
		// 10. i ����. ��.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		int num = sc.nextInt();

		System.out.print(num + " = ");

		int result = 1;
		for (int i = 2; i <= num; i++) {
			if ((num / result) % i == 0) {
				System.out.print(i);
				result *= i;

				while ((num / result) % i == 0) { //
					System.out.print("*" + i);
					result *= i;
				}

				if (num != result) {
					System.out.print("*");
				}
			}

		}

		sc.close();
	}

}
