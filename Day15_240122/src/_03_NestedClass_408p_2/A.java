package _03_NestedClass_408p_2;

public class A {
	/* 정적 멤버 클래스 */
	static class C {
		C() {}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void methodA() {
		C.field2 = 10;
		C c = new C();
		c.field1 = 3;
		c.field2 = 10;	// 정적필드는 객체가 아니라 클래스 이름으로도 접근 가능
		C.field2 = 10;	// 사용의 정석
	}
}


/*
	인스턴스 멤버로 만들어진 클래스는 보통 외부에서 사용 할 일이 없음
	정적 멤버로 만들어진 중복 클래스는 상위 클래스 생성 없이 자체 클래스로 객체 생성 가능
		
*/