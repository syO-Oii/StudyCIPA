package _02_Exception_446p;


// ArrayIndexOutOfBoundsException
// 배열 범위 초과
public class _03_AIOOBEx2 {
	public static void main(String[] args) {
		
		try {
			String str = args[0];	
			String str1 = args[1];
			
			System.out.println(str);
			System.out.println(str1);
		} catch(ArrayIndexOutOfBoundsException e) {		// args에 값이 없을 경우 catch로 제어
			System.out.println(e.getMessage());
			System.out.println("예외가 발생했습니다.");
		}
	}
}
