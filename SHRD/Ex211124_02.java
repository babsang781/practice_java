package hw211124;

public class Ex211124_02 {

	public static void main(String[] args) {

		// �迭 �Է�
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int temp = 100;
		int min = 100;
		int[] result = new int[2];
		// �Ÿ��� ���� ª�� �����: ������ ���� ���� ���� �迭 index�� ���
		// -> �޺���̼� ������ �� �ϴ� Ƚ��(x) -> �׳� ���� for �� ��ü �˻� ��

		for (int i = 0; i < point.length; i++) { // 0- 6
			for (int j = 0; j < point.length; j++) { // 0-6 , ���� ���� 0�� ����
				
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
