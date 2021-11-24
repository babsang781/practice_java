package hw211124;

import java.util.Scanner;

public class Ex211124_01 {

	public static void main(String[] args) {

		// N,X 를 입력받는다.
		// N 개의 정수를 입력 받는다.
		// X 보다 많은 수만 출력한다.

		// N,X 를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N 입력 >> ");
		int N = sc.nextInt();
		System.out.print("X 입력 >> ");
		int X = sc.nextInt();
		
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >>");
			array[i] = sc.nextInt();
		}

		System.out.print("결과 >> ");
		for (int i = 0; i < N; i++) {
			if (array[i] < X) {
				System.out.print(array[i] + " ");
			}

		}
	}

}
