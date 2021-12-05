package test01;

public class Address {

	private String name = "";
	private int age = 0;
	private String phoneNumber = "";

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void show() {
		System.out.printf(" %s(%d¼¼) : %s\n", name, age, phoneNumber);

	}

	public Address(String name, int age, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

}
