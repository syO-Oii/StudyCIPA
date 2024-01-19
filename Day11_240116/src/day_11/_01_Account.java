package day_11;

public class _01_Account {
	private String name;
	private int balance;		// 은행 잔고 (마이너스 통장 불가)
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {		
		return balance;
	}
	public void setBalance(int balance) {
		if(balance > 0) {
			this.balance = balance;
		} else {
			System.out.println("금액을 확인 해 주세요.");
		}
	}
}
