package hw211125;

import java.util.Scanner;

public class Ex211125_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 6;
		int[] array1 = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번째 변수 입력>> ");
			array1[i] = sc.nextInt();
		}

		int temp = 0;
		for (int j = 0; j <= n - (n / 2); j++) {
			for (int i = 0; i < n - 1; i++) {
				if (array1[i] > array1[i + 1]) {
					temp = array1[i];
					array1[i] = array1[i + 1];
					array1[i + 1] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		for (int i = 0; i < n; i++) {
			System.out.print(array1[i] + " ");
		}

		sc.close();

	}

}
