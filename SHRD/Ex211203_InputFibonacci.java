package hw3rdWeek;

public class Ex211203_InputFibonacci {

	public static void main(String[] args) {

		int input = 8;
		
		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}

	}

	private static int fibo(int i) {

		if (i <= 2) {
			return 1;
		} else {
			int x = fibo(i - 1) + fibo(i - 2);
			return x;

		}
	}
}
