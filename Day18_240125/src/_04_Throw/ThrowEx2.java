package _04_Throw;

// 떠넘겨지지 않는 상황 예시
class AnyClass2 {
	void anyMethod() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}
}


public class ThrowEx2 {
	public static void main(String[] args) {
		AnyClass2 ac = new AnyClass2();
		
		try {
			ac.anyMethod();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
