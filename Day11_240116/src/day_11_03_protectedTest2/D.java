package day_11_03_protectedTest2;

import day_11_02_protectedTest.A;

// 상속 테스트
// protected는 자식 클래스만 접근 허용
// 자식이 아니면 접근이 불가함
public class D extends A{
	public D() {
		super();
		// A a = new A();		// 생성 불가
		this.field = "value";   // 접근 가능 -> 자식 클래스이기 때문 
		this.method();			
	}
	
	public void method() {
		this.field = "value2";
		this.method();
	}
}
