package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.domain.PageDTO;
import board.service.BoardListService;
import board.service.BoardTotalService;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");

		int page = 1;
		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int amount = 30;
		if (request.getParameter("amount") != null) {
			amount = Integer.parseInt(request.getParameter("amount"));
		}
		// 페이지 나누기 정보와 검색정보 담아주기
		PageDTO pageDTO = new PageDTO(criteria, keyword, page, amount);

		BoardTotalService totSer = new BoardTotalService();
		int total = totSer.getTotalRow(pageDTO);

		BoardListService service = new BoardListService();
		List<BoardDTO> list = service.getList(pageDTO);
		
		// 전체 게시물 수 가져오기
		pageDTO = new PageDTO(criteria, keyword, page, amount, total);

		// 액션포워드
		request.setAttribute("list", list);
		request.setAttribute("pageDTO", pageDTO);
		return new ActionForward(false, "listForm.jsp");
	}
}
