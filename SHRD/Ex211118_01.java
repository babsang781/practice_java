import java.util.Scanner;

public class Ex211118_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݿø� �� �� : ");
		int num = sc.nextInt();
		
		if (num%10>=5) {
			System.out.print("�ݿø� �� �� : " + (num/10 +1)*10);
		} else {
			System.out.print("�ݿø� �� �� : " + (num/10)*10);	
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
