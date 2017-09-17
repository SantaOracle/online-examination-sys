package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.dao.dto.RegisterDTO;
import domain.dao.po.User;
import domain.json.BaseJSON;
import domain.json.FindUserJSON;
import mapper.UserMapper;
import service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

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
		// TODO Auto-generated method stub
		return null;
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
