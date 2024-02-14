package _01_ThreadControl_p544;

public class InterruptEx2 extends Thread{
	public static void main(String[] args) {
		PrintThread3 pt3 = new PrintThread3();
		pt3.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pt3.interrupt();
	}
	
	
	
}
