package day_05;

public class _07_StaticEx {
	
	static int y;		// 정적필드
	
	public static void main(String[] args) {
		System.out.println(y);
		y = 300;
		System.out.println(y);
		
		int x = 100;	// 지역변수
		System.out.println(x);
		
		x = m1(100);
		System.out.println(x);
		
	}
	
	public static int m1(int x) {	// 매개변수 
		x = x + 250;
		return x;
	}
	
}
