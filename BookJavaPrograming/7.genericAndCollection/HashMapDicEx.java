package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
	
public static void main(String[] args) {
//	HashMap<String, String> dic = new HashMap<String, String>(); // �ؽø� ����
		// var dic = new HashMap<String, String>(); ���� ������ �ᵵ ��.
	
	 var dic = new HashMap<String, String>();
	 // 3 ���� (key, value ) ���� dic �� ����
	 dic.put("baby", "�Ʊ�"); // baby �� Ű , �Ʊ�� value
	 dic.put("love","���");
	 dic.put("apple","���");
	 
	 // ����ڷκ��� ���� �ܾ �Է� �ް� �ѱ� �ܾ� �˻� , exit ���� �Է¹����� ����
	 Scanner sc  = new Scanner(System.in);
	 String eng="";
	 while(!eng.equals("exit")) {
		 System.out.println("ã�� ���� �ܾ�� ?");
		 eng = sc.next();
		 
		 // �ؽøʿ��� 'Ű' eng�� �� kor �˻�
		 String kor = dic.get(eng);
		 if(kor == null)
			 System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
		 else
			 System.out.println(kor);
		 
	 }
	 sc.close();
}	 
}
