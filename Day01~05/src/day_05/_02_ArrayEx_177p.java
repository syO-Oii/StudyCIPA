package day_05;

public class _02_ArrayEx_177p {
	public static void main(String[] args) {
		int[] scores;	// 혹은 int scores[];
		// System.out.println(scores);		// 아직 초기화가 되지 않았기 때문에 동작 불가
		
		//								따라서 아래와 같이
		// int[] scores = null;			1. 초기화를 하거나 
		// int[] scores = {88, 97, 79}  2. 값을 미리 넣어두거나
		// int[] scores == new int[3];	3. 힙 영역을 설정해둬야 한다. (이번 예시는 3칸)
		
		String[] names = new String[5];
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(names[i]);
		}
		
		
		String[] score = { "1", "2", "3" };		// score과 num은 다른 힙 영역을 만들어서 사용 (new)
		String[] numb = { "1", "2", "3" };		// 내용이 같다고 해서 일반적인 참조영역처럼 같은 주소를 사용하지 않는다는것을 명심하기.
		System.out.println(score == numb);
		
		String str = "abcde";
		System.out.println(names.length == str.length());		// names.length = 배열의 길이 = 5
																// str.length = 문자열(abcde)의 길이 = 5
																// 두개의 개념은 미묘하게 다르다
		
		
		
		
		
		
		
	}
}
