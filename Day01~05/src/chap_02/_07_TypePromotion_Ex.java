package chap_02;

public class _07_TypePromotion_Ex {
	public static void main(String[] args) {
		System.out.println(1.0 / 2);	// 0.5
		
		int x = 1;
		int y = 2;
		double result = x / y;				// int형으로 임시 계산이 되었기 때문에 결과값은 0.5가 아닌 정수 0만 출력이 됨
		System.out.println(result);			// 결과값 : 0
		
		double result2 = x / (double) y ;	// 따라서 계산식에서 하나 이상의 값을 사전에 형변환을 해 주어야 올바르게 인식함
		System.out.println(result2);		// 결과값 : 0.5
		
		
		int intValue = 10;
		double doubleValue = 5.5;
		int result3 = (int)(intValue + doubleValue);	// int로 통합하여 형변환 하였기 때문에 10 + 5.5 = 15.5가 아닌, 정수 15만 저장이 됨
		System.out.println(result3);		// 결과값 : 15
		
		/*
		 * String str = 10 + 2; // 정수형으로 값이 저장되기 때문에 String에 변수 저장이 안됨
		 * System.out.println(str);
		 */
		String str2 = 10 + 2 + "";			// 따라서 뒤에 문자열 공백칸을 입력하거나
		String str3 = String.valueOf(10 + 3);	// String.valueOf 함수를 이용하여 강제로 String 형태로 만들어줘야한다.
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = "" + 10 + 5;			// 다만 사전에 문자화를 할 경우(공백을 넣을 경우) 뒤에 있는 변수 값들이 모두 '문자'로 인식이 된다
		System.out.println(str4);			// 결과값 : 105 (String)
		int strToInt = Integer.parseInt(str4);		// 문자열 값을 Integer.parseInt로 형변환 할 경우 Int형으로 값이 변환됨
		System.out.println(strToInt);		// 결과값 : 105 (int)
		
		String str5 = "3.14";				// str5 저장값 : 3.14 (String)
		double strToDouble = Double.parseDouble(str5);
		System.out.println(strToDouble);	// 결과값 : 3.14 (double)
		
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
	}

}	
