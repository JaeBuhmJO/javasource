package action;

import javax.servlet.http.HttpServletRequest;

import service.BookRemoveService;

public class BookRemoveAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		int code = Integer.parseInt(request.getParameter("code"));

		BookRemoveService service = new BookRemoveService();
		boolean flag = service.remove(code);

		String path = "";
		if (flag) {
			path = "list.do";
		} else {
			path = "remove.do";
		}
		return new BookActionForward(true, path);
	}

}
