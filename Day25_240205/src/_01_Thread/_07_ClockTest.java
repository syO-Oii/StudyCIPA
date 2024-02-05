package _01_Thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _07_ClockTest {
	public static void main(String[] args) {
		Thread th = new Thread() {
			@Override
			public void run() {
				for(;;) {
					LocalDateTime localDateTime = LocalDateTime.now();
					String localDateTimeFormat1 =
							localDateTime.format(
									DateTimeFormatter.ofPattern
									("yyyy년 MM월 dd일 HH시 mm분 ss초"));
					System.out.println(localDateTimeFormat1);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		th.start();
		mainTask();
	}
	
	public static void mainTask() {
		System.out.println("mainTask 시작");
		
		for(int i = 0; i < 5 ; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("mainTask 진행");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Task 종료");
	}
}
