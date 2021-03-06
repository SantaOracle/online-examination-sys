package online_examination_sys.controller;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.TestDTO;
import online_examination_sys.domain.dao.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import online_examination_sys.domain.dao.dto.RegisterDTO;
import online_examination_sys.domain.dao.po.User;
import online_examination_sys.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login")
	@ResponseBody
	public UserDTO login(
		@RequestParam(value = "username", required = true)String username,
		@RequestParam(value = "password", required = true)String password,
		@RequestParam(value = "isAdmin", required = true)int isAdmin
	) {
	    User user = new User();
	    user.setUsername(username);
	    user.setPassword(password);
	    user.setIsAdmin(isAdmin);

        UserDTO userDTO = userService.login(user);
	    return userDTO;
	}

	@RequestMapping(value = "/register")
	@ResponseBody
	public UserDTO register(
		@RequestParam(value = "username", required = true)String username,
		@RequestParam(value = "password", required = true)String password
	){
	    User user = new User();
	    user.setUsername(username);
	    user.setPassword(password);
	    user.setIsAdmin(0);

		UserDTO userDTO = userService.register(user);
		return userDTO;
	}

	@RequestMapping(value = "/updateInfo")
	@ResponseBody
	public UserDTO updateInfo(
		@RequestParam(value = "id", required = true)int id,
		@RequestParam(value = "username", required = true)String username,
		@RequestParam(value = "password", required = false)String password,
		@RequestParam(value = "isAdmin", required = true)int isAdmin
	){

        User user = new User();
        user.setId(id);
        if (username != null) user.setUsername(username);
        if (password != null) user.setPassword(password);
        user.setIsAdmin(isAdmin);

        UserDTO userDTO = userService.updateInfo(user);
        return userDTO;
	}
}
