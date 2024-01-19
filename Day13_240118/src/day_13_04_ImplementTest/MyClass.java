package day_13_04_ImplementTest;

public class MyClass implements InterTest {
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void test1() {
		System.out.println("이것은 혁명적인 test1() 입니다!");
	}
	public static void main(String[] args) {
		InterTest it = new MyClass();
		it.test1();
		InterTest.test5();

	}
	
	 
}
