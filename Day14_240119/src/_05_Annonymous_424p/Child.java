package _05_Annonymous_424p;

// 익명객체 예시

class Parent{
	void method();
}

public class Child extends Parent{
	public static void main(String[] args) {
		new Child();
		new Parent() {		
			// Child가 상속관계에 있을 때 익명 부모 객체는 '자식'으로 분류된다.
			@Override
			void method() {
				super.method();
			}
			
		};	
	}
}
