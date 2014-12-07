package test.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.ctrl.command.Command;
import test.ctrl.mapping.BeanFactory;
import test.ctrl.view.ModelAndView;

/**
 * Servlet implementation class FrontServlet
 */
@WebServlet("*.sw")
public class FrontServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		requestProc(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		requestProc(request, response);
	}

	protected void requestProc(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("Client uri : " + uri);
		
		BeanFactory factory = BeanFactory.getInstance();
		System.out.println("factory : " + factory);
		Command command = factory.getAction(uri);
		ModelAndView mv = command.execute(request, response);
		
		// 1 or 2 둘 중 하나의 분기 방식을 채택하셔야 합니다.
		if (mv.isSend()) {
			// 2. 이동 후 주소창에 호출한 주소의 url이 나옴
			RequestDispatcher rd = request.getRequestDispatcher(mv.getPath());
			rd.forward(request, response);	
		} else {
			// 1. 이동 후 주소창에 test.jsp에 대한 url이 나옴
			response.sendRedirect(mv.getPath());	
		}		
	}
}
