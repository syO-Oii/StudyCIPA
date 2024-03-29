package day_13_02_design.pattern;

import java.util.Scanner;

public class UseEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 사용 예시
		 * CarFactory korCarFactory = new KoreaCarFactory(); TireProduct tireProduct =
		 * korCarFactory.createTire(); DoorProduct doorProduct =
		 * korCarFactory.createDoor();
		 * 
		 * String tire = tireProduct.makeAssemble(); String door =
		 * doorProduct.makeAssemble(); System.out.println(tire);
		 * System.out.println(door);
		 */
		
		CarFactory carFactory = null;
		System.out.println("생산하려는 차종을 선택하세요. (1. 국산차, 2. 미국차)");
		System.out.print("선택 : ");
		String key = sc.nextLine();
		
		switch(key) {
		case "1":
			carFactory = new KoreaCarFactory();
			break;
		case "2":
			carFactory = new StateCarFactory();
			break;
		default:
			System.out.println("다시 선택하세요.");
			break;
		}
		
		TireProduct tireProduct = carFactory.createTire();
		DoorProduct doorProduct = carFactory.createDoor();
		
		System.out.println(tireProduct.makeAssemble());
		System.out.println(doorProduct.makeAssemble());
		
	}
	
	
	
}
