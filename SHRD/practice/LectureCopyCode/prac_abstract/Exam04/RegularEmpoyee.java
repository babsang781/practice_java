package Exam04;

public class RegularEmpoyee {

	private String empno;
	private String name;
	private int pay;
	private int bonus;

	public String getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}

	public int getBonus() {
		return bonus;
	}

	public RegularEmpoyee(String empno, String name, int pay, int bonus) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}

	public int getMoneyPay() {

		int result = (pay + bonus) / 12;
		return result;

	}

	public String print() {
		String str = this.empno + " : " + this.name + " : " + this.getMoneyPay();
		return str;
	}

}
