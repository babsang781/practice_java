package hw211118;

import java.util.Scanner;

public class Ex211118_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재금액 : ");
		int money = sc.nextInt();

		int num1 = money / 10000;
		int num2 = (money % 10000) / 5000;
		int num3 = (money % 5000) / 1000;
		int num4 = (money % 1000) / 500;
		int num5 = (money % 500) / 100;

		System.out.println("잔돈반환");
		System.out.println("10000원: " + num1 + "개");
		System.out.println("5000원: " + num2 + "개");
		System.out.println("1000원: " + num3 + "개");
		System.out.println("500원: " + num4 + "개");
		System.out.println("100원: " + num5 + "개");

		sc.close();
	}
}
