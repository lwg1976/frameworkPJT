package test.ctrl.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.ctrl.command.Command;
import test.ctrl.view.ModelAndView;

public class InsertCtrl implements Command {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("InsertCtrl execute()");
		
		HttpSession session = request.getSession();
		session.setAttribute("testSesseion", "세선정보입니다.");
		
		ModelAndView mv = new ModelAndView();
		mv.setPath("ok.jsp");
		mv.setSend(true);
		
		return mv;
	}
	
}
