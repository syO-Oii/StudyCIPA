package day_10_Exam;

public class ShopService_285p {
	private static ShopService_285p shopService = new ShopService_285p();	// 클래스 내에서 객체 호출은 가능
	private ShopService_285p() {}	// private 생성자 생성 -> 외부에서 생성자 사용 불가
	
	// getInstance로 수정의 여지는 남겨두는 느낌
	public ShopService_285p getInstance() {
		return shopService;
	}
	
	
}
