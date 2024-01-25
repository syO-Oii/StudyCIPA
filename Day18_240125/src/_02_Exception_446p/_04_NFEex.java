package _02_Exception_446p;


// ArrayIndexOutOfBoundsException
// 배열 범위 초과
public class _04_NFEex {
	public static void main(String[] args) {
		
		try {
			String data1 = "100";	
			String data2 = "a100";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			System.out.println(value1);
			System.out.println(value2);
		} catch(NumberFormatException e) {		// 숫자 형태가 아닐 경우 catch로 제어
			System.out.println(e.getMessage());
			System.out.println("예외가 발생했습니다.");
		}
	}
}
