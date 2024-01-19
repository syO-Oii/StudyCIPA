package chap_02;
/*
다음과 같이 출력되도록 코드를 작성 해 보세요.
이름 : syO_Oii
나이 : 32
전화 : 010-1234-5678
*/

public class _05_Exam01 {
	public static void main(String[] args) {
		String name = "syO_Oii";
		int age = 32;
		String tel1 = "010";
		String tel2 = "1234";
		String tel3 = "5678";
		
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age + "\n");
		System.out.println("전화 : " + tel1 + "-" + tel2 + "-" + tel3);
	}
}
