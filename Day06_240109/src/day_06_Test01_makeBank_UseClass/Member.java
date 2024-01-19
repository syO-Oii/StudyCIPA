package day_06_Test01_makeBank_UseClass;

public class Member {
	private String memberId;		// 아이디
	private String password;		// 비밀번호
	private double balance;			// 잔액
		
	public Member(String memberId, String password, double balance) {
		this.memberId = memberId;
		this.password = password;
		this.balance = balance;
	}
	
	
	String getMemberId() {
		return memberId;
	}
	
	String getPassword() {
		return password;
	}
	
	double getBalance() {
		return balance;
	}
	
	void deposit(double amount) {
		balance += amount;
		System.out.println("입금이 완료되었습니다.");
	}
	
	void withdraw(double amount) {
	
		if((balance - amount) >= 0) {
			balance -= amount;
			System.out.println("출금이 완료되었습니다.");
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
	}
		
	
}
