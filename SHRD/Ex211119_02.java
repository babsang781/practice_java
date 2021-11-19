package hw211119;

public class Ex211119_02 {

	public static void main(String[] args) {
		int i = 1;// 변수 1-77
		int j = 77;// 변수 77-1
		int sum = 0;// 합계 변수
		
		for(i=1;i<=77;i++){ // 반복 77
		
			sum = sum + i*j;
			j--;	
		}
		System.out.println(sum);

	}

}
