package util;

/* 날짜와 시간
 * 1. java.util.Calendar 클래스
 * 2. java.util.Date 클래스
 * 3. java.time.LocalDate, LocalTime, LocalDateTime // 1.8버전부터 추가
 */

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar c; // abstract 클래스, new 못함
		//추상 클래스와 인터페이스는 new를 못하기 때문에 자식 클래스를 만들어서 사용
		//1970년 1월 1일 0시 0분이 항상 기준일시
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.toString());
		
		//get(int field)
		System.out.println("연도 : "+today.get(Calendar.YEAR));
		System.out.println("월(0~11월) : "+(today.get(Calendar.MONTH)+1));
		System.out.println("올해의 몇째 주 : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번달의 몇째 주 : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이번달의 며칠 : "+today.get(Calendar.DATE));
		System.out.println("위에거랑 같음 : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해 며칠째냐 : "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("일요일(1)부터 며칠째냐=요일 : "+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("오전(0) 오후(1) : "+today.get(Calendar.AM_PM));
		System.out.println("Hour(12) : "+today.get(Calendar.HOUR));
		System.out.println("Hour(24) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : "+today.get(Calendar.MINUTE));
		System.out.println("초 : "+today.get(Calendar.SECOND));
		System.out.println("밀리세컨드(0~999) : "+today.get(Calendar.MILLISECOND));
		
		
		
	}

}
