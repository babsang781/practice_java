package hw211121;

import java.util.Scanner;

public class Ex211121_01 {

	public static void main(String[] args) {
		// 소인수분해 문제:
		// 값을 입력받아서, [(입력받은 값) = (소인수)*(소인수)*...]으로 출력

		// 입력 받는다. for 문으로 n 까지 반복,
		// 약수인지 확인하면서, 약수이면 출력하고, n 값을 같이 나눔
		// 같은 수 반복을 구하기 위해 조건문으로 확인하고 i 를 뺌
		// 또 if 로 끝났으면 break, 종료.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int n = sc.nextInt();
		System.out.print(n + " = ");

		for (int i = 1; i <= n + 1; i++) {

			if (n % i == 0 && n != i && i != 1) {
				System.out.print(i + " * ");
				n /= i;
				if (n % i == 0) {
					i--;
				}

			} else if (n == i) {
				System.out.print(i);
				break;
			}
		}
		sc.close();
	}
}
