package hw3rdWeek;

import java.util.Arrays;

public class Ex211201_StringSort {

	public static void main(String[] args) {

		System.out.println(reverseStr1("ZAbcdVefEg"));

	}

	public static String reverseStr(String string) {
		// String을 char 배열에 반복해서 넣고, 선택정렬을 통해 배열 정렬,
		// 정렬된 char 배열을 String으로 다시 변환하여 return 40분 소요
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

		public static String reverseStr2(String string) {
		// 다른 함수를 이용해 같은 순서를 실행...
		String[] arr = string.split(""); // String 배열로 변환
		Arrays.sort(arr); // 정렬
		return String.join("", arr);
	}

	public static String reverseStr1(String string) {
//		 다른 함수를 이용해 같은 순서를 실행...
		char[] arr = string.toCharArray(); // char 배열로 변환
		Arrays.sort(arr); // 정렬
		return String.valueOf(arr); // char array toString method:2

//		코드는 세 줄이지만 결국은 4줄로 하는 게 더 깔끔 할 것 같다.
//		char[] arr = string.toCharArray();  // char 배열로 변환 
//		Arrays.sort(arr);  // 정렬 
//		String sorted = new String(arr);  // char array toString method:2 
//		return sorted;

	}

}
