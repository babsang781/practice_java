import java.util.Scanner;

public class Ex211118_04 {

	public static void main(String[] args) {
		// 그림 같이 세 자리 수 곱셈 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력>> ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 입력>> ");
		int num2 = sc.nextInt();

		System.out.println(num1 * (num2 % 10));
		//System.out.println(num1 * ((int) (num2 / 10.0) % 10));
		System.out.println(num1*(num2/10%10));
		System.out.println(num1* (int) (num2 / 100.0));

		System.out.println(num1 * num2);
		sc.close();
	}

}
