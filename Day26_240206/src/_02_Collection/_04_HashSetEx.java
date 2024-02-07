package _02_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _04_HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");		// Java는 중복값으로 한번만 저장됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		Iterator<String> iterator = set.iterator();	// 반복자 얻기
		while(iterator.hasNext()) {					// 객체 수 만큼 루핑
			String element = iterator.next();		// 1개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체 수 : " + set.size());
		
		iterator = set.iterator();	// 반복자 얻기
		for(String element : set) {					// 객체 수 만큼 루핑
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어있음");}
		
	}
}
