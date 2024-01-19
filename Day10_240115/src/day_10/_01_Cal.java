package day_10;

// 인스턴스 멤버
// 정적 멤버
// static
// p280 ~

public class _01_Cal {
	static int x;				// 정적 변수
	
	static int plus() {			// 정적 메소드
		return x + 100;
	}
	
	static int minus() {		// 정적 메소드
		return x - 100;
	}
	
	static void print() {		// 정적 메소드
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		_01_Cal cal = new _01_Cal();
		
		cal.print();		// 정상적인 사용 방법이 아님 
							//(print가 정적 메소드이기 때문에 객체를 생성 할 수 없음)
		
		x = 450;
		int y = plus();
		System.out.println(y);
		_01_Cal.print();		
	}

}
