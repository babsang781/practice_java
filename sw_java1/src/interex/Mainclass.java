package interex;

public class Mainclass {
	
	public static void main(String[] args) {
		
		InterfaceClass interfaceClass = new InterfaceClass();
		interfaceClass.getStr();
		interfaceClass.calculate();
		
		InterfaceEx1 ife1 = new InterfaceClass();
		InterfaceEx2 ife2 = new InterfaceClass();
		
		ife1.calculate(); // getStr ¸Þ¼Òµå ¸ø ¾¸
		/* ife1.getStr(); */
		ife2.getStr();
	}

}
