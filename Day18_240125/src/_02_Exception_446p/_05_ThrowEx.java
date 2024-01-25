package _02_Exception_446p;

class ThrowClass{
	void method(int x) throws Exception{

		if(x > 10) {
			throw new Exception("예외 발생!!! x 값 초과!!! ");	// 예외 발생 메세지 생성
		} else {
			System.out.println(x);
		}
		
	}
}

public class _05_ThrowEx {
	public static void main(String[] args) {
		ThrowClass tc = new ThrowClass();
		
		try {
			tc.method(15);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
