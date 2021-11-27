package hw211126;

public class Ex211126_02_turn180 {

	public static void main(String[] args) {

		int[][] arr1 = new int[5][5];
		int num = 0;
		int n = 0;
		
		System.out.println("¿øº»");
		for (int i = 0; i < n; i++) { // ÀÔ·Â
			for (int j = 0; j < n; j++) {
				num++;
				arr1[i][j] = num;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ",arr1[i][j]);
			}
			System.out.println("");
		}

		System.out.println("180µµ È¸Àü");

		for (int i = (n-1); i >=0 ; i--) {
			for (int j = (n-1); j >=0; j--) {
				System.out.printf("%2d ", arr1[i][j]);
			}
			System.out.println("");
		}

	}

}
