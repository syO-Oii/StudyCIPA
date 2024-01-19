package chap_02;

public class _06_TypePromotion_072p {
	// 자동 타입 변환(Promotion)이란 허용범위가 작은 타입이 허용범위가 큰 타입으로 저장될 때 발생하며,
	// 큰 허용범위의 타입으로 자동으로 변환되어 저장이 된다.
	// byte > short < int < long < float < double
	
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;	// byte 타입을 int로 자동 타입 변환 발생
		System.out.println(byteValue);
		System.out.println(intValue);
		
		// 정수 타입을 실수 타입으로 변환 시 자동으로 타입변환이 일어나게 됨
		long longValue = 50000000000L;
		float floatValue = longValue;		// 5.0E9f로 저장됨
		double doubleValue = longValue;		// 5.0E9로 저장됨
		System.out.println(longValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);
		
		char charValue = 'A';
		int intValue2 = charValue;	// 65가 저장됨
		System.out.println(charValue);
		System.out.println(intValue2);
		
		// ※ 중요 ※
		// byte -> char로는 변환 불가!!!
		// char의 경우 허용범위에 음수가 표현되지 않음
		// 그러나 byte의 경우 음수를 포함되어 자동변환이 일어날 수 없음
		
		// byte byteValue2 = 65;
		// char charValue2 = byteValue2;		// 컴파일에러 발생
		
	}

}
