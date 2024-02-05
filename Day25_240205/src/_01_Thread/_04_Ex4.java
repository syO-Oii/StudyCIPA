package _01_Thread;

public class _04_Ex4 {
	public static void main(String[] args) {
		_04_WorkerThread wt = new _04_WorkerThread();
		wt.start();
		mainTask();
	}

	public static void mainTask() {
		System.out.println("mainTask 시작");
		
		for(int i = 0; i < 5 ; i++) {
			try {
				Thread.sleep(500);
				System.out.println("mainTask 진행");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Task 종료");
	}

}


