package day_03;

public class _04_LoopEx_148p {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n-------------------------");
		
		int j = 0;
		for (;;) {
			if(j >= 10) {
				break;
			}
			System.out.print(j + " ");
			j++;
		}
		System.out.println("\n-------------------------");
		
		int k = 0;
		while(k < 10) {
			System.out.print(k + " ");
			k++;
		}
		
	}
}
