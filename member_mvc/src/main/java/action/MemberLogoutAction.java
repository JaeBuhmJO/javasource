package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MemberLogoutAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		session.invalidate();
		return new ActionForward(true, "index.jsp");
	}
}
