package timertokenizer;

import java.util.StringTokenizer;

public class ExTokenizer {
	public static void main(String[] args){
		String str1 = "Today's weather is sunny";
		String str2 = "2021/10/04";
				
		System.out.println(str1);
		System.out.println(str2);
		
		StringTokenizer tk1 = new StringTokenizer(str1);
		StringTokenizer tk2 = new StringTokenizer(str2, "/");
		
		System.out.println("¼ö : " + tk1.countTokens());
		System.out.println("¼ö : " + tk2.countTokens());
		
		while(tk1.hasMoreTokens()) {
			System.out.println(tk1.nextToken());
		}
		while(tk2.hasMoreTokens()) {
			System.out.println(tk2.nextToken());
		}
		
	}

}
