package _03_NestedClass_408p_2;

public class Ex {
	public static void main(String[] args) {
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		
		// C가 정적 멤버 클래스이므로 객체화 하지 않고 바로 사용 가능
		A.C.field2 = 3;
		A.C.method2();
		
		
	}
}
