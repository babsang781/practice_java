import java.util.Scanner;

public class Ex211118_04 {

	public static void main(String[] args) {
		// �׸� ���� �� �ڸ� �� ���� ���

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է�>> ");
		int num1 = sc.nextInt();

		System.out.print("�� ��° ���� �Է�>> ");
		int num2 = sc.nextInt();

		System.out.println(num1 * (num2 % 10));
		//System.out.println(num1 * ((int) (num2 / 10.0) % 10));
		System.out.println(num1*(num2/10%10));
		System.out.println(num1* (int) (num2 / 100.0));

		System.out.println(num1 * num2);
		sc.close();
	}

}
