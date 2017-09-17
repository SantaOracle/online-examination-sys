package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import test.domain.dao.dto.RegisterDTO;
import test.domain.dao.po.User;
import test.domain.json.BaseJSON;
import test.domain.json.FindUserJSON;
import test.service.UserService;

@RestController
@EnableSwagger2
@RequestMapping("/user")
@Api("用户管理相关接口")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ApiOperation("用户登录")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "username", dataType = "String", required = true, value = "用户名"),
		@ApiImplicitParam(paramType = "query", name = "password", dataType = "String", required = true, value = "密码")})
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public BaseJSON login(String username, String password) {
		return userService.login(username, password);
	}
	
	
	@ApiOperation("获取用户信息")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "userId", dataType = "userId", required = true, value = "userId", defaultValue = "admin")})
		@ApiImplicitParam(paramType = "query", name = "token", dataType = "String", required = true, value = "tokenId")
	@RequestMapping(value = "/getUserById", method = RequestMethod.GET)
	public BaseJSON getUserById(int userId, String token) {
		return userService.getUserById(userId, token);
	}
	
	@ApiOperation("用户注册")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "username", dataType = "String", required = true, value = "username"),
		@ApiImplicitParam(paramType = "query", name = "password", dataType = "String", required = true, value = "password"),
		@ApiImplicitParam(paramType = "query", name = "phone", dataType = "String", required = true, value = "phone")})
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public BaseJSON register(String username, String password, String phone) {
		System.out.println("进入controller");
		RegisterDTO user = new RegisterDTO();
		
		user.setUsername(username);
		user.setPassword(password);
		user.setPhone(phone);
		
		return userService.register(user);
	}
	
	@ApiOperation("更改用户信息")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "userId", dataType = "int", required = true, value = "userId"),
		@ApiImplicitParam(paramType = "query", name = "username", dataType = "String", required = true, value = "username"),
		@ApiImplicitParam(paramType = "query", name = "password", dataType = "String", required = true, value = "password"),
		@ApiImplicitParam(paramType = "query", name = "phone", dataType = "String", required = true, value = "phone"),
		@ApiImplicitParam(paramType = "query", name = "webUserId", dataType = "int", required = true, value = "webUserId"),
		@ApiImplicitParam(paramType = "query", name = "webToken", dataType = "String", required = true, value = "webToken")})
	@RequestMapping(value = "/updateUserById", method = RequestMethod.GET)
	public BaseJSON updateUserById(int userId, String username, String password, String phone, int webUserId, String webToken) {
		
		User user = new User();
		
		user.setUserId(userId);
		user.setUsername(username);
		user.setPassword(password);
		user.setPhone(phone);
		
		return userService.updateUserById(user, webUserId, webToken);
	}
	
	@ApiOperation("删除用户信息")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "userId", dataType = "userId", required = true, value = "userId"),
		@ApiImplicitParam(paramType = "query", name = "webUserId", dataType = "int", required = true, value = "webUserId"),
		@ApiImplicitParam(paramType = "query", name = "webToken", dataType = "String", required = true, value = "webToken")})
	@RequestMapping(value = "/deleteUserById", method = RequestMethod.GET)
	public BaseJSON deleteUserById(int userId, int webUserId, String webToken) {		
		return userService.deleteUserById(userId, webUserId, webToken);
	}
	
	@ApiOperation("展示用户列表")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "webUserId", dataType = "int", required = true, value = "webUserId"),
		@ApiImplicitParam(paramType = "query", name = "webToken", dataType = "String", required = true, value = "webToken")})
	@RequestMapping(value = "/showAllUsers", method = RequestMethod.GET)
	public FindUserJSON getAllUser(int webUserId, String webToken) {
		return userService.getAllUser(webUserId, webToken);
	}
}
