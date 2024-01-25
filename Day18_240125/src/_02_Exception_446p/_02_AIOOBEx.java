package _02_Exception_446p;


// ArrayIndexOutOfBoundsException
// 배열 범위 초과
public class _02_AIOOBEx {
	public static void main(String[] args) {
		int[] arr = new int[4];
		for(int i = 0; i < 5; i++) {
			arr[i] = i;					// arr[i]의 길이는 4, 따라서 arr[3]까지만 사용이 가능함.
										// 해당 for문은 arr[4]까지 확인이 가능하므로 배열의 범위를 초과하게 된다.
			
			System.out.println(arr[i]);
		}
	}
}
