package day_06;

public class AccountEx {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.name = "홍길동";
		acc.ssn = "990101";
		acc.tel = "010-1234-5678";
		System.out.println(acc);
		System.out.println(acc.name);
		
		Account acc2 = new Account();
		System.out.println(acc2);
		
		
		Account acc3 = new Account("황덕배", "380427", "010-1212-4848", 87);	
		System.out.println(acc3);
	
	
	}
}
