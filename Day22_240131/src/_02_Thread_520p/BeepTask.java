package _02_Thread_520p;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5 ; i++) {
			System.out.println("비프음~ 삐이이익~~");
			try { Thread.sleep(500); } catch(Exception e) {}	// Thread.sleep(500) : 0.5초간 일시정지
		}
			
	}
}
