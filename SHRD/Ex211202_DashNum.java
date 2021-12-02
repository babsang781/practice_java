package hw3rdWeek;

import java.util.Scanner;

public class Ex211202_DashNum {

	public static void main(String[] args) {
		// 입력된 int 값을 1차원 배열로 변경하고,
		// for 문과 if 문을 통해 반복하여 검사
		// dash 바 개수별로 숫자를 묶어서 검사를 하고,
		// 변수를 만들어서 개수를 합산, 반복문 종료와 함께 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
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
		System.out.print("대시('-')의 총 합 >> " + num);

	}
}
