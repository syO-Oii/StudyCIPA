package _04_Throw;

// 떠넘겨지지 않는 상황 예시
class AnyClass3 {
	// 실행 예외 상황이라 throw를 할 필요는 없다 (강제성 없음)
	void anyMethod(){
		throw new RuntimeException();
	}
	
	// 실행 예외 상황이라 throw를 할 필요는 없다 (강제성 없음)
	void anyMethod2() {
		throw new NullPointerException();
	}
}


public class ThrowEx3 {
	public static void main(String[] args) {
		AnyClass3 ac = new AnyClass3();
		
		ac.anyMethod();
		ac.anyMethod2();
		
		// 만약 예외가 발생하는 상황이 확실하다면 try-catch를 써주자.
		try {
			ac.anyMethod2();
		} catch (NullPointerException e) {
			
		}
		System.out.println("계속 실행중");
		
	}
}
