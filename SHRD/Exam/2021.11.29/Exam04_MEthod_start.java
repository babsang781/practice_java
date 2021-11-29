import java.util.Scanner;

public class Exam04_MEthod_start {
	// Main 메소드
	public static void main(String[] args) {

		// 1. 메소드의 구조
		// - 접근 제한자 : public
		// - return type: 메소드 수행이후 결과값으로 돌아오는 data에 대한 type
		// - 메소드 이름:
		// - 메소드가 사용할 x값 -> 메소드의 매개변수, () 소괄호 안에 들어갈 내용

		// 두 개의 값을 입력 받아 결과값을 출력하는 메소드

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		int result = addNumber(num1, num2);
		System.out.println(result);
		
		
		
		// 메소드는 호출과 정의로 작업이 진행된다.

	}// main 메소드 끝나는 부분

	// 새롭게 메소드를 만들 수 있는 부분
	// public 내부 외부 어디서든 접근이 가능한 지정자
	// static은 저장되는 영역에 대한 것, 클래스와 같은 위치에 메소드를 생성할 경우 무조건 붙임.
	public static int addNumber(int x1, int x2) {
		int result = x1 + x2;
		return result;
	}

}// 클래스 끝나는 부분
