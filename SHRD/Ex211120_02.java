package hw211120;

import java.util.Scanner;

public class Ex211120_02 {

	public static void main(String[] args) {
		//

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();

		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}

		System.out.println("출력 : " + result);

	}

}
