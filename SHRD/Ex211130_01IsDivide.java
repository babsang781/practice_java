package hw211130;

public class Ex211130_01IsDivide {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;

		boolean result = isDivide(num1, num2);
		System.out.println("��� Ȯ�� : " + result);

	}

	public static boolean isDivide(int num1, int num2) {

		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}

	}
}
//10�� �� ����