package org.kilo.iothome.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.kilo.iothome.domain.User;
import org.kilo.iothome.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

		// ����һ��������Ϊ�����¼�ɹ���Result��
		private final String USER_RESULT = "user";
		
		
		@Resource
		protected  UserService uservice;

		public void setUservice(UserService uservice) {
			this.uservice = uservice;
		}

		// ��װ�������
		private User user;
		
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		
		// �����û�����
		public String execute()
			throws Exception
		{
			System.out.println("***********************************************");
	
			// ����ҵ���߼������������¼����
			int result = uservice.validLogin(getUser());
			System.out.println(result);
			// ��¼���Ϊ��ͨԱ��
			if (result == uservice.LOGIN_USER)
			{
				HttpServletRequest request = (HttpServletRequest)
						ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
				request.getSession().setAttribute("user", user);
				//addActionMessage("���Ѿ��ɹ���¼ϵͳ");
				return USER_RESULT;
			}else{
				addActionMessage("�û���/���벻ƥ��");
				return ERROR;
			}
		}
}
