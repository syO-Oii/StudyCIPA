package _02_Exception_446p;


class MyClass2{
	void method() throws _06_MyException {
		//
		throw new _06_MyException("나의 예외 상황");
	}
}

public class _06_MyExceptionEx {
	public static void main(String[] args) {
		MyClass2 mc = new MyClass2();
		try {
			mc.method();
		} catch (_06_MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
