package board.action;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import board.service.BoardDeleteService;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		int bno = Integer.parseInt(request.getParameter("bno"));
		String password = request.getParameter("passwordTodelete");

		String criteria = request.getParameter("criteria");
		String keyword= URLEncoder.encode(request.getParameter("keyword"),"utf-8");
		String page = request.getParameter("page");
		String amount = request.getParameter("amount");
		
		
		BoardDeleteService service = new BoardDeleteService();

		String path = "";
		if (service.remove(bno, password)) {
			path = "list.do?criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		} else {
			path = "modify.do?bno=" + bno+"&criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		}

		return new ActionForward(true, path);
	}

}
