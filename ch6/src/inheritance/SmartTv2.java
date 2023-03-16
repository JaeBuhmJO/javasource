package inheritance;

//Tv 클래스를 상속받은 SmartTv
public class SmartTv2 extends Tv2 {
	
	public SmartTv2(boolean power, int channel) {
		super(power, channel);
	}

	boolean caption;

//	public SmartTv2() {
//		super();
//	}

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}

}
