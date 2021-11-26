package hw211126;

public class Ex211126_02_turn180 {

	public static void main(String[] args) {

		int[][] arr1 = new int[5][5];
		int num = 0;
		System.out.println("원본");
		for (int i = 0; i < 5; i++) { // 입력
			for (int j = 0; j < 5; j++) {
				num++;
				arr1[i][j] = num;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ",arr1[i][j]);
			}
			System.out.println("");
		}

		System.out.println("180도 회전");
		for (int i = 0; i < 5; i++) { // 180 입력
			for (int j = 0; j < 5; j++) {
				arr1[i][j] = num;
				num--;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ",arr1[i][j]);
			}
			System.out.println("");
		}

	}

}
