package _05_AnonymousInterface;

public class Anonymous {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켜다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끄다.");
		}
		
	};
}
