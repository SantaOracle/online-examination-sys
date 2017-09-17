package test.service.impl;

import org.springframework.stereotype.Service;

import test.domain.dao.dto.RegisterDTO;
import test.domain.dao.po.User;
import test.domain.json.BaseJSON;
import test.domain.json.FindUserJSON;
import test.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public FindUserJSON getAllUser(int userId, String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseJSON getUserById(int userId, String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseJSON register(RegisterDTO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseJSON login(String username, String password) {
		BaseJSON baseJSON = new BaseJSON();
		baseJSON.setResultCode(0);
		return baseJSON;
	}

	@Override
	public BaseJSON updateUserById(User user, int userId, String webToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseJSON deleteUserById(int userId, int loginId2, String webToken) {
		// TODO Auto-generated method stub
		return null;
	}

}
