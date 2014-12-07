package test.ctrl.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.ctrl.command.Command;
import test.ctrl.view.ModelAndView;

public class SelectCtrl implements Command{

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SelectCtrl execute()");	
		
		ModelAndView mv = new ModelAndView();
		
		request.setAttribute("testRequest", "요청정보입니다.");
		
		mv.setPath("ok.jsp");
		mv.setSend(true);
		
		return mv;
	}

}
