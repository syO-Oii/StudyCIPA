package day_13_AbstractClass_2;

public class SmartPhone2 extends Phone{
	int y;
	public SmartPhone2(int y) {
		super(y);
		this.y = y;
	}
	
	public void printX() {
		System.out.println(x);
	}
}
