package hw211123;

import java.util.Random;

public class Ex211123_01 {

	public static void main(String[] args) {

		// 8칸 배열선언, 랜덤 초기화 for, random
		// if 큰수와 작은 수 for
		int max = 0;
		int min = 100;
		int[] array1 = new int[8];

		Random rd = new Random();

		for (int j = 0; j < 8; j++) {
			array1[j] = rd.nextInt(100);
			
			if (array1[j] > max) {
				max = array1[j];
			}
			
			if (array1[j] < min) {
				min = array1[j];
			}
		}

		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < 8; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println("");
		System.out.println("가장 큰 값: "+ max);
		System.out.println("가장 작은 값: "+ min);
		
	}

}
