package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
	
public static void main(String[] args) {
//	HashMap<String, String> dic = new HashMap<String, String>(); // 해시맵 생성
		// var dic = new HashMap<String, String>(); 으로 간략히 써도 됨.
	
	 var dic = new HashMap<String, String>();
	 // 3 개의 (key, value ) 쌍을 dic 에 저장
	 dic.put("baby", "아기"); // baby 는 키 , 아기는 value
	 dic.put("love","사랑");
	 dic.put("apple","사과");
	 
	 // 사용자로부터 영어 단어를 입력 받고 한글 단어 검색 , exit 으로 입력받으면 종료
	 Scanner sc  = new Scanner(System.in);
	 String eng="";
	 while(!eng.equals("exit")) {
		 System.out.println("찾고 싶은 단어는 ?");
		 eng = sc.next();
		 
		 // 해시맵에서 '키' eng의 값 kor 검색
		 String kor = dic.get(eng);
		 if(kor == null)
			 System.out.println(eng + "는 없는 단어입니다.");
		 else
			 System.out.println(kor);
		 
	 }
	 sc.close();
}	 
}
