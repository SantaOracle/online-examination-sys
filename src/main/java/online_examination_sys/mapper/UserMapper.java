package online_examination_sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import online_examination_sys.domain.dao.dto.RegisterDTO;
import online_examination_sys.domain.dao.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

	List<User> getAllUser();

	User getUserByUser(User user);

	int updateUserById(User user);

	int addUser(User user);

}
