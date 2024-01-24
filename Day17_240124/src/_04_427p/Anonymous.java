package _04_427p;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("8시에 출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시 40분에 기상합니다.");
			work();
		}
		
		
	};	// 익명 객체 생성
	void method1() {
		Person localVar = new Person() {
			void joging() {
				System.out.println("조깅");
			}

			@Override
			void wake() {
				System.out.println("7시 기상");
				joging();
			}			
		};
		localVar.wake();
		
	}
	
	void method2(Person person) {
		person.wake();
	}
	
	
}
