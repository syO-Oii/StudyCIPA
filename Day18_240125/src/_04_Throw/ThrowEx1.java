package _04_Throw;


class AnyClass {
	void anyMethod() throws Exception{	// 메소드에서 예외사항을 던짐
		
	}
	
	
	void method2(){	// anyMethod에서 받은 정보를 처리함
		try {
			anyMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThrowEx1 {
	public static void main(String[] args) {
		AnyClass ac = new AnyClass();
		ac.anyMethod();		// anyMethod()에서 던진 내용을 try-catch 처리를 하거나 또 한번 더 던져야함
		
		ac.method2();		// method2()에서 던진 내용을 받았으므로 그대로 사용 가능함
	}
}
