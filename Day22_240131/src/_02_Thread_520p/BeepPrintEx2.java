package _02_Thread_520p;

public class BeepPrintEx2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
				
		for(int i = 0; i < 5; i++) {
			System.out.println("그러쉐여 구럼~~");
			try { Thread.sleep(500); } catch(Exception e) {}	// Thread.sleep(500) : 0.5초간 일시정지
		}
		
		
		// 두개의 for문이 순서대로 실행됨
	}
}
