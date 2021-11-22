package hw211122;

import java.util.Scanner;

public class Ex211122_01 {

	public static void main(String[] args) {
		// 정수 n 을 입력받아 1,2,4,7,11,16,22 와 같은 수열의 n 번째 항까지 츨력하시오

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();

		int result = 1;
		for (int i = 0; i < n; i++) {
			result += i;
			System.out.print(result + " ");
		}

		sc.close();
	}

}
