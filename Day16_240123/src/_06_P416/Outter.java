package _06_P416;

// 중첩 클래스에서 바깥 클래스 참조 얻기

public class Outter {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);		// Nested 클래스 내의 field
			System.out.println(field);			// Nested 클래스 내의 field
			System.out.println(Outter.this.field);		// Outter 클래스 내의 field
			// 이렇게 바깥 클래스의 참조를 얻기 위해서는 '클래스명.this.내용'을 쓰면 된다.
			
			System.out.println(Outter.str);		// static으로 설정해두면 '클래스명.변수명'을 바로 사용할 수 있다.
		}
	}
	
	static String str = "static-str";

}
