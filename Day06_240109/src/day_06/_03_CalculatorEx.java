package day_06;

public class _03_CalculatorEx {
	
	
	public static void main(String[] args) {
		_03_Calculator cal = new _03_Calculator();
		cal.powerOn();
		cal.powerOff();
		cal.printX();
		
		cal.x = 100;
		cal.printX();
		System.out.println(cal.plus(5, 37));
		cal.printX();
		
		_03_Calculator cal12 = new _03_Calculator();
		System.out.println(cal12.x);
		
		// 클래스이름 + 전역변수 입력을 해야 해당 값을 수정할 수 있음 
		_03_Calculator.sx = 5;
		
		cal.powerOn();
		cal12.powerOn();
		
		_03_Calculator cal3 = new _03_Calculator();
		int num1 = cal3.plus(100, 200);
		System.out.println(num1);
		
		double num2 = cal3.plus(3.14, 2.77);
		System.out.println(num2);
		
		System.out.println("----------사각형 넓이 구하기----------");
		
		_03_Calculator cal4 = new _03_Calculator();
		double num3 = cal4.areaRectangle(5);	// 한 변의 길이가 5인 정사각형
		System.out.println("정사각형의 넓이 : " + num3);
		
		double num4 = cal4.areaRectangle(8, 7);
		System.out.println("직사각형의 넓이 : " + num4);
		
	}
}
