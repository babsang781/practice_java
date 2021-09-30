package iphone;

public class APhone implements IFunction{

	@Override
	public void callSenderReceive() {
		// TODO Auto-generated method stub
		System.out.println("가능");
	}

	@Override
	public void canLte() {
		// TODO Auto-generated method stub
		System.out.println("불가능, 3G 입니다.");

	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("불가능");

	}
	

}
