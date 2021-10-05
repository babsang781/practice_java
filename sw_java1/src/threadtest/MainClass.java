package threadtest;

public class MainClass {
	
	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		Thread thread = new Thread(threadTest,"A");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		
		ThreadTest2 threadTest2 = new ThreadTest2();
		threadTest2.setName("B");
		threadTest2.start();
		
		System.out.println(Thread.currentThread().getName());

	}

}
