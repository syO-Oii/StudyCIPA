package _02_Math;

public class _01_MathEx {
	public static void main(String[] args) {
		// abs = 절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		
		// ceil = 올림값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		
		System.out.println("v3 : " + v3);
		System.out.println("v4 : " + v4);
		
		// floor = 버림값
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		
		System.out.println("v5 : " + v5);
		System.out.println("v6 : " + v6);
		
		// max = 최대값
		double v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		
		System.out.println("v7 : " + v7);
		System.out.println("v8 : " + v8);
		
		// min = 최소값
		double v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		
		System.out.println("v9 : " + v9);
		System.out.println("v10 : " + v10);
		
		
		// random = 랜덤값
		double v11 = Math.random();
		System.out.println("v11 : " + v11);
				
		// rint = 가까운 정수의 실수값
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.8);
		System.out.println("v12 : " + v12);
		System.out.println("v13 : " + v13);
		
		// round = 반올림값
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.8);
		System.out.println("v14 : " + v14);
		System.out.println("v15 : " + v15);
		
	}
}
