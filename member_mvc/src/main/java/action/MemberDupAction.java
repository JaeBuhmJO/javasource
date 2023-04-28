package action;

import javax.servlet.http.HttpServletRequest;

import service.MemberDupService;

public class MemberDupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		String userid = request.getParameter("userid");
		MemberDupService service = new MemberDupService();
		boolean dupFlag = service.duplicateId(userid);
		request.setAttribute("dupId", dupFlag);

		return new ActionForward(false, "checkId.jsp");
	}

}
