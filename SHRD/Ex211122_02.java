package hw211122;

import java.util.Scanner;

public class Ex211122_02 {

	public static void main(String[] args) {
		// 별찍기 "행 개수" 입력 받아서 왼쪽부터 역순으로 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - i); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();
	}

}
