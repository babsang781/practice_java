import java.util.ArrayList;

public class StoreController {
	
	// 아래의 오류를 해결하시오
	private ArrayList<Restaurant> listRest = new ArrayList<Restaurant>();
	private ArrayList<Salon> listSal = new ArrayList<Salon>();

	// StoreController생성자는 수정 하지 말 것
	public StoreController() {
		Restaurant r1 = new Restaurant("해성식당", "음식점", 80, 70, 60, 90);
		Restaurant r2 = new Restaurant("정림이네", "음식점", 100, 100, 71, 100);
		Restaurant r3 = new Restaurant("왕뼈사랑", "음식점", 90, 90, 90, 34);
		Salon s1 = new Salon("박승철", "미용실", 100, 100, 67.99);
		Salon s2 = new Salon("이가자", "미용실", 100, 100, 70.99);
		Salon s3 = new Salon("리안", "미용실", 87, 87, 87);
		listRest.add(r1);
		listRest.add(r2);
		listRest.add(r3);
		listSal.add(s1);
		listSal.add(s2);
		listSal.add(s3);
	}

	// 모든 식당의 정보목록을 돌려주는 getList 메소드를 구현하시오
	public ArrayList<Restaurant> getList() {
		return listRest;
	}
	public ArrayList<Salon> getList2() {
		return listSal;
	}
	
	// 해당 식당의 정보를 돌려주는 getStore 메소드를 구현하시오
	public ArrayList<Restaurant> getStore(String searchStore) {
		return listRest;
	}
	
	

}
