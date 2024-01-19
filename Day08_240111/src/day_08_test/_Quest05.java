package day_08_test;

public class _Quest05 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int result = 0;
		// Q5. x와 y 값을 바꾸는 프로그램
		
		System.out.printf("바꾸기 전 x : %d, y : %d\n", x, y);
		
		result = x;
		x = y;
		y = result;
		
		System.out.printf("바꾼 후 x : %d, y : %d\n", x, y);
	}
}
