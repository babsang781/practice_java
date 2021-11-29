
public class Exam07 {

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 15;
		String op = "-";

		System.out.println(cal(num1, num2, op));

	}

	public static int cal(int x1, int x2, String op) {

		int result = 0;

		if (op == "*") {
			result = x1 * x2;
		} else if (op == "-") {
			result = x1 - x2;
		} else if (op == "/") {
			result = x1 / x2;
		} else if (op == "+") {
			result = x1 + x2;
		}

		return result;
	}

}
