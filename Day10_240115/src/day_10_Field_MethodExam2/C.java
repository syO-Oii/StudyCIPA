package day_10_Field_MethodExam2;

import day_10_Field_MethodExam1.A;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;	// 가능
		//a.field2 = 1;	// 불가능, default 필드 접근 불가
		//a.field3 = 1;	// 불가능, private 필드 접근 불가
		
		a.method1();	// 가능
		//a.method2();	// 불가능, default 메소드 접근 불가
		//a.method3();	// 불가능, private 메소드 접근 불가
	}
}
