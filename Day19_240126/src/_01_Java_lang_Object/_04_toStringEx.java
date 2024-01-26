package _01_Java_lang_Object;

import java.util.Date;

//객체 비교(Object 예제)

public class _04_toStringEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());	// 해쉬코드 값 출력
		System.out.println(obj2.toString());	// 저장하고있는 문자열 리턴
	}
}
