package _01_Java_lang_Object;

import java.util.HashMap;

//객체 해시코드(hashcode) 비교 예제

public class _03_KeyEx {
	public static void main(String[] args) {
		
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 Hashmap 객체 생성
		HashMap<_03_Key, String> hashMap = new HashMap<_03_Key, String>();
		
		// 식별키 new Key(1)로 홍길동 저장
		hashMap.put(new _03_Key(1), "홍길동");
		
		// 식별키 new Key(1)으로 홍길동을 읽어옴
		String value = hashMap.get(new _03_Key(1));
		System.out.println(value);
		
		
	}
}
