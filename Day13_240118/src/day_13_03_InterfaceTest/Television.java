package day_13_03_InterfaceTest;

public class Television implements RemoteControl{
	private int volume;
	
	public void turuOn(){
		System.out.println("티비를 켭니다.");
	}
	
	public void turuOff(){
		System.out.println("티비를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 :" + this.volume);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
}

