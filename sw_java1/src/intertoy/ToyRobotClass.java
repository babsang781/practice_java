package intertoy;

public class ToyRobotClass implements Missile, MoveArmleg {
	
	public ToyRobotClass() {
		System.out.println("robot");
		canMoveArmleg();
		canMissile();
		System.out.println("=======================");
	}

	@Override
	public void canMoveArmleg() {
		// TODO Auto-generated method stub
		System.out.println("armleg");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("missile");
	}
	
}