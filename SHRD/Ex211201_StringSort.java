package hw3rdWeek;

import java.util.Arrays;

public class Ex211201_StringSort {

	public static void main(String[] args) {

		System.out.println(reverseStr1("ZAbcdVefEg"));

	}

	public static String reverseStr(String string) {
		// String�� char �迭�� �ݺ��ؼ� �ְ�, ���������� ���� �迭 ����,
		// ���ĵ� char �迭�� String���� �ٽ� ��ȯ�Ͽ� return 40�� �ҿ�
		char min = 0;
		char temp = 0;
		char[] arr = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {
			arr[i] = string.charAt(i);
		}

		for (int i = 0; i < string.length(); i++) {
			min = arr[i];
			for (int j = i; j < string.length(); j++) {
				if (arr[j] < min) {
					temp = min;
					min = arr[j];
					arr[j] = temp;
				}
			}
			arr[i] = min;
		}
		string = String.valueOf(arr);
		return string;
	}

	public static String reverseStr1(String string) {
		// �ٸ� �Լ��� �̿��� ���� ������ ����...
		//char[] arr = string.toCharArray();
		char[] arr = string.split("");
		Arrays.sort(arr);
		String sorted = new String(arr);
		return sorted;
	}

}
