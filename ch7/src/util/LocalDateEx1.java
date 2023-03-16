package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx1 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now()); // now는 스태틱
		
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue()); // 1~12월로 처리 잘 됨
		System.out.println(today.getDayOfMonth());

		LocalTime time = LocalTime.now();
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		
	}

}
