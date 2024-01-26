package _03_Java_lang_Class;


class Car { }


public class _01_ClassEx {
	public static void main(String[] args) throws ClassNotFoundException {
		
		// 클래스 객체를 얻는 방법
		// 첫번째. Car.class => 파일 이름을 변수로 설정
		Class clazz = Car.class;		// Car.class의 파일을 변수로 사용할 수 있음
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		
		// 두번째, 패키지...클래스 이름을 써서 확인
		Class clazz2 = Class.forName("_03_Java_lang_Class.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());
		
		// 세번째
		Car car3 = new Car();
		Class clazz3 = car3.getClass();
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
		System.out.println(clazz3.getPackageName());
		
		
	}
}
