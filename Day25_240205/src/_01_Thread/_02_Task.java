package _01_Thread;

public class _02_Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
