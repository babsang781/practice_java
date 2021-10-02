package practiceapi;

import java.util.Random;
import java.util.Scanner;



public class P1 {
	
	public static void main(String[] args) {
		double d= Math.random();
		System.out.println(d);
		
		Random random = new Random();
		
				for(int i=0;i<10;i++) {
			System.out.println(random.nextInt(9));
			System.out.println(random.nextFloat());
		}
				
		Scanner scanner = new Scanner(System.in);
		
		String str2 = scanner.nextLine();
		System.out.println(str2);
		
		String str1 = scanner.next();
		System.out.println(str1);
		
		
		
		System.out.println("end");
		
		

		
		
	}
	
}
