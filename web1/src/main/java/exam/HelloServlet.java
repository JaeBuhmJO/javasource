package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * jsp == servlet : 할 수 있는 일이 같음 사용자 요청 처리
 * 
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// action을 get메소드로 줄 때 동작하는 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post에서 넘어올 수도 있으므로
		request.setCharacterEncoding("utf-8");

		String name = request.getParameter("name");
		String age = request.getParameter("age");

		// 화면에 보여주기?
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h3> 이름 : " + name + "</h3>");
		out.print("<h3> 나이 : " + age + "</h3>");
	}

	// action을 post메소드로 줄 때 동작하는 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
