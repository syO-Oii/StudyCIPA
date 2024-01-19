package day_11_02_protectedTest;

//protected 테스트 - 동일 패키지
public class B {
	public void method() {
		A a = new A();			//
		a.field = "value";		// 모두 접근 가능
		a.method();				//
	}
}
