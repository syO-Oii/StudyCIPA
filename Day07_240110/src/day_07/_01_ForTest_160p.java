package day_07;

public class _01_ForTest_160p {
	public static void main(String[] args) {
		for(int i = 0 ; i < 4; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i = 0 ; i < 4; i++) {
			for(int j = 1 ; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k <= i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
