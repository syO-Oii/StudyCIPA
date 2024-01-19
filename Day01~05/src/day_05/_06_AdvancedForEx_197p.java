package day_05;

public class _06_AdvancedForEx_197p {
	public static void main(String[] args) {
		int[] scores = {95, 78, 37, 84, 61, 58};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 : " + avg);
		
	}
}
