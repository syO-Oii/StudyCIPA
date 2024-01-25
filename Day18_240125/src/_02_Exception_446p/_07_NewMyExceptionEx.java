package _02_Exception_446p;

class NewMyClass {
	void method() {
		throw new _07_NewMyException("최신식 예외 처리 방법");
	}
}

public class _07_NewMyExceptionEx {
	public static void main(String[] args) {
		NewMyClass mc = new NewMyClass();
		mc.method();
		
	}
}
