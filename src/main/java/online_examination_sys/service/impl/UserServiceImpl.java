package online_examination_sys.service.impl;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online_examination_sys.domain.dao.dto.RegisterDTO;
import online_examination_sys.domain.dao.po.User;
import online_examination_sys.mapper.UserMapper;
import online_examination_sys.service.UserService;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDTO login(User user) {
		return null;
	}

	@Override
	public UserDTO register(User user) {
		return null;
	}

	@Override
	public UserDTO updateInfo(User user) {
		return null;
	}
}
