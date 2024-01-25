package _02_Exception_446p;

public class _01_NullPointerExceptionEx {
	public static void main(String[] args) {
		MyClass mc = null;			// MyClass의 객체를 참조하고 있지 않음
		System.out.println(mc);
		mc.method();				// 객체의 주소값을 확인 할 수 없음
		
		
		String data = null;						// String 객체를 참조하고 있지 않음
		System.out.println(data.toString());	// 객체의 주소값을 확인 할 수 없음
	}
	
	class MyClass {
		void method() {}
	}
}


