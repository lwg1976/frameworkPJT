package test.ctrl.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.ctrl.command.Command;
import test.ctrl.view.ModelAndView;
import test.model.vo.UserVO;
import test.service.UserService;
import test.service.UserServiceImpl;

public class LoginCtrl implements Command {
	/* 의존관계 주입
	 * spring framework 비교 필요!!
	 */
	private UserService service;
	public LoginCtrl() {
		service = new UserServiceImpl();
	}
	//////////////////////////////////////////////////
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("LoginCtrl execute()");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		UserVO user = service.loginUser(id, pwd);
		ModelAndView mv = new ModelAndView(); 
		
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			mv.setPath("intro.jsp");
			mv.setSend(true);
		} else {
			mv.setPath("error.jsp");
			mv.setSend(true);
		}
		
		return mv;
	}

}
