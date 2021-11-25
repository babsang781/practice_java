package hw211125;

import java.util.Scanner;

public class Ex211125_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		int temp = 0;
		int count = 0;

		String binaryNum = "";
		for(int i = num;i>0;i=i/2) {
			binaryNum = i%2 +binaryNum;
		}
		
		temp = num;
		while (temp != 1) {
			temp = temp / 2;
			count++;
		}

		temp = num;
		int[] arrayTemp = new int[count + 1];
		for (int i = 0; i < count + 1; i++) {
			arrayTemp[i] = temp % 2;
			temp /= 2;

		}
		int[] result = new int[count + 1];
		for (int i = 0; i < count + 1; i++) {
			result[i] = arrayTemp[(count) - i];
			System.out.print(result[i] + " ");
		}
		System.out.println("");
		System.out.println(binaryNum);
		sc.close();
	}

}
