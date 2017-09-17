package test.service;

import test.domain.dao.dto.RegisterDTO;
import test.domain.dao.po.User;
import test.domain.json.BaseJSON;
import test.domain.json.FindUserJSON;

public interface UserService {
	
	public FindUserJSON getAllUser(int userId, String token);

	public BaseJSON getUserById(int userId, String token);
	
	public BaseJSON register(RegisterDTO user);
	
	public BaseJSON login(String username, String password);

	public BaseJSON updateUserById(User user, int userId, String webToken);

	BaseJSON deleteUserById(int userId, int loginId2, String webToken);
	
}
