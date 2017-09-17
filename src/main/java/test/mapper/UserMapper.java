package test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import test.domain.dao.dto.RegisterDTO;
import test.domain.dao.po.Token;
import test.domain.dao.po.User;


public interface UserMapper {
	
	public List<User> getAllUser();
	
	public User getUserById(@Param("userId") int id);
	
	public int addUser( RegisterDTO user);
	
	public int updateUserById(User user);
	
	public int deleteUserById(@Param("userId") int id);
	
	public User getUserByUsername(@Param("username") String username);
	
	public int addToken(Token token);
	
	public Token getToken(@Param("userId") int userId, @Param("tokenId") String tokenId);
	
	public int deleteToken(@Param("userId") int userId, @Param("tokenId") String tokenId);
}
