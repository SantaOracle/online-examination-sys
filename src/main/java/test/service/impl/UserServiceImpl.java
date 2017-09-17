package test.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.domain.dao.dto.RegisterDTO;
import test.domain.dao.po.Token;
import test.domain.dao.po.User;
import test.domain.json.BaseJSON;
import test.domain.json.FindUserJSON;
import test.domain.json.LoginJSON;
import test.mapper.UserMapper;
import test.service.UserService;


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
