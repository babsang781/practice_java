import java.util.ArrayList;

public class StoreController {
	
	// �Ʒ��� ������ �ذ��Ͻÿ�
	private ArrayList<Restaurant> listRest = new ArrayList<Restaurant>();
	private ArrayList<Salon> listSal = new ArrayList<Salon>();

	// StoreController�����ڴ� ���� ���� �� ��
	public StoreController() {
		Restaurant r1 = new Restaurant("�ؼ��Ĵ�", "������", 80, 70, 60, 90);
		Restaurant r2 = new Restaurant("�����̳�", "������", 100, 100, 71, 100);
		Restaurant r3 = new Restaurant("�ջ����", "������", 90, 90, 90, 34);
		Salon s1 = new Salon("�ڽ�ö", "�̿��", 100, 100, 67.99);
		Salon s2 = new Salon("�̰���", "�̿��", 100, 100, 70.99);
		Salon s3 = new Salon("����", "�̿��", 87, 87, 87);
		listRest.add(r1);
		listRest.add(r2);
		listRest.add(r3);
		listSal.add(s1);
		listSal.add(s2);
		listSal.add(s3);
	}

	// ��� �Ĵ��� ��������� �����ִ� getList �޼ҵ带 �����Ͻÿ�
	public ArrayList<Restaurant> getList() {
		return listRest;
	}
	public ArrayList<Salon> getList2() {
		return listSal;
	}
	
	// �ش� �Ĵ��� ������ �����ִ� getStore �޼ҵ带 �����Ͻÿ�
	public ArrayList<Restaurant> getStore(String searchStore) {
		return listRest;
	}
	
	

}
