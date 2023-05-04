package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.domain.PageDTO;
import board.service.BoardListService;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");

		int page = Integer.parseInt(request.getParameter("page"));
		if (page == 0) {
			page = 1;
		}
		int amount = Integer.parseInt(request.getParameter("amount"));
		if (amount == 0) {
			amount = 30;
		}
		PageDTO pageDTO = new PageDTO(criteria, keyword, page, amount);

		BoardListService service = new BoardListService();
		List<BoardDTO> list = service.getList(pageDTO);

		// 액션포워드
		request.setAttribute("list", list);
		request.setAttribute("pageDTO", pageDTO);
		return new ActionForward(false, "listForm.jsp");
	}
}
