package hw211119;

public class Ex211119_01 {

	public static void main(String[] args) {
		// 1-2+3-4+...+99-100 �� ����Ͽ� ���� ����Ͻÿ�

		int sum = 0;
		int j = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				j = i * (-1);
			} else {
				j = i;
			}
			System.out.print(j + " ");

			sum += j;
		}
		System.out.println("");
		System.out.println("��� : " + sum);
	}

}
