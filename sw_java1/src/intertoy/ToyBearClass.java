package intertoy;

public class ToyBearClass implements Light, MoveArmleg {
	
	public ToyBearClass () {
		System.out.println("bear");
		canMoveArmleg();
		canLight();
		System.out.println("=======================");
	}
	
	

	@Override
	public void canMoveArmleg() {
		// TODO Auto-generated method stub
		System.out.println("armleg");
	}

	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("light");
		
	}
	

}
