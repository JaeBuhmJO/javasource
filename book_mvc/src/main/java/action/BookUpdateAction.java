package action;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookUpdateService;

public class BookUpdateAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		int code = Integer.parseInt(request.getParameter("code"));
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		int price = Integer.parseInt(request.getParameter("price"));
		String description = request.getParameter("description");

		BookUpdateService service = new BookUpdateService();
		boolean flag = service.updateBook(new BookDTO(code, title, writer, price, description));

		String path = "";
		if (flag) {
			path = "list.do";
		} else {
			path = "modify.do?code="+code;
		}
		return new BookActionForward(true, path);
	}

}
