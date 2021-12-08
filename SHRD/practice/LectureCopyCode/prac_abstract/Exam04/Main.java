package Exam04;

public class Main {

	public static void main(String[] args) {
		
		RegularEmpoyee regEmp1 = new RegularEmpoyee("SMHRD001", "홍길동", 3000, 500);
		
		regEmp1.print();
		// 이거는 그냥 객체 지향이고, 정규직만 했으니까, 
		//비정규직 class 만들고, 사원 클래스를 추상으로 만들면 되겠네
		
		System.out.println(regEmp1.getBonus());
		
		PartTimeEmployee partEmp1 =  new PartTimeEmployee("ddddd","",0,0);
		
		
		
		
	}

}
