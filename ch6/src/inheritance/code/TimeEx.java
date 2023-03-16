package inheritance.code;

public class TimeEx {

	public static void main(String[] args) {
		Time time = new Time();
		
//		time.hour = 30;
		//속성 변수 직접 변경시 값에 대한 통제 불가능
		//메소드를 통해서 값이 들어오면, 정상 범주에 해당하는지 체크 및 가공 가능
		time.setHour(30);
		System.out.println(time.getHour());
		time.setMinute(61);
		System.out.println(time.getMinute());
		time.setSecond(61);
		System.out.println(time.getSecond());
	}

}
