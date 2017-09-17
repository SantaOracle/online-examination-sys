/**********************************************************************
* $Id: UserAuthoInterceptor.java UserAuthInterceptor ,v0.1 2016年7月13日 下午5:29:05 DuanMinglei Exp $
* Copyright ©2016 yonyou . All rights reserved
***********************************************************************/

package test.comfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//import com.alibaba.fastjson.JSON;
//import com.yonyou.train.service.UserService;

/**
* 功能说明：
* 创建者：段明磊
* E-mail: duanml1@yonyou.com
* 创建时间：2016年7月13日
* <pre>
* 修改时间:       修改者:            
* 修改内容：
* </pre>
* 版本：0.1
*/
public class WebInterceptor/* implements HandlerInterceptor*/ {

//	Logger logger = Logger.getLogger(WebInterceptor.class);
//	@Autowired
//	private UserService userService;
//	@Autowired
//	private CommonService commonService;
//	
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		
//		String url = request.getRequestURI();
//		
//		commonService.addApiStatistics(url);
//		//logger.info("url====>"+url);
//	
//		//api接口调试相关地址
//		if (url.equals("/swagger-ui.html")
//				||url.equals("/error")
//				||url.equals("/configuration/ui")
//				||url.equals("/configuration/security")
//				||url.equals("/swagger-resources")
//				||url.equals("/v2/api-docs")
//				||url.equals("/help")) {
//			return true;
//		}
//		
//		//不需要token认证的地址请添加到这里  如果模块
//		if (url.equals("/user/getToken")
//				||url.equals("/user/setPassword")
//				||url.equals("/user/login")
//				||url.equals("/user/checkPin")
//				||url.equals("/user/sendPin")
//				||url.equals("/user/jpush")
//				||url.equals("/user/loginByPin")
//				||url.equals("/user/modifyPassword")
//				||url.equals("/driving/updateOrderStatus")) {
//			return true;
//		}
//		String token = request.getParameter("token");
//		
//		if(userService.checkAuthWithOutToken(url)){
//			//不需要token认证的地址
//			return true;
//		}else if(token==null || !userService.checkAuth(token)){
//			//token为空或错误的情况
//			
//			byte[] bytes = (JSON.toJSONString(ErrCode.ACCESS_TOKEN_INVALID)).getBytes();
//			response.setContentType("text/html;charset=UTF-8");
//			response.setContentLength(bytes.length);
//			response.getOutputStream().write(bytes);
//			response.getOutputStream().close();
//			return false;
//			
//		}else if(userService.checkAuth(token, url)){
//			//用户已授权该URL
//			return true;
//		}
//		
//		//判断权限，如果权限不足,返回提示
//		byte[] bytes = (JSON.toJSONString(ErrCode.APP_CODE_6)).getBytes();
//		response.setContentType("text/html;charset=UTF-8");
//		response.setContentLength(bytes.length);
//		response.getOutputStream().write(bytes);
//		response.getOutputStream().close();
//		return false;
//	}
//
//	@Override
//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//			ModelAndView modelAndView) throws Exception {
//	}
//
//	@Override
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//
//	}

}
