package hw211119;

public class Ex211119_02 {

	public static void main(String[] args) {
		int i = 1;// ���� 1-77
		int j = 77;// ���� 77-1
		int sum = 0;// �հ� ����
		
		for(i=1;i<=77;i++){ // �ݺ� 77
		
			sum = sum + i*j;
			j--;	
		}
		System.out.println(sum);

	}

}
