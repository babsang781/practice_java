package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// 이름과 점수를 저장할 HashMap 컬렉션 생성
		HashMap<String, Integer> scoreMap = new HashMap<String,Integer>();
		
		// 5개의 점수 저장
		
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 79);
		scoreMap.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수: "+scoreMap.size());
		
		// 모든 사람의 점수 출력. scoreMap 에 들어있는 모든 (key, value) 쌍 출력
		Set<String> keys = scoreMap.keySet(); // 모든 키를 가진 set 컬렉션 리턴
		Iterator<String> it  = keys.iterator(); // set 에 있는 모든 key를 순서대로 검색하는 Iterator(반복자) 리턴
		
		while(it.hasNext()) { 			// 반복자 변수 it 가 next 가 있으면 반복
			String name = it.next();   // 반복자 it 변수가 다음 키로 이동, 다음 키에 있는 학생이름을 name 에 저장 
			int score = scoreMap.get(name);  // 점수 알아내기 // scoreMap 에서 name 에 해당하는 점수를 score 에 저장
			System.out.println(name + ":" + score);
		}
		
		
	}

}
