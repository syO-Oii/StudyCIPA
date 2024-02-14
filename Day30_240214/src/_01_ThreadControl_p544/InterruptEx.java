package _01_ThreadControl_p544;

public class InterruptEx extends Thread{
	public static void main(String[] args) {
		PrintThread2 pt2 = new PrintThread2();
		pt2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pt2.interrupt();
	}
	
	
	
}
