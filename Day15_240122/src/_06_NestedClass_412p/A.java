package _06_NestedClass_412p;

public class A {
	// 인스턴스 멤버 클래스
	class B {}
	// 정적 멤버 클래스
	static class C {}
	
	// 인스턴스 필드
	B field1 = new B();
	C field2 = new C();

	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 메소드
	static void method2() {
		// B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드 초기화
	// static B field3 = new B();		// 사용 불가, A 객체가 생성되어야 static B 선언이 가능
	static B field3 = new A().new B();	// 사용 가능, A 객체를 만들었기 때문에 static B 선언 가능
	static C field4 = new C();
	
	

}
