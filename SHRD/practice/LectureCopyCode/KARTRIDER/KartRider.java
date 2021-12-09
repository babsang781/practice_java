package Exam02;

public interface KartRider {

	// 설계도
	// 시작 = 0 ;
	int start = 0;

	// 앞으로
	void go(int num);

	// 뒤로
	void back(int num);
	
	// 부스터
	void booster(int power);
	
	
	
}
