package action;

import javax.servlet.http.HttpServletRequest;

public class DeleteAction implements Action {

	public ActionForward execute(HttpServletRequest request) throws Exception {
		System.out.println("code " + request.getParameter("code"));
		
		//sendRedirect 방식일 때 true, forward 방식일 때 false
		return new ActionForward(true, "list.jsp");/*페이지 이동방식, 페이지 리턴*/
	}
}
