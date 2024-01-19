package MasterQuiz;

import java.util.Scanner;

public class _07_BankAccount_161p {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 > ");
			
			balance = Integer.parseInt(sc.nextLine());
			
			
			switch(balance) {
			case 1:
				System.out.println("예금액 > 10,000 원\n");
				break;
			case 2:
				System.out.println("출금액 > 2,000 원\n");
				break;
			case 3:
				System.out.println("잔고 > 8,000 원\n");
				break;
			case 4:
				System.out.println("\n프로그램 종료");
				run = false;
				break;
			}
			
		}
		
		sc.close();
	}
}
