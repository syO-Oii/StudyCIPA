package day_13_02_design.pattern;

public class KoreaCarFactory extends CarFactory {

	@Override
	public TireProduct createTire() {
		return new KoreaTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		// TODO Auto-generated method stub
		return new KoreaDoorProduct();
	}
	
}
