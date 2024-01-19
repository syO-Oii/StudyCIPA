package day_08;

public class _01_CallByValue {
	public static void increase (int n) {
		n += 1;
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		int n = 100;
		increase(n);
		System.out.println(n);
	}
}
