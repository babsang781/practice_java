package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// �̸��� ������ ������ HashMap �÷��� ����
		HashMap<String, Integer> scoreMap = new HashMap<String,Integer>();
		
		// 5���� ���� ����
		
		scoreMap.put("�輺��", 97);
		scoreMap.put("Ȳ����", 88);
		scoreMap.put("�賲��", 98);
		scoreMap.put("���繮", 79);
		scoreMap.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ����: "+scoreMap.size());
		
		// ��� ����� ���� ���. scoreMap �� ����ִ� ��� (key, value) �� ���
		Set<String> keys = scoreMap.keySet(); // ��� Ű�� ���� set �÷��� ����
		Iterator<String> it  = keys.iterator(); // set �� �ִ� ��� key�� ������� �˻��ϴ� Iterator(�ݺ���) ����
		
		while(it.hasNext()) { 			// �ݺ��� ���� it �� next �� ������ �ݺ�
			String name = it.next();   // �ݺ��� it ������ ���� Ű�� �̵�, ���� Ű�� �ִ� �л��̸��� name �� ���� 
			int score = scoreMap.get(name);  // ���� �˾Ƴ��� // scoreMap ���� name �� �ش��ϴ� ������ score �� ����
			System.out.println(name + ":" + score);
		}
		
		
	}

}
