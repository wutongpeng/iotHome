<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>iotHome</title>
</head>
<body>
<h3 align="center">iotHome系统</h3>
<h4>注册用户</h4>
<s:form action="appUser">
    <s:actionmessage />
	<s:textfield name="user.name" label="用户名"/>
	<s:textfield name="user.pwd" label="密码"/>
	<tr align="center">
		<td colspan="2">
		<s:submit value="注册" theme="simple"/>
		<s:reset value="重设" theme="simple"/>
		</td>
	</tr>
</s:form>
</body>
</html>