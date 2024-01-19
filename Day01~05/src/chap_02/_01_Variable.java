package chap_02;

public class _01_Variable {
	public static void main(String[] args) {
		int value = 0;
		System.out.println(value);
		int result = value + 10;
		System.out.println(result);
		
		// 자료 교환 방법 : 임의의 변수 하나를 만들어서 값을 상호로 변경
		int x = 15;
		int y = 20;
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : " + x + " y : " + y);
		System.out.printf("x : %d y : %d\n", x, y);
		
		int var1 = 100;
		{
			int var2 = 2;
			System.out.printf("val1 : %d, val2 : %d\n", var1, var2);
		}
		// System.out.printf("val1 : %d, val2 : %d\n", var1, var2); var2는 위의 블럭에서만 동작하는 변수이므로 블럭 밖을 나오는 순간 삭제됨
		{
			int var3 = 56;
			System.out.printf("val1 : %d, val2 : %d\n", var1, var3);
		}
		
		
		
	}
}
