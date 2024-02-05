package _01_Thread;

public class _03_Ex03 {
	public static void main(String[] args) {
		// runnable 메소드를 실행한 쓰레드 객체를 생성하여 사용
		Thread th = new Thread(new Runnable() {
			
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
		});
		
		th.start();
		
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


