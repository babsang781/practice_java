package hw211121;

import java.util.Scanner;

public class Ex211121_02 {

	public static void main(String[] args) {
		// 두 숫자를 입력 받아 차를 출력, 둘 다 0 이면 종료

		Scanner sc = new Scanner(System.in);
		int A = 1, B = 1;
		int result = 0;

		while (A != 0 && B != 0) {
			System.out.print("A 입력>> ");
			A = sc.nextInt();
			System.out.print("B 입력>> ");
			B = sc.nextInt();
			if (A != 0 && B != 0) {
				result = A - B;
				System.out.println("결과>> " + result);
			}
		}

		sc.close();

	}

}
