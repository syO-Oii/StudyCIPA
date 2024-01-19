package day_10;

//인스턴스 멤버
//정적 멤버
//static
//p280 ~

public class _02_ClassName {
	int field1;
	void method1() {}
	static int field2;
	static void method2() { }
	
	
	// static 변수 / 메소드는 클래스의 로딩이 끝나는 순간 메모리에 업로드 됨
	// 따라서 같은 static 변수 / 메소드가 아니면 사용이 안됨
	
	static void method3() {
		// field1 = 10;			// field1이 정적 변수가 아니기 때문에 사전에 메모리에 생성이 안됨
		field2 = 10;
		
		// 따라서 위와 같은 경우에는 객체를 선언 해 주어야 한다.
		_02_ClassName cn = new _02_ClassName();
		cn.field1 = 10;
	}
	
	void method4() {							
		field1 = 20; //(= this.field1)
		field2 = 20; //(= ClassName.field2)
	}
}
