package _03_Quest02_403p;

// 상속 중첩 테스트

interface InterA {
	void method();
	
}

class ClassB implements InterA{
	@Override
	public void method() {	}
}

public class ClassA extends ClassB{
	public static void main(String[] args) {
		InterA ita = new ClassA();
	}
}
