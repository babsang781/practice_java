package hw211123;

import java.util.Random;

public class Ex211123_01 {

	public static void main(String[] args) {

		// 8ĭ �迭����, ���� �ʱ�ȭ for, random
		// if ū���� ���� �� for
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

		System.out.print("�迭�� �ִ� ��� �� : ");
		for (int i = 0; i < 8; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println("");
		System.out.println("���� ū ��: "+ max);
		System.out.println("���� ���� ��: "+ min);
		
	}

}
