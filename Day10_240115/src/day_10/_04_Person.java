package day_10;

// final 예시
// p281 ~

public class _04_Person {
	final String name = "이름";
		
	// "이름" 으로 초기화를 했기 때문에 수정 불가
	// 만약 final String name; 으로 끝냈으면 생성자에서 초기화한 값 한번에 한해 허용 가능
	public _04_Person(String name) {
		//this.name = name;
	}
	
	public static void main(String[] args) {
		_04_Person person = new _04_Person("홍길동");
		
		final int x;		// final이기 때문에 초기화를 해줘야 함
		x = 300;
		// x = 500;			// 300 값으로 초기화를 했기 때문에 수정 불가
		
	}
	
	// final, static, public 등등은 상수로 취급함
	// 순서가 바뀌어도 동작에는 문제 없다
	
	final static public double pi = 3.141592;
	public final static double pi1 = 3.1415;
	
	static int number;
	
	
}
