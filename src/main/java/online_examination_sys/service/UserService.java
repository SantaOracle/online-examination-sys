package online_examination_sys.service;

import online_examination_sys.domain.dao.dto.RegisterDTO;
import online_examination_sys.domain.dao.po.User;
import online_examination_sys.domain.json.BaseJSON;
import online_examination_sys.domain.json.FindUserJSON;

public interface UserService {
	
	public FindUserJSON getAllUser(int userId, String token);

	public BaseJSON getUserById(int userId, String token);
	
	public BaseJSON register(RegisterDTO user);
	
	public BaseJSON login(String username, String password);

	public BaseJSON updateUserById(User user, int userId, String webToken);

	BaseJSON deleteUserById(int userId, int loginId2, String webToken);
	
}
