import java.util.Scanner;

public class Ex211118_03 {

	public static void main(String[] args) {
		// ���� ���ϱ� 400�� ��� || (4�� ���&& !=100�� ���)

		Scanner sc = new Scanner(System.in);

		System.out.print("�⵵ �Է� >> ");
		int year = sc.nextInt();

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("����");
		} else {
			System.out.println("���� �ƴ�");
		}

		sc.close();
	}

}
