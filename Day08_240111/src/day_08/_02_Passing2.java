package day_08;

class YourClass {
	int x;
}

public class _02_Passing2 {
	public static void main(String[] args) {
		YourClass yc = new YourClass();		// 힙 영역에 yc 주소 생성
		System.out.println("main : " + yc.x);
		method1(yc);	// method1에 yc 주소를 넣어줌 ( 변수 등 값을 넘겨준게 아님)
		System.out.println("main2 : " + yc.x);
		
		//YourClass yc3;					// 힙 영역에 클래스 생성이 되지 않아
		//yc3.x = 200;						// x 값을 넣어 줄 수 없음
	}
	
	public static void method1 (YourClass yc) {
		yc.x = 300;		// yc 주소를 찾아서 x값을 수정함
		return;
	}
	
	
}
