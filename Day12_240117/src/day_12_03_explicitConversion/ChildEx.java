package day_12_03_explicitConversion;

public class ChildEx {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = "data2";		자식의 메소드, 필드는 사용 불가
		 * parent.method3();
		 * */
		
		Child child = (Child) parent;	// 강제 타입 변환, 문법상 오류가 없으나 에러가 발생 할 수는 있음
		child.field2 = "data2";	
		child.method3();
	}
}
