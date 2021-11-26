package hw211126;

public class Ex211126_03_dia {

	public static void main(String[] args) {

		int[][] arr = new int[7][7];
		int cnt = 0;
		int n = 7;
//도연이 서리기준 코드 		
// 		for (int i = 0 ; i <= 6; i++) {
// 			for (int j = 0; j<=6; j++) {
// 				if (Math.abs(i-3)+Math.abs(j-3)<=3) {//Math.abs() <- 절대값
// 					n++;
// 					matrix[i][j] = n;
		
		
		for (int i = 0; i < n; i++) { // 다 0 입력
			for (int j = 0; j < n; j++) {
				arr[i][j] = 0;
			}
		}

		for (int i = 0, j = 0; i < n; i++) {

			if (i <= 3) { // 열 시작 번호 감소 조건
				j = 3 - i;

				// 열번호 감소시 반복횟수 지정
				for (int k = 1; k <= i * 2 + 1; k++) { 
					cnt++;	
					arr[i][j] = cnt;
					j++; // 반복하는 동안 열자리 위치 변경
				}

			} else if (i > 3) {  // 열 시작 번호 증가 조건
				j = i - 3;
				// 열번호 증가시 반복횟수 지정
				for (int k = 1; k <= (6 - i) * 2 + 1; k++) {
					cnt++;
					arr[i][j] = cnt;
					j++; 
				}
			}  // if 문 종료
		} // 다이아 입력 for 문 종료
		
		for(int i = 0; i < n; i++) { //0과 다이아 2차원 배열 출력
			for(int j = 0; j < n ; j ++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println("");
		}
	}
}
