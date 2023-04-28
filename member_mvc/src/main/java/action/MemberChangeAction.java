package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.ChangeDTO;
import domain.MemberDTO;
import service.MemberChangeService;
import service.MemberLoginService;

public class MemberChangeAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		String userid = request.getParameter("userid");
		String curPwd = request.getParameter("current-password");
		String newPwd = request.getParameter("new-password");
		String confirmPwd = request.getParameter("confirm-password");
		ChangeDTO changeDTO = new ChangeDTO(userid, curPwd, newPwd, confirmPwd);

		MemberLoginService service = new MemberLoginService();
		MemberDTO info = service.login(userid, curPwd);
		String path = "";
		if (info != null) {
			MemberChangeService changeService = new MemberChangeService();
			if (changeService.change(changeDTO)) {
				HttpSession session = request.getSession();
				session.invalidate();
				path = "login.jsp";
			} else {
				path = "changePwd.jsp";
			}
		} else {
			path = "changePwd.jsp";
		}

		return new ActionForward(true, path);
	}

}
