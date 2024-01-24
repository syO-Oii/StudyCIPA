package _04_427p;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		System.out.println("-------------------------");
		anony.method1();
		System.out.println("-------------------------");
		anony.method2(new Person() {
			void study() {
				System.out.println("출근 전 영어단어를 공부합니다.");
			}
			
			
			@Override
			void wake() {
				System.out.println("8시 기상");
				study();
			}			
		});
	}	
}
