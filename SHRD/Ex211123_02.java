package hw211123;

import java.util.Random;

public class Ex211123_02 {

	public static void main(String[] args) {

		Random rd = new Random();
		int[] array = new int[6];
		int rd_num = 0;
		int count = 0;

		for (int i = 0; i < 6; i++) { // 6 ���� ���� ��.
			rd_num = rd.nextInt(44) + 1; // 0 ���� 44 �� �� �����̹Ƿ� +1
			count = 0;
			
			while (count != i) { // �ߺ� �˻�, �ݺ�Ƚ�� �������� ����
				
				if (rd_num == array[count]) {  
					rd_num = rd.nextInt(44) + 1;
					count = 0; // �� ���� ���ڿ� ���� ��ü �ߺ��� �ٽ�Ȯ��
				} else {
					count++;
				}

			}// while �� �ݴ� �ڸ�, 
			array[i] = rd_num;  // �˻� �� ���� ���� ���� �� �ߺ� �ƴ� ����� ���� ���
			System.out.println("����� ���� : " + rd_num);
		}
	}

}
