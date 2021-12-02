package hw3rdWeek;

public class Ex211202_GradeStuentNum {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		gradeCount(score);

	}

	public static void gradeCount(String x) {

		int a = 0, b = 0, c = 0, d = 0, f = 0;
		String[] arr = x.split(",");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("A")) {
				a++;
			} else if (arr[i].equals("B")) {
				b++;
			} else if (arr[i].equals("C")) {
				c++;
			} else if (arr[i].equals("D")) {
				d++;
			} else if (arr[i].equals("F")) {
				f++;
			}
		}
		System.out.printf("A : %d명\n",a);
		System.out.printf("B : %d명\n",b);
		System.out.printf("C : %d명\n",c);
		System.out.printf("D : %d명\n",d);
		System.out.printf("F : %d명\n",f);
	}
	
}
