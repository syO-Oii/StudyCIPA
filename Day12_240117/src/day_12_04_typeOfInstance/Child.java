package day_12_04_typeOfInstance;

public class Child extends Parent {
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);	// Child 객체를 매개값으로 전달
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);	// Parent 객체를 매개값으로 전달
		//method2(parentB);	// 예외 발생		
		
		Parent parentC = new Child();
		
		// 메소드로 들어가기 전, 사전에 객체 타입을 확인함
		if(parentC instanceof Child) { // if(객체 instanceof 타입)
			method2(parentC);			// 예외를 잡아낼 수 있음
		} else {
			System.out.println("변환이 불가합니다.");
		}
	}
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {		// Child 타입으로 변환 가능한지 확인
			Child child = (Child) parent;	
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child)parent;		// ClassCastException 발생 가능성이 존재함
		System.out.println("method2 - Child로 변환 성공");
	}
}
