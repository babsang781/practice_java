package hw211120;

import java.util.Scanner;

public class Ex211120_01 {

	public static void main(String[] args) {
		// 두 정수의 최대 공약수 최소공배수 출력

		// 최대공약수(greatest commom divider)구하기
		// 두 정수를 입력 받는다.
		// 1부터 각각의 정수를 나누고 % 둘 다 0인 값을 찾는다.
		// 해당하는 값을 gcd에 대입한다

		// 최소공배수(least common multiple) 구하기
		// 두 정수num1,2에 gcd를 나눈다.num1/gcd, num2/gcd
		// 나눈 몫 두 개와 gcd을 곱한다.* gcd
		// * / 하나씩 날리고 곱한다. lcm = num1*num2/gcd;

		Scanner sc = new Scanner(System.in);
		int lcm = 0;
		int gcd = 1;

		System.out.println("최대 공약수&최소 공배수 구하기");
		System.out.print("숫자 1 입력>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 입력>> ");
		int num2 = sc.nextInt();

		for (int i = 2; i < num1; i++) {

			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}

		lcm = num1 * num2 / gcd;
		System.out.println("최대공약수: " + gcd);
		System.out.println("최소공배수: " + lcm);
	}

}
