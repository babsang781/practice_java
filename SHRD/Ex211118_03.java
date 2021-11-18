import java.util.Scanner;

public class Ex211118_03 {

	public static void main(String[] args) {
		// 윤년 구하기 400의 배수 || (4의 배수&& !=100의 배수)

		Scanner sc = new Scanner(System.in);

		System.out.print("년도 입력 >> ");
		int year = sc.nextInt();

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년 아님");
		}

		sc.close();
	}

}
