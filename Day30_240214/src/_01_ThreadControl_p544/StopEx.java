package _01_ThreadControl_p544;

public class StopEx extends Thread{
	public static void main(String[] args) throws InterruptedException {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		Thread.sleep(1000);
		
		printThread.setStop(true);
		
	}
	
	
}
