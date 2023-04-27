package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import domain.SearchDTO;
import service.BookSearchService;

public class BookSearchAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");

		BookSearchService service = new BookSearchService();
		List<BookDTO> list = service.search(criteria, keyword);

		request.setAttribute("dto", new SearchDTO(criteria, keyword));
		request.setAttribute("list", list);
		return new BookActionForward(false, "list.jsp");
	}
}
