package online_examination_sys.service;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.RegisterDTO;
import online_examination_sys.domain.dao.dto.UserDTO;
import online_examination_sys.domain.dao.po.User;

public interface UserService {

    /**
     * 用户登录
     * @param user
     * @return
     */
    UserDTO login(User user);

    /**
     * 用户注册
     * @param user
     * @return
     */
    UserDTO register(User user);

    /**
     * 用户修改信息
     * @param user
     * @return
     */
    UserDTO updateInfo(User user);
}
