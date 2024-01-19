package day_12;

public class _01_Child extends _01_Parent{
	
	// Parent.class의 method2를 재정의
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	
	// Child.class의 새로운 메소드
	public void method3() {
		System.out.println("Child-method3()");
	}
}
