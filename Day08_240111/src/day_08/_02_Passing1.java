package day_08;

public class _02_Passing1 {
	// 메소드
	public static void method1() {
		System.out.println(3);
		return;
	}
	
	// 메소드, 함수
	public static int method2(int y) {
		y += 1;		// y도 지역변수(생명주기 : method2)이나 호출한 곳에서 값을 넘겨 줘야 한다.		
		return y;
	}
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		method1();
		System.out.println(4);
		System.out.println(method2(2));
	}
}
