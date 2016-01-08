package org.kilo.iothome.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.kilo.iothome.domain.User;
import org.kilo.iothome.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

		// 定义一个常量作为经理登录成功的Result名
		private final String USER_RESULT = "user";
		
		
		@Resource
		protected  UserService uservice;

		public void setUservice(UserService uservice) {
			this.uservice = uservice;
		}

		// 封装请求参数
		private User user;
		
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		
		// 处理用户请求
		public String execute()
			throws Exception
		{
			System.out.println("***********************************************");
	
			// 调用业务逻辑方法来处理登录请求
			int result = uservice.validLogin(getUser());
			System.out.println(result);
			// 登录结果为普通员工
			if (result == uservice.LOGIN_USER)
			{
				HttpServletRequest request = (HttpServletRequest)
						ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
				request.getSession().setAttribute("user", user);
				//addActionMessage("您已经成功登录系统");
				return USER_RESULT;
			}else{
				addActionMessage("用户名/密码不匹配");
				return ERROR;
			}
		}
}
