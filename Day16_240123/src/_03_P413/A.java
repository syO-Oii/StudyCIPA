package _03_P413;

public class A {
	int field1;
	void method1() {
		System.out.println("method1");
	}
	
	// 내부 클래스의 메소드에서 멤버 클래스에 접근하는 방법
	class B{
		void method() {
			field1 = 10;
			method1();
			System.out.println("method(), " + field1);
		}
	}
	
	// 메인 메소드는 static이기 때문에 객체 생성을 안해도 바로 사용이 됨
	// static이 아닌 class B를 사용하고 싶을 때는
	// A 클래스의 객체를 생성 한 이후 호출 할 수 있다.
	public static void main(String[] args) {
		System.out.println("실행");
		
		// A가 생성되어야 B 호출이 가능하다
		A a = new A();
		B b = a.new B();
		b.method();
		
		C c = new C();
	}
	
	// static 클래스를 선언한다면 main에서 바로 호출이 가능하다
	// 단 field1, method1()의 경우 지역멤버가 아니기 때문에 바로 사용이 어렵다.
	static class C{
		void method() {
		//	field1 = 15;
		//	method1();
			//System.out.println("method(), " + field1);
		}
	}
}
