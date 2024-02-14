package _01_ThreadControl_p544;

public class PrintThread2 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
