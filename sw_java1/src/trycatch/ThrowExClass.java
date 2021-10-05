package trycatch;

public class ThrowExClass {
	

	public ThrowExClass() {
		actionC();
		
	}

	private void actionA() throws Exception{
		System.out.println("actionA");
		
		int[] iArr = {1,2,3,4};
		
		System.out.println(iArr[3]);
		System.out.println("actionA.  .");
	}
	
	private void actionB() {
		System.out.println("actionB");
		try {
			actionA();
		} catch (Exception e) {
			System.out.println("exception is occured");
			System.out.println(e.getMessage());
		}
		System.out.println("actionB.  .");
	}
	
	private void actionC() {
		System.out.println("actionC");
		actionB();
		System.out.println("actionC.  .");
	}
}
