package _06_NestedClass_412p;

public class Main {
	public static void main(String[] args) {
		A.method2();		// 정적 메소드 호출
		A.B b = A.field3;	// new A().new B()
		A.C c =A.field4;	// new C();
		
		A a = new A();
		a.method1();
		A.B b1 = a.field1;	// new B();
		A.C c1 = a.field2;	// new C();
		
	}
}
