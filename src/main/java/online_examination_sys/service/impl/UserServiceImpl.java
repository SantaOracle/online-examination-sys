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
		User resUser = userMapper.getUserByUser(user);
		UserDTO userDTO = new UserDTO();
		if (resUser == null){
			userDTO.setResultCode(0);
			userDTO.setResultMsg("用户名或密码错误");
		}else{
			userDTO.setUser(resUser);
		}
		return userDTO;
	}

	@Override
	public UserDTO register(User user) {
		//验证是否已经有该用户名注册
		User userForQuery = new User();
		userForQuery.setUsername(user.getUsername());
		User resUser = userMapper.getUserByUser(userForQuery);
		UserDTO userDTO = new UserDTO();
		//根据验证结果，来决定是否写库
		if (resUser == null){
			userMapper.addUser(user);
		}else{
			userDTO.setResultCode(0);
			userDTO.setResultMsg("该用户名已存在");
		}
		return userDTO;
	}

	@Override
	public UserDTO updateInfo(User user) {
		userMapper.updateUserById(user);
		return new UserDTO();
	}
}
