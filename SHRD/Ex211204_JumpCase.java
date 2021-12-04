package hw3rdWeek;

public class Ex211204_JumpCase {

	public static void main(String[] args) {

		System.out.println(jumpCase(4));

	}

	private static int jumpCase(int i) {

		if (i == 1) {
			return 1;
		} else if (i == 2) {
			return 2;
		} else {
			return jumpCase(i - 1) + jumpCase(i - 2);
		}

	}

}
