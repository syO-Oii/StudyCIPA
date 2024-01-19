package day_10;

import day_10_PackageExam_hankook.SnowTire;
import day_10_PackageExam_hyundai.Engine;
import day_10_PackageExam_kumho.BigWidthTire;

// 클래스 실습 예제 : 290p

public class _07_Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// 각 패키지마다 Tire 클래스가 있으므로 패키지명을 구체적으로 써줘야한다.
	day_10_PackageExam_hankook.Tire tire3 = new day_10_PackageExam_hankook.Tire();
	day_10_PackageExam_kumho.Tire tire4 = new day_10_PackageExam_kumho.Tire(); 
	
}
