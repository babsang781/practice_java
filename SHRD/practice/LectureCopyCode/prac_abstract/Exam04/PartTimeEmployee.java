package Exam04;

public class PartTimeEmployee extends Employees{

	private String empno;
	private String name;
	private int pay ;
	private int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}
	
	public int getMoneyPay() {
		int num = pay*workDay;
		return num;
	}
	public String print() {
		String str = this.empno + " : " + this.name + " : " + this.pay;
		return str;
	}

}
