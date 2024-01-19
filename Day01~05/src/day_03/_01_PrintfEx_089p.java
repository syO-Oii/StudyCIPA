package day_03;

public class _01_PrintfEx_089p {
	public static void main(String[] args) {
		
		// %s = String형
		// %d = 정수형 
		// %n = 줄바꿈, Enter역할
		// %f = float형
		// %t = date, time형
		// %o = 8진수 정수형
		// %x = 16진수 정수형
		// %b = boolean형
		// %e = 지수 표현형
		
		// %20s처럼 앞에 숫자를 붙일 경우 입력한 수만큼 공간을 할당함
		// 숫자가 양수면 문자는 오른쪽정렬
		// 숫자가 음수면 문자는 왼쪽정렬
		
		// %3.2f는 소수점 이하 2자리만 출력하게 함
		// %03d는 3자리를 차지하고, 만약 수가 3자리가 되지않으면 빈공간에 0을 채워넣게됨
		
		// 시간출력
		// date 객체는 시간정보를 가지고 있다
		// %tH = Date의 Hour값 출력 
		// %tM = Date의 Minute값 출력
		// %tS = Date의 Second값 출력
		// %tA = Date의 요일
		// %tB = Date의 Month값 출력
		// %tY = Date의 Year값 출력
		
		
		System.out.printf("%10d",3334);			// d = 정수형
		System.out.printf("%2.6f",3.141592);	// f = 실수형
	}
}
