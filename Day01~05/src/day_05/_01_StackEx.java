package day_05;


// 스택 : 자료구조

// 힙 : 임의의 공간에서

public class _01_StackEx {
	public static void main(String[] args) {
		int age = 32;				// 기본타입(primitive type, 정수), 스택에 값 바로 저장
		double price = 100.5;		// 기본타입(실수), 스택에 값 바로 저장
		
		String name = "홍길동";		// 참조타입, 힙 영역의 String 객체 번지값 저장
		String hobby = "달리기";	// 참조타입, 힙 영역의 String 객체 번지값 저장
		
		// 스택 영역					// 힙 영역
		// age = 32
		// price = 100.5
		// name = 100번지 ---------->	// 100번지 - 홍길동 (String 객체)  
		// hobby = 200번지---------->	// 200번지 - 달리기 (String 객체) 
		
		// ---------------------------------------------------------------
		
		// Null과 NullPointerException
		int[] intArray = null;		// 힙 값을 찾지 않겠다. (객체를 참조하지 않겠다)
		//intArray[0] = 10;			// 힙에 주소값이 없는데 10이라는 변수를 넣어서 오류 발생
		
		String str;
		//System.out.println(str.length());		// nullPointerException = str 값이 없어서 초기화 하라는 오류가 발생
		
		String str1 = "가나다";
		System.out.println(str1.length());
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1 == name2);		// 결과값 = true -> 주소값(번지수)가 같다는 의미
												// 만약 변수의 내용이 같은지 비교하고 싶다면 .equals(); 를 사용한다. 
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		System.out.println(name3 == name4);		// 결과값 = false -> 주소값(번지수)가 달라짐
		
	
		
		
		
		
		
		
	}
}
