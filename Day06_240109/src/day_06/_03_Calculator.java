package day_06;

public class _03_Calculator {
	//전역변수 설정
	static int sx;
			
	int x;
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
		System.out.println("sx : " + sx);
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	//---------------------------------------------------------
	// 메소드 오버로딩
	// 메소드 이름은 plus로 동일하지만 return 타입이 다름
	// 매개변수 내용도 다름
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	double plus (double x, double y) {
		return x + y;
	}
	//---------------------------------------------------------
	
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void printX() {
		System.out.println(x);
	}
	
	// 정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
}
