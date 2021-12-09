package Exam02;

import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MyKart k1 = new MyKart();

		System.out.println(k1.myPosition);

		int num2 = 0;

		while (k1.myPosition < 100) {
			System.out.println("현재 위치: " + k1.myPosition);
			System.out.println(" 1. 전진  /  2. 후진  / 3. 부스터 ");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("전진 값을 입력");
				num2 = sc.nextInt();
				k1.go(num2);

			} else if (num == 2) {
				System.out.println("후진 값을 입력");
				num2 = sc.nextInt();
				k1.back(num2);

			} else if (num == 3) {
				System.out.println("부스터 값을 입력");
				num2 = sc.nextInt();
				k1.booster(num2);
			}

		}
		System.out.println("골인!");
	}

}
