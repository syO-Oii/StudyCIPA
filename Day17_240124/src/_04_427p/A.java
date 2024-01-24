package _04_427p;

class Parent{
	void parentMethod() {}
}

public class A {
	Parent field = new Parent() {
		int childField;
		void childMethod() {}
		
	};		// 필드 : Parent의 익명 자식 객체 생성
	
	void method() {				// 클래스 A의 메소드
		field.parentMethod();	// 부모의 값을 데려와서 쓸 수 있음
	}		
}