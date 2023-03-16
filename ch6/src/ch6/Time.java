package ch6;

public class Time {
	private int hour;
	private int minute;
	private int second;

	// 멤버변수가 private 키워드를 사용하게 되면
	// 외부에서 접근 불가
	// == > 메소드를 통해서만 class 속성의 값을 얻거나 변경 가능토록 제공해야 함
	// getter/setter 이용

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}

	public void setHourOver(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		} else {
			this.hour = hour%24;
		}
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public void setMinuteOver(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		} else {
			hour+=minute/60;
			setHourOver(hour);
			this.minute = minute%60;
		}
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

	public void setSecondOver(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		} else {
				minute+=second/60;
				setMinuteOver(minute);
				setHourOver(hour);
			this.second = second%60;
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

}
