package ch6;

public class TimeEx1 {

	public static void main(String[] args) {
		Time time = new Time();
		
		time.setHour(10);
		time.setMinute(37);
		time.setSecond(25);
		
		System.out.printf("%d시 %d분 %d초\n",time.getHour(),time.getMinute(),time.getSecond());
		
		time.setHourOver(25);
		time.setMinuteOver(61);
		time.setSecondOver(61);
		
		System.out.printf("%d시 %d분 %d초\n",time.getHour(),time.getMinute(),time.getSecond());
		
	}

}
