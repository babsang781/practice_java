package hw211126;

public class Ex201126_03_dia {

	public static void main(String[] args) {

		int[][] arr = new int[7][7];
		int cnt = 0;
		int n = 7;

		for (int i = 0; i < n; i++) { // �� 0 �Է�
			for (int j = 0; j < n; j++) {
				arr[i][j] = 0;
			}
		}

		for (int i = 0, j = 0; i < n; i++) {

			if (i <= 3) { // �� ���� ��ȣ ���� ����
				j = 3 - i;

				// ����ȣ ���ҽ� �ݺ�Ƚ�� ����
				for (int k = 1; k <= i * 2 + 1; k++) { 
					cnt++;	
					arr[i][j] = cnt;
					j++; // �ݺ��ϴ� ���� ���ڸ� ��ġ ����
				}

			} else if (i > 3) {  // �� ���� ��ȣ ���� ����
				j = i - 3;
				// ����ȣ ������ �ݺ�Ƚ�� ����
				for (int k = 1; k <= (6 - i) * 2 + 1; k++) {
					cnt++;
					arr[i][j] = cnt;
					j++; 
				}
			}  // if �� ����
		} // ���̾� �Է� for �� ����
		
		for(int i = 0; i < n; i++) { //0�� ���̾� 2���� �迭 ���
			for(int j = 0; j < n ; j ++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println("");
		}
	}
}
