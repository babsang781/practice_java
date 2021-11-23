package hw211123;

import java.util.Random;

public class Ex211123_02 {

	public static void main(String[] args) {

		Random rd = new Random();
		int[] array = new int[6];
		int rd_num = 0;
		int count = 0;

		for (int i = 0; i < 6; i++) { // 6 번만 돌면 됨.
			rd_num = rd.nextInt(45) + 1; // 0 부터 44 값 중 랜덤이므로 +1
			count = 0;
			
			while (count != i) { // 중복 검사, 반복횟수 정해지지 않음
				
				if (rd_num == array[count]) {  
					rd_num = rd.nextInt(45) + 1;
					count = 0; // 새 랜덤 숫자에 대해 전체 중복이 다시확인
				} else {
					count++;
				}

			}// while 문 닫는 자리, 
			array[i] = rd_num;  // 검사 후 랜덤 변수 저장 및 중복 아닌 행운의 숫자 출력
			System.out.println("행운의 숫자 : " + rd_num);
		}
	}

}
