import java.util.Scanner;

public class ch6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		ch6 multiple = new ch6();
		multiple.multiple(a);
					
	}
	public void multiple (int a ) {
		for(int i = 1; i <10; i++) {
			System.out.println(a +" x "+ i + " = " + (a*i));
	    }
		
	}
	
}
