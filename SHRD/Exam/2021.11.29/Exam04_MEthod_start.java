import java.util.Scanner;

public class Exam04_MEthod_start {
	// Main �޼ҵ�
	public static void main(String[] args) {

		// 1. �޼ҵ��� ����
		// - ���� ������ : public
		// - return type: �޼ҵ� �������� ��������� ���ƿ��� data�� ���� type
		// - �޼ҵ� �̸�:
		// - �޼ҵ尡 ����� x�� -> �޼ҵ��� �Ű�����, () �Ұ�ȣ �ȿ� �� ����

		// �� ���� ���� �Է� �޾� ������� ����ϴ� �޼ҵ�

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();

		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();

		int result = addNumber(num1, num2);
		System.out.println(result);
		
		
		
		// �޼ҵ�� ȣ��� ���Ƿ� �۾��� ����ȴ�.

	}// main �޼ҵ� ������ �κ�

	// ���Ӱ� �޼ҵ带 ���� �� �ִ� �κ�
	// public ���� �ܺ� ��𼭵� ������ ������ ������
	// static�� ����Ǵ� ������ ���� ��, Ŭ������ ���� ��ġ�� �޼ҵ带 ������ ��� ������ ����.
	public static int addNumber(int x1, int x2) {
		int result = x1 + x2;
		return result;
	}

}// Ŭ���� ������ �κ�
