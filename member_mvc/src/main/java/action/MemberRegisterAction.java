package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.MemberDTO;
import service.MemberLoginService;
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

		boolean isRedirect = true;
		String path = "";
		if (flag) {
			MemberLoginService lgservice = new MemberLoginService();
			MemberDTO loginDto = lgservice.login(userid, password);
			HttpSession session = request.getSession();
			session.setAttribute("loginDto", loginDto);
			path = "index.jsp";
			isRedirect = false;
		} else {
			path = "register.jsp";
		}
		return new ActionForward(isRedirect, path);
	}

}
