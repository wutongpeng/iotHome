<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>����</title>	
<script  src="js/set.js"></script> 
</head>
<body>
<%@include file="main/maintop.jsp"%>
<%@include file="main/mainheader.jsp"%>

<s:form>
<table width="780" align="center" background="${pageContext.request.contextPath}/images/bodybg.jpg">
    <br>   
	<br>    
    <tr><td>���ã�</td></tr>
	<tr align="center">
		<td > ���״̬��</td><td><div id="status">null</div></td>
		<td><input id="pibtn" type="button" value="��ʼ�ɼ�" onclick="repeatFlush();"></td>
	</tr>
 </table>	
</s:form>
 
</body>
</html>