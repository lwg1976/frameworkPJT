package test.ctrl.mapping;

import java.util.HashMap;
import java.util.Map;

import test.ctrl.action.IndexCtrl;
import test.ctrl.action.InsertCtrl;
import test.ctrl.action.LoginCtrl;
import test.ctrl.action.LogoutCtrl;
import test.ctrl.action.SelectCtrl;
import test.ctrl.command.Command;

public class BeanFactory {
	private static BeanFactory instance;
	private Map<String,Command> map = new HashMap<String,Command>();
	
	private BeanFactory() {
		map.put("/frameworkPJT/insert.sw", new InsertCtrl());
		map.put("/frameworkPJT/select.sw", new SelectCtrl());
		map.put("/frameworkPJT/index.sw", new IndexCtrl());
		map.put("/frameworkPJT/login.sw", new LoginCtrl());
		map.put("/frameworkPJT/logout.sw", new LogoutCtrl());
	}
	
	public static BeanFactory getInstance() {
		if(instance == null) {
			instance = new BeanFactory();
		}
		return instance;
	}
	
	public Command getAction(String uri) {
		return map.get(uri);
	}
}
