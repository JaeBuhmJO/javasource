package util;

import java.text.ParseException;

/* 형식화 클래스
 * java.text 패키지
 * 소수점, 콤마 ...
 * 날짜, 시간 ..
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date d = new Date();
		
		System.out.println(sdf);
		System.out.println(d);
		System.out.println(sdf.format(d));
		
		//printf 마냥 모양을 꾸밀 수 있음
		SimpleDateFormat sdf2 = new SimpleDateFormat("y년 yy년 MM월 dd일 EEE a hh시 m분 초ssss");
		System.out.println(sdf2.format(d));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			//parse() 날짜 데이터의 출력 형식을 변환
			d = sdf3.parse("2023년 03월 09일");
			System.out.println(d); // Thu Mar 09 00:00:00 KST 2023
			System.out.println(sdf4.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
