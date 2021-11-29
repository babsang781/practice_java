
public class Exam01 {

	public static void main(String[] args) {

		// 이차원 배열의 생성
		// 1차원 배열: 자료형[] 배열명 = new 자료형[방의 크기n];
		// 2차원 배열: 자료형[][] 배열명 = new 자료형[방의 크기n][n];

		// 5행 5열의 배열 생성하기
		int[][] array = new int[5][5];

		// 1. 배열에 데이터 값 저장하기
		array[0][0] = 1;
//		array[0][1] = 2;

		System.out.println(array[3][3]);
		System.out.println(array[0][0]);
		// 배열을 손쉽게 저장하기 위해 for 문 활용하기
		// 첫 번째 방 순회 * 두 번째 방 순회=> 이중 for문이 필요

		// 하나씩 값이 증가하는 변수 사용
		int num = 1;

		for (int i = 0; i < array.length; i++) {
			// 열( 방의 호수)를 반복해줄 수 있는 for 문 작성
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num;
				num++;
			}
		}

		// 2. 배열에 대한 값 확인하기 -> 이중 for 문
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf(" %2d",array[i][j]);
			}
			System.out.println();// 개행을 위해 ln출력문 입력
		}

	}

}
