package day_11_04_ArrayList;

import java.util.ArrayList;
import java.util.List;


class Student {
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
}

public class ArrayListEx {
	public static void main(String[] args) {
		// 문자열을 가변적인 배열로 만듦
		ArrayList<String> arrList = new ArrayList<String>();		// 가변형 배열, 배열에 비해 속도가 느림
		String[] strArr = new String[100];						// 고정형 배열, ArrayList에 비해 속도가 빠름
		List<String> list = new ArrayList<>();					// List = 조상, ArrayList = 자식
		
		list.add("홍길동");
		list.add("김하나");
		list.add("차두리");
		
		for(String str : list) {
			System.out.println(str);
		}
		list.set(1, "박하순");
		
		for (String str : list) {
			System.out.println(str);
		}
		
		// 객체 배열 만들기
		Student [] studentArr = new Student[100];
		List<Student> studentList = new ArrayList<>();
		
		
		
		
		
		
		
		
	}
}




//              ┌  Set  - HashSet
//				│
//  Collection  ┼ List ┬ ArrayList
//				│		│
//				│		├ Vector - Stack
//				│		│
//				│		└ LinkedList
//				│
//				│
//				└ Queue - LinkedList