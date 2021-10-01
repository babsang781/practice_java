package StrategyBot;

public abstract class Robot {
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionWalk() {
	    System.out.println("Walk");
	}
	
	public void actionRun() {
		System.out.println("Run");
	}
		
	public void shape() {
		System.out.println("¸Ó¸® ¸öÅë ÆÈ ´Ù¸®");
	}
	
	public abstract void actionFly();
	
	public abstract void actionMissile();
	
	public abstract void actionKnife();
	

}
