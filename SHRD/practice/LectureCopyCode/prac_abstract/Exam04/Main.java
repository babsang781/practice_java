package Exam04;

public class Main {

	public static void main(String[] args) {
		
		RegularEmpoyee regEmp1 = new RegularEmpoyee("SMHRD001", "ȫ�浿", 3000, 500);
		
		regEmp1.print();
		// �̰Ŵ� �׳� ��ü �����̰�, �������� �����ϱ�, 
		//�������� class �����, ��� Ŭ������ �߻����� ����� �ǰڳ�
		
		System.out.println(regEmp1.getBonus());
		
		PartTimeEmployee partEmp1 =  new PartTimeEmployee("ddddd","",0,0);
		
		
		
		
	}

}
