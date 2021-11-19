package hw211119;

public class Ex211119_01 {

	public static void main(String[] args) {
		// 1-2+3-4+...+99-100 을 계산하여 답을 출력하시오

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
		System.out.println("결과 : " + sum);
	}

}
