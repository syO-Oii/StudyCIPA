package _05_NestedClass_410;

// 중첩 클래스 객체 생성 테스트
public class Main {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();		// 인스턴스 멤버 클래스 B
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();		// 정적 멤버 클래스 C
		c.field1 = 3;
		c.method1();
		
		A.C.field2 = 5;			// 정적 변수 호출
		A.C.method2();			// 정적 메소드 호출
		
		a.method();
	}
}
