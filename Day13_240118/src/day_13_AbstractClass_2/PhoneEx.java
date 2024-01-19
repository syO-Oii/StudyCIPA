package day_13_AbstractClass_2;

public class PhoneEx {
	public static void main(String[] args) {
		//Phone phone = new Phone();	// 추상클래스는 객체 생성 불가함
		//Phone phone2 = new SmartPhone();
		Phone phone3 = new SmartPhone2(1);
		if(phone3 instanceof SmartPhone) {
			SmartPhone sp = (SmartPhone) phone3;
			System.out.println("성공");			
		} else {
			System.out.println("실패");
		}
		
	}
}
