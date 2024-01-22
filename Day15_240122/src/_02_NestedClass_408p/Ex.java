package _02_NestedClass_408p;

public class Ex {
	public static void main(String[] args) {
		A a = new A();					// 클래스 A 객체 생성
		A.B b = a.new B();				// 클래스 A 내의 클래스 B 객체 생성
		A.B b1 = new A().new B();		// 바로 위와 같은 의미
		
		b.field1 = 3;
		b.method1();
		
		b1.field1 = 5;
		b1.method1();
		
		// 그러나 일반적으로 외부에서 A클래스 내의 B 클래스를 꺼내 쓰지는 않는다.
		// B 클래스는 A 클래스 내부에서 쓰려고 만들었기 때문
	}
}
