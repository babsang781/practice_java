package hw211127;

public class Ex211127_03_HourGlass {

	public static void main(String[] args) {
		//�𷡽ð� ������� char ���� ���ĺ� �迭 ����� ����ϱ�
		int n = 5; // n�� Ȧ�� ������ ����
		char[][] arr = new char[n][n];
		int cnt = 0;

		// printf �� ���� ���ͳ����� �˾ƺ� ��! ��!
		
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
