package _03_AnonymousObject_425p;

public class Parent {
	void parentMethod() {};
}

class Child extends Parent {
	void method1(Parent p) {}
	
	void method2() {
		method1(new Parent());	// 익명객체 생성
	}
	
	Parent field = new Parent() {

		@Override
		void parentMethod() {
			// TODO Auto-generated method stub
			super.parentMethod();
		}
		
	};
	
	void method() {
		Parent var = new Parent() {

			@Override
			void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			}
			
		};
	}
}