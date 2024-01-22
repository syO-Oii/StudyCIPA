package _02_NestedClass_408p;

// static = 바로 접근이 가능하다는 개념으로 이해하기
// 인스턴스 멤버 안에서는 static 접근이 안된다.

public class A {
	/* 인스턴스 멤버 클래스 */
	class B {
		B(){}					// 생성자
		int field1;				// 필드
		// static int field2;		// 필드, 그러나 class B가 생성이 되어야만 사용이 가능하기 때문에
								// 중첩클래스 내에서 정적 변수를 만들 수는 없음.
		void method1() {}
		// static method2() {}		// 같은 이유로 정적 메소드는 허용하지 않음
	}
	
	/* 정적 필드 */
	static int field3;			// 정적 필드, 가능
	
	/* 인스턴스 멤버 메소드 */
	void methodA() {
		B b = new B();
		b.field1 = 3;
		b.method1();
	}
}
