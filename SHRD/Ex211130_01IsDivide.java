package hw211130;

public class Ex211130_01IsDivide {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;

		boolean result = isDivide(num1, num2);
		System.out.println("°á°ú È®ÀÎ : " + result);

	}

	public static boolean isDivide(int num1, int num2) {
		return num1 % num2 == 0;
			
	}
}
// 도연스 참고 수정.
