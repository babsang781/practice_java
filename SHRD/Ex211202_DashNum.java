package hw3rdWeek;

import java.util.Scanner;

public class Ex211202_DashNum {

	public static void main(String[] args) {
		// �Էµ� int ���� 1���� �迭�� �����ϰ�,
		// for ���� if ���� ���� �ݺ��Ͽ� �˻�
		// dash �� �������� ���ڸ� ��� �˻縦 �ϰ�,
		// ������ ���� ������ �ջ�, �ݺ��� ����� �Բ� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		String input = sc.next();
		StrNumDash(input);
		
		sc.close();
	}
	
	public static void StrNumDash(String x) {
		int num = 0;
		String[] arr = x.split("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == "1") {
				num += 2;
			} else if (arr[i] == "7") {
				num += 3;
			} else if (arr[i] == "4") {
				num += 4;
			} else if (arr[i] == "2" || arr[i] == "3" || arr[i] == "5") {
				num += 5;
			} else if (arr[i] == "0" || arr[i] == "6" || arr[i] == "9") {
				num += 6;
			} else if (arr[i] == "8") {
				num += 7;
			}
		}
		System.out.print("���('-')�� �� �� >> " + num);

	}
}
