package test.service;

import test.model.sql.UserDao;
import test.model.sql.UserDaoImpl;
import test.model.vo.UserVO;

public class UserServiceImpl implements UserService {
	// 의존관계 주입(Dependency Injection) => DI
	private UserDao dao;
	public UserServiceImpl(){
		dao = new UserDaoImpl();
	}
	
	@Override
	public UserVO loginUser(String id, String pwd) {
		System.out.println("UserServiceImpl loginUser()");
		return dao.loginRow(id, pwd);
	}

}
