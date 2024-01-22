package _04_NestedClass_409p;

public class LocalClass {
	void method() {
		/* 로컬 클래스, 메소드 내에서만 사용하기 때문에 접근제한자 사용 불가 */
		class D{
			D(){}						// 생성자
			int field1;					// 필드
			//static int field2;		// 접근제한자 static 사용 불가
			void method1() {}			// 메소드
			//static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
