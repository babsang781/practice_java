package hw211118;

import java.util.Scanner;

public class Ex211118_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("����ݾ� : ");
		int money = sc.nextInt();

		int num1 = money / 10000;
		int num2 = (money % 10000) / 5000;
		int num3 = (money % 5000) / 1000;
		int num4 = (money % 1000) / 500;
		int num5 = (money % 500) / 100;

		System.out.println("�ܵ���ȯ");
		System.out.println("10000��: " + num1 + "��");
		System.out.println("5000��: " + num2 + "��");
		System.out.println("1000��: " + num3 + "��");
		System.out.println("500��: " + num4 + "��");
		System.out.println("100��: " + num5 + "��");

		sc.close();
	}
}
