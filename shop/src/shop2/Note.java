package shop2;

public class Note {

	public static void main(String[] args) {
		Product cp = new CellPhone("갤럭시", 1000000, "삼성");
		cp.printDetail();
		cp.printExtra();

		Product st = new SmartTv("올레드", 2000000, "엘지");
		st.printDetail();
		st.printExtra();
	}

}
