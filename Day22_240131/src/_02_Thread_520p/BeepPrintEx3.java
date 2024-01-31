package _02_Thread_520p;

import java.awt.Toolkit;

// Runnable을 익명객체로 구현
public class BeepPrintEx3 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i = 0; i < 5; i++) {
					System.out.println("삐비빅 삑삑 뿌삐삑");
					try { Thread.sleep(500); } catch(Exception e) {}	// Thread.sleep(500) : 0.5초간 일시정지
				}
			}
		});
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("그러쉐여 구럼~~");
			try { Thread.sleep(500); } catch(Exception e) {}	// Thread.sleep(500) : 0.5초간 일시정지
		}

	}
}
