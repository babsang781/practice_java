package iphone;

public class MainClass {
	
	public static void main(String[] args) {
		
		IFunction aphone = new APhone();
		IFunction bphone = new BPhone();
		
		
		IFunction[] iFunctions = {aphone, bphone};
		
		for(int i = 0; i<iFunctions.length; i++) {
			
			iFunctions[i].callSenderReceive();
			iFunctions[i].canLte();
			iFunctions[i].tvRemoteController();
			System.out.println("==========================");
		}
	}

}
