package day_10_ConstructorExam2;
import day_10_ConstructorExam1.A;
public class C {
	A a1 = new A(true);			// 가능
	//A a2 = new A(1);			// 불가능, default 생성자 접근 불가
	//A a3 = new A("문자열");		// 불가능, private 생성자 접근 불가
}
