package day_09;

import java.util.Calendar;

public class _02_EnumWeekEx_208p {
	public static void main(String[] args) {
		Week today = null;	// 열거타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);	//일요일(1) ~ 토요일(7)까지의 숫자를 리턴
		
		switch(week) {
			case 1:
				today = Week.Sunday;
				break;
			case 2:
				today = Week.Monday;
				break;
			case 3:
				today = Week.Tuesday;
				break;
			case 4:
				today = Week.Wednesday;
				break;
			case 5:
				today = Week.Thursday;
				break;
			case 6:
				today = Week.Friday;
				break;
			case 7:
				today = Week.Saturday;
				break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.Monday) {
			System.out.println("야구 없는 날... ㅠ_ㅠ");
		} else {
			System.out.println("야구 보러 가자 !!!");
		}
	}
}
