package hw211125;

import java.util.Scanner;

public class Ex211125_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 5;
		int[] array1 = new int[n];

		// 정수 입력 받는 반복문
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번째 변수 입력>> ");
			array1[i] = sc.nextInt();
		}
		// min 값을 정렬해서 입력할 새 배열 변수 생성
		int[] arrayMin = new int[n];
		int min = 10;

		// 첫번째 min 값 구하는 반복문
		for (int i = 0; i < n; i++) {
			if (array1[i] < min) {
				min = array1[i];
			}
		}

		for (int i = 0; i < n; i++) {
			arrayMin[i] = min; // min 배열[i]에 최솟값 입력
			min = 10;
			for (int j = 0; j < n; j++) {
				// if 같거나 작은 값 제외하고 그중에 다시 if min 을 구해서 다음 순서에 min 배열에 넣음
				if (arrayMin[i] < array1[j]) {
					if (min > array1[j]) {
						min = array1[j];
					}
				}
			}
		}
		System.out.println("정렬 후");
		for (int i = 0; i < n; i++) {
			System.out.print(arrayMin[i] + " ");
		}

		sc.close();
	}

}
