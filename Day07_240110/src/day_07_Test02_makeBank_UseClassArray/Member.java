package day_07_Test02_makeBank_UseClassArray;

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
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
