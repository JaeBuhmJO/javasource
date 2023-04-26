package action;

/*
 * 디자인 패턴 : 개발 방식 정의
 * 
 * 싱글톤(Singleton) 패턴
 * 객체 생성하는 메소드가 여러번 호출되어도 단 하나의 생성자가 생성하는 객체가 리턴
 *  => 객체는 하나만 생성
 * 
 */

public class ActionFactory {
	private static ActionFactory actionFactory;

	private ActionFactory() {
		// 굳이 생성자를 private으로 막고 내부 메소드로 생성하는 이유 : 싱글톤 디자인 패턴
	};

	public static ActionFactory getInstance() {
		if (actionFactory == null) {
			actionFactory = new ActionFactory();
		}
		return actionFactory;
	}

	// Action 리턴 메소드
	Action action;
	public Action action(String cmd) {
		if (cmd.equals("/insert.do")) {
			action = new InsertAction();
		} else if (cmd.equals("/list.do")) {

		} else if (cmd.equals("/update.do")) {

		} else if (cmd.equals("/delete.do")) {
			action = new DeleteAction();
		}
		return action;
	}
}
