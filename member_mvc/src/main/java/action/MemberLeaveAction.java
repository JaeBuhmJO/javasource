package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.MemberDTO;
import service.MemberLeaveService;

public class MemberLeaveAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		MemberDTO dto = new MemberDTO();
		dto.setUserid(request.getParameter("userid"));
		dto.setPassword(request.getParameter("password"));

		MemberLeaveService service = new MemberLeaveService();
		String path = "";
		if (service.leave(dto)) {
			HttpSession session = request.getSession();
			session.invalidate();
			path = "index.jsp";
		} else {
			path = "leave.jsp";
		}
		return new ActionForward(true, path);
	}
}
