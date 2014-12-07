package test.ctrl.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.ctrl.command.Command;
import test.ctrl.view.ModelAndView;

public class LogoutCtrl implements Command{

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("LogoutCtrl execute()");
		
		HttpSession session = request.getSession(false);
		session.invalidate();
		
		ModelAndView mv = new ModelAndView();
		mv.setPath("index.sw");
		mv.setSend(false);
		
		return mv;
	}

}
