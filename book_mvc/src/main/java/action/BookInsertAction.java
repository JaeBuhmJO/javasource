package action;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookInsertService;

public class BookInsertAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {

		// get or post 넘어오는 내용 가져오기
		int code = Integer.parseInt(request.getParameter("code"));
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		int price = Integer.parseInt(request.getParameter("price"));
		String description = request.getParameter("description");

		// service를 통해 데이터베이스 작업
		BookInsertService bis = new BookInsertService();
		boolean insertFlag = bis.insertBook(new BookDTO(code, title, writer, price, description));

		String path = "";
		if (insertFlag) {
			path = "list.do"; // 또는 /book_mvc/list.do
		} else {
			path = "insert.jsp";
		}

		return new BookActionForward(true, path);
	}

}
