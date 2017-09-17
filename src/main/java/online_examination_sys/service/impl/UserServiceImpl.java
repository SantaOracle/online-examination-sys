package online_examination_sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online_examination_sys.domain.dao.dto.RegisterDTO;
import online_examination_sys.domain.dao.po.User;
import online_examination_sys.domain.json.BaseJSON;
import online_examination_sys.domain.json.FindUserJSON;
import online_examination_sys.mapper.UserMapper;
import online_examination_sys.service.UserService;


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
