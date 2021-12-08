package Exam01;

public class SomeOne extends Person {
	// 추상 클래스를 상속받으면 추상메소드를 구현해줘야함.
	
	@Override
	public void breathe() {
System.out.println("숨쉬기");		
	}

	@Override
	public void eat() {
		
		System.out.println("밥먹기");
	}

	@Override
	public void think() {
		System.out.println("생각하기");
		
		
	}
	

}
