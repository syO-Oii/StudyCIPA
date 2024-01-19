package day_06;

public class Account {
	String nation = "대한민국";
	String name;
	String ssn;
	String tel;
	int age;
	
	public Account() {
		System.out.println("내가 만든 Account");
	}
	
	public Account(String str) {
		
	}
	
	public Account(String name, String ssn, String tel, int age) {
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", age=" + age + "]";
	}
	
		
	
}
