package _01_Thread;

public class _01_Ex {
	public static void main(String[] args) {
		
		_02_Task task = new _02_Task();
		Thread th = new Thread(task);
		th.start();
		try {
			System.out.println("시작");
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}
}
