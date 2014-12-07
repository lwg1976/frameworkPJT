package test.model.sql;

import test.model.vo.UserVO;

public interface UserDao {
	public UserVO loginRow(String id, String pwd);
}
