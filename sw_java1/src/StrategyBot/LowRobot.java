package StrategyBot;

public class LowRobot extends Robot {
	
	 public LowRobot() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionFly() {
	    System.out.println("Can not fly");
	}
	@Override
	public void actionMissile() {
		System.out.println("No Missile");
	}
	@Override
	public void actionKnife() {
		System.out.println("No blade");
	}
	

}
