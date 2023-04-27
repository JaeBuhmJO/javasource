package action;

import javax.servlet.http.HttpServletRequest;

import domain.MemberDTO;
import service.MemberRegisterService;

public class MemberRegisterAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");

		MemberRegisterService service = new MemberRegisterService();
		boolean flag = service.register(new MemberDTO(userid, password, name, gender, email));

		String path = "";
		if (flag) {
			path = "index.jsp";
		} else {
			path = "register.jsp";
		}
		return new ActionForward(false, path);
	}

}
