package hw211127;

public class Ex211127_03_HourGlass {

	public static void main(String[] args) {
		//모래시계 모양으로 char 변수 알파벳 배열 만들고 출력하기
		int n = 5; // n은 홀수 단위로 진행
		char[][] arr = new char[n][n];
		int cnt = 0;

		// printf 에 대해 인터넷으로 알아볼 것! 꼭!
		
		for (int i = 0; i < n; i++) {

			if (i <= n / 2) {
				for (int j = i; j < n - i; j++) {
					cnt++;
					char ascii = (char) (64 + cnt);
					arr[i][j] = ascii;
				}
			} else {
				for (int j = n - 1 - i; j <= i; j++) {
					cnt++;
					char ascii = (char) (64 + cnt);
					arr[i][j] = ascii;
				}
			}
		}
		
		for(int i = 0 ; i<n; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.printf(" %2c", arr[i][j]);				
			}
			System.out.println("");
		}

	}

}
