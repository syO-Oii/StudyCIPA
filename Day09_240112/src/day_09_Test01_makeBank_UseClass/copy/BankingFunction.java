package day_09_Test01_makeBank_UseClass.copy;

import java.util.Scanner;

public class BankingFunction {
	Scanner sc = new Scanner(System.in);
	String memberId;
	double balance;
	
	BankingFunction(Member loggedInMember){
		this.memberId = loggedInMember.getMemberId();
		this.balance = loggedInMember.getBalance();
	}
		
	void callBankingMenu() {
		System.out.println("=========================================");
		System.out.println("============== 은 행 업 무 ==============");
		System.out.println("=========================================");
		System.out.println("-----------------------------------------");
		System.out.println("| 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 |");
		System.out.println("-----------------------------------------");
		callBankingSelect();
	}
	
	void callBankingSelect() {
		System.out.print("선택 > ");
	}

	// 입금
	void depositMenu(Member loggedInMember) {
		System.out.println("=========================================");
		System.out.println("============== 예 금 화 면 ==============");
		System.out.println("=========================================");
		System.out.print("입금 금액을 입력하세요 : ");
		
		while(!sc.hasNext()) {
			System.out.println("올바른 값을 입력하세요");
			sc.next();	// 잘못된 입력 값을 읽어서 버림
		}
		double depositBalance = sc.nextDouble();
		sc.nextLine();	// 개행문자 제거
		loggedInMember.setBalance(doDeposit(depositBalance));
		System.out.println("입금이 완료되었습니다.");
		System.out.println("계좌 잔액 : " + loggedInMember.getBalance());
	}
	double doDeposit(double amount) {
		balance += amount;
		return balance;
	}
	
	//출금
	void withdrawMenu(Member loggedInMember) {
		double withdrawBalance = 0;
		System.out.println("=========================================");
		System.out.println("============== 출 금 화 면 ==============");
		System.out.println("=========================================");
		System.out.print("\n계좌 잔액 : " + loggedInMember.getBalance() + "원\n");
		System.out.print("출금할 금액을 입력하세요 : ");
		withdrawBalance = sc.nextDouble();
		sc.nextLine();	// 개행문자 제거
		loggedInMember.setBalance(doWithdraw(withdrawBalance));
		System.out.println("계좌 잔액 : " + loggedInMember.getBalance() + "원");
	}
	
	double doWithdraw(double amount) {
		if((balance - amount) >= 0) {
			balance -= amount;
			System.out.println("출금이 완료되었습니다.");
		}
		else {
			System.out.println("잔액이 부족합니다.");	
		}
		return balance;
	}
	
	void checkBalance(Member loggedInMember) {
		System.out.println("잔고 : " + loggedInMember.getBalance() + "원");
	}
	
}
