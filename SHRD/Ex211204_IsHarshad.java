package hw3rdWeek;

import java.util.Scanner;

public class Ex211204_IsHarshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>>");
		String n = sc.next();

		System.out.println(isHarshad(n));
		sc.close();
	}

	private static boolean isHarshad(String n) {

 		//LOW QUALITY VERSION: STRING> STRING ARRAY> INT 
		
		String[] narr = n.split("");
		int sum = 0;

		for (int i = 0; i < narr.length; i++) {
			sum += Integer.parseInt(narr[i]);
		}

		return Integer.parseInt(n) % sum == 0;
		
		
		
	}

}
