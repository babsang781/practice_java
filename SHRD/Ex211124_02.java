package hw211124;

public class Ex211124_02 {

	public static void main(String[] args) {

		// 배열 입력
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int temp = 100;
		int min = 100;
		int[] result = new int[2];
		// 거리가 가장 짧은 점출력: 숫자의 차가 가장 작은 배열 index를 출력
		// -> 콤비네이션 조합을 다 하는 횟수(x) -> 그냥 이중 for 문 전체 검사 비교

		for (int i = 0; i < point.length; i++) { // 0- 6
			for (int j = 0; j < point.length; j++) { // 0-6 , 동일 값인 0은 제외
				
				if (point[i] == point[j]) {

				} else if (point[i] > point[j]) {
					temp = point[i] - point[j];
					if (min > temp) {
						min = temp;
						result[0] = i;
						result[1] = j;
					}

				} else if (point[j] > point[i]) {
					temp = point[j] - point[i];
					if (min > temp) {
						min = temp;
						result[0] = i;
						result[1] = j;
					}
				}
			}
		}
		System.out.println("result = [" + result[0] + ", " + result[1] + "]");
	}

}
