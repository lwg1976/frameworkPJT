package test.model.sql;

import test.model.vo.UserVO;

public class UserDaoImpl implements UserDao {

	@Override
	public UserVO loginRow(String id, String pwd) {
		System.out.println("UserDaoImpl loginRow()");
		UserVO user = null;
		if(id.equals("admin") && pwd.equals("admin")) {
			user = new UserVO("admin", "admin", "�̿���", 20, "����", "������");
		}
		return user;
	}

}
