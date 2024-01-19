package day_11_03_protectedTest2;
import day_11_02_protectedTest.A;

// protected 테스트 - 다른 패키지
public class C {
	public void method() {
		A a = new A();		// 
		a.field = "value";  // 모두 접근 불가
		a.method();			//
	}
}
