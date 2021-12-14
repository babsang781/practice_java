
public class Exam01 {

	public static void main(String[] args) {

		int[][] numArray = new int[3][5];
//		numArray[1][2] = 3;

//		for (int i = 1; i <= 5; i++) {
//			numArray[0][i - 1] = i;
//			System.out.print(numArray[0][i - 1] + " ");
//		}

		int num = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				num++;
				numArray[i][j] = num;
				System.out.print(numArray[i][j] + " ");
			}
			System.out.printf("%2d");
		}
		System.out.println(numArray.length);
		System.out.println(numArray[0].length);

		for (int i = 0; i < numArray.length; i++) {
			for(int j = 0; j< numArray[0].length; j++) {
				num--;
				numArray[i][j] = num;
				System.out.print(numArray[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
