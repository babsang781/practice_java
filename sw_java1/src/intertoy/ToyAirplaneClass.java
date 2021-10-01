package intertoy;

public class ToyAirplaneClass implements Missile, Light {
	
	public ToyAirplaneClass() {
		System.out.println("airplane");
		canLight();
		canMissile();
		System.out.println("=======================");
	}

	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("light");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("missile");
	}


}
