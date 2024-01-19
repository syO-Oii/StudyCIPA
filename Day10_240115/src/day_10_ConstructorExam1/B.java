package day_10_ConstructorExam1;

public class B {
	A a1 = new A(true);			// 가능
	A a2 = new A(1);			// 가능
	//A a3 = new A("문자열");		// 불가능, private 생성자 접근 불가
	
}
