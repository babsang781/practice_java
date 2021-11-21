package hw211121;

import java.util.Scanner;

public class Ex211121_01 {

	public static void main(String[] args) {
		// 소인수분해 문제:
		// 값을 입력받아서, [(입력받은 값) = (소인수)*(소인수)*...]으로 출력

		// -> 소인수분해 하는 법:
		// 1. 가장작은 소수 i =1 선언
		// 2. 반복문 i <= num까지
		// 3. (if) i 로 나눈 나머지가 0 이 아니면, i 증가 다시 반복
		// 4. i 로 나눈 나머지가 0 이 맞으면,
		// 5. 이중 반복문: i 증가 이전에 같은 소인수i 가 제곱인 경우 확인
		// 6. (if)증가하지 않은 i로 (num/result)를 나눈 나머지가 0인지 확인
		// 7. 같은 i 로 나누어 지면 ("*" +i); 출력 && result 에 i 곱함
		// 8. 다 확인하면 이중 반복문 나가기
		// 9. (if)소인수분해 완료 확인 , 미완료시 * 출력
		// 10. i 증가. 끝.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = sc.nextInt();

		System.out.print(num + " = ");

		int result = 1;
		for (int i = 2; i <= num; i++) {
			if ((num / result) % i == 0) {
				System.out.print(i);
				result *= i;

				while ((num / result) % i == 0) { //
					System.out.print("*" + i);
					result *= i;
				}

				if (num != result) {
					System.out.print("*");
				}
			}

		}

		sc.close();
	}

}
