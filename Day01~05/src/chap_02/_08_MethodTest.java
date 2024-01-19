package chap_02;

public class _08_MethodTest {
	public static void main(String[] args) {
		method();
		int ret = method(5);
		System.out.println(ret);
		
		method(2,5);
		System.out.println(method(375));
	}
	
	public static void method() {
		System.out.println("매소드 1 테스트");
	}
	
	public static void method(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		System.out.println("메소드 2 테스트");
	}
	
	public static int method(int x) {
		System.out.println("메소드 3 테스트");
		return x;
	}
	


}
