package StrategyBot;

public class SuperRobot extends Robot {
	
	public SuperRobot() {
		
	}
    
	@Override
	public void actionFly() {
		System.out.println("fly");
	}
	@Override
	public void actionMissile() {
		System.out.println("Missile");
	}
	@Override
	public void actionKnife() {
		System.out.println("lazer blade");
	}
	
	
}
