
public class Exam01 {

	public static void main(String[] args) {

		// ������ �迭�� ����
		// 1���� �迭: �ڷ���[] �迭�� = new �ڷ���[���� ũ��n];
		// 2���� �迭: �ڷ���[][] �迭�� = new �ڷ���[���� ũ��n][n];

		// 5�� 5���� �迭 �����ϱ�
		int[][] array = new int[5][5];

		// 1. �迭�� ������ �� �����ϱ�
		array[0][0] = 1;
//		array[0][1] = 2;

		System.out.println(array[3][3]);
		System.out.println(array[0][0]);
		// �迭�� �ս��� �����ϱ� ���� for �� Ȱ���ϱ�
		// ù ��° �� ��ȸ * �� ��° �� ��ȸ=> ���� for���� �ʿ�

		// �ϳ��� ���� �����ϴ� ���� ���
		int num = 1;

		for (int i = 0; i < array.length; i++) {
			// ��( ���� ȣ��)�� �ݺ����� �� �ִ� for �� �ۼ�
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num;
				num++;
			}
		}

		// 2. �迭�� ���� �� Ȯ���ϱ� -> ���� for ��
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf(" %2d",array[i][j]);
			}
			System.out.println();// ������ ���� ln��¹� �Է�
		}

	}

}
