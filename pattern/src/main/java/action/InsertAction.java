package action;

import javax.servlet.http.HttpServletRequest;

import service.InsertService;

public class InsertAction implements Action {

	public ActionForward execute(HttpServletRequest request) throws Exception {
		//get or post 넘어오는 내용 가져오기
		System.out.println("이름 " + request.getParameter("name"));
		
		//서비스 호출
		InsertService service = new InsertService();
		boolean result = service.insertArticle();
		
		//페이지 이동 방식(true,false), 페이지(String);
		//sendRedirect 방식일 때 true, forward 방식일 때 false
		return new ActionForward(true, "list.jsp");/*페이지 이동방식, 페이지 리턴*/
	}

}
