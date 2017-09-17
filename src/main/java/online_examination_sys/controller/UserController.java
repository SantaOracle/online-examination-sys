package online_examination_sys.controller;

import online_examination_sys.domain.dao.dto.TestDTO;
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

	/**
	 * 用户登录
	 * @param username	用户名
	 * @param password	密码
	 * @return
	 */
	@RequestMapping(value = "/login")
	@ResponseBody
	public TestDTO login(
		@RequestParam(value = "username", required = true)String username,
		@RequestParam(value = "password", required = true)String password,
		@RequestParam(value = "isAdmin", required = true)int isAdmin
	) {
		TestDTO testDTO = new TestDTO();
		return testDTO;
	}

	@RequestMapping(value = "/register")
	@ResponseBody
	public TestDTO register(
		@RequestParam(value = "username", required = true)String username,
		@RequestParam(value = "password", required = true)String password
	){
		//验证用户名是否存在

		//验证通过，数据存储

		TestDTO testDTO = new TestDTO();
		return testDTO;
	}
	

	@RequestMapping(value = "/undateInfo")
	@ResponseBody
	public TestDTO undateInfo(
		@RequestParam(value = "id", required = true)int id,
		@RequestParam(value = "username", required = true)String username,
		@RequestParam(value = "password", required = false)String password,
		@RequestParam(value = "isAdmin", required = true)int isAdmin
	){

		TestDTO testDTO = new TestDTO();
		return testDTO;
	}
}
