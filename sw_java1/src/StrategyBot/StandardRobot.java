package StrategyBot;

public class StandardRobot extends Robot  {
	
	public StandardRobot() {
		
	}
	@Override
	public void actionFly() {
		System.out.println("Can not fly");
	}
	@Override
	public void actionMissile() {
		System.out.println("Missile");
	}
	@Override
	public void actionKnife() {
		System.out.println("Wooden blade");
	}
	

}
