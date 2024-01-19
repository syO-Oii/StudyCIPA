package day_12;

public class _01_ChildEx {
	public static void main(String[] args) {
		_01_Child child = new _01_Child();
		
		_01_Parent parent = child;    // 자동타입 변환
		parent.method1();
		parent.method2();	// child에서 재정의 된 메소드 호출
		//parent.method3(); // 호출 불가
	}
}
