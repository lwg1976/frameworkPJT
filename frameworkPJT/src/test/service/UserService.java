package test.service;

import test.model.vo.UserVO;

public interface UserService {
	public UserVO loginUser(String id, String pwd);
}
