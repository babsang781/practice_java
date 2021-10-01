package intertoy;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * Toy bear = new ToyBearClass(); ToyAirplaneClass airplane = new
		 * ToyAirplaneClass(); Missile robot = new ToyRobotClass(); // 왜 다 기능하지??
		 */	 
	    Toy bear = new ToyBearClass();
		Toy airplane = new ToyAirplaneClass();
	    Toy robot = new ToyRobotClass(); // 다 같은 걸로 묶어서 배열 가능 오...
	    
	    Toy[] toys = {bear, airplane, robot};
	    
	    
		/*
		 * 여기에 기능에 따라 missile 은 제한 연령 표시를 넣고 다른 건 없애고, for 문이나 if 문으로 가장 높은 값을 출력하게 하면
		 * oo의 제한연령이 몇 살입니다. 하고 출력 가능
		 */
	}

}
