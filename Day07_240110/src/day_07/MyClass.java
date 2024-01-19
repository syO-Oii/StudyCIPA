package day_07;

public class MyClass {
	int x;
	int y;
	int j;
	
	public MyClass() {
		
	}
	
	public MyClass(int x) {
		this(x, 0, 0);		// MyClass(int x, int y, int j) 생성자 호출
		System.out.println("1번 생성자");
	}
	
	public MyClass(int x, int y) {
		this(x, y, 0);
		System.out.println("2번 생성자");
	}

	public MyClass(int x, int y, int j) {
		this.x = x;
		this.y = y;
		this.j = j;
		System.out.println("3번 생성자");
	}
	
	public static void main(String[] args) {
		MyClass mc = new MyClass(2,3);
		MyClass mc2 = new MyClass(250);
	}
	
}
