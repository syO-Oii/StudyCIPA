package _04_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 85);
		map.put("차두리", 70);
		map.put("이을용", 95);
		map.put("이순신", 100);
		map.put("차두리", 0);			// "차두리"라는 키의 값이 70 -> 0으로 변경
		
		System.out.println(map.get("차두리"));
		System.out.println(map.size());
		
	}
}
