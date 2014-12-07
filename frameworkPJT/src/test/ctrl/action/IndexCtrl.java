package test.ctrl.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.ctrl.command.Command;
import test.ctrl.view.ModelAndView;

public class IndexCtrl implements Command {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("IndexCtrl execute()");
		
		ModelAndView mv = new ModelAndView();
		mv.setPath("intro.jsp");
		mv.setSend(true);
		
		return mv;
	}
	
}
