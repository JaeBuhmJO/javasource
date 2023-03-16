package abstr;

public class ActionEx {

	public static void main(String[] args) {
		//a Ctrl + Space bar => anonymous -> 아래와 같이 펼쳐진다
		Action action = new Action() {
			//Action 인터페이스를 구현해줄 클래스 익명으로 즉석 구현 된 것
			//구현용 클래스 한번만 쓸거면 따로 클래스 안만들고 이렇게 한다
			//사용은 인스턴스명으로
			@Override
			public void work() {
				System.out.println("Work");
			}
		}; // 여기 세미콜론 필수
		action.work();
	}

}
