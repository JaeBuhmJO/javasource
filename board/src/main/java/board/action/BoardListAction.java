package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import board.service.BoardListService;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		BoardListService service = new BoardListService();

		// 액션포워드
		HttpSession session = request.getSession();
		session.setAttribute("list", service.getList());
		return new ActionForward(false, "listForm.jsp");
	}
}
