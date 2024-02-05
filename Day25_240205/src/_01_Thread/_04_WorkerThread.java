package _01_Thread;

public class _04_WorkerThread extends Thread{

	@Override
	public void run() {
		System.out.println("Task 시작");
		
		for(int i = 0; i < 5 ; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Task 진행");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Task 종료");
	}
	
}
