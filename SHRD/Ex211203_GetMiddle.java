package hw3rdWeek;

public class Ex211203_GetMiddle {

	public static void main(String[] args) {

		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));

	}

	public static char[] getMiddle(String string) {

		char[] arr = string.toCharArray();
		char[] str = new char[2];

		if (arr.length % 2 == 0) {
			str[0] = arr[arr.length / 2 -1];
			str[1] = arr[arr.length / 2 ];
		} else {
			str[0] = arr[arr.length / 2];
		}
		
		return str;
	}

}
