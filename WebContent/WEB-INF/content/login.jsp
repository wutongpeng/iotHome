<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>iotHome��¼</title>
</head>
<body>
<table width="780" align="center">
<h3 align="center">iotHomeϵͳ</h3>
<s:form action="processLogin">
    <s:actionmessage />
	<s:textfield name="user.name" label="�û���"/>
	<s:textfield name="user.pwd" label="����"/>
	<tr align="center">
		<td colspan="2">
		<s:submit value="��¼" theme="simple"/>
		<s:reset value="����" theme="simple"/>
		</td>
	</tr>
</s:form>
</table>
</body>
</html>