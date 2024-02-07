package _02_Collection;

import java.util.ArrayList;
import java.util.List;

public class _01_ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// String 객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size + "\n");
		
		// 2번 인덱스 객체 얻기
		String skill = list.get(2);
		System.out.println("2번 위치 : " + skill + "\n");
		
		for(int i = 0 ; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + "번째 : " + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i = 0 ; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + "번째 : " + str);
		}
		
		
	}
}	
