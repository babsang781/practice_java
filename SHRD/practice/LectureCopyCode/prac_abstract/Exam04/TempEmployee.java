package Exam04;

public class TempEmployee extends Employees{
	
	private String empno;
	private String name;
	private int pay;
	
	public TempEmployee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public int getMoneyPay() {
		int num = pay/12;
		return num;
	}
	public String print() {
		String str = this.empno + " : " + this.name + " : " + this.pay;
		return str;
	}
}
