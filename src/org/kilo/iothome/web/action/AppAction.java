package org.kilo.iothome.web.action;

import javax.annotation.Resource;

import org.kilo.iothome.domain.User;
import org.kilo.iothome.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AppAction extends ActionSupport {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@Resource
	protected UserService uservice;

	public void setUservice(UserService uservice) {
		this.uservice = uservice;
	}
	public String execute()
			throws Exception
		{
			
			// 添加新用户
		    uservice.addUser(user);
			addActionMessage("新增员工成功");
			return SUCCESS;
		}
	
	
}
