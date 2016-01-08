<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>温度</title>	
<script  src="js/myajax.js"></script> 
</head>
<body>
<%@include file="main/maintop.jsp"%>
<%@include file="main/mainheader.jsp"%>

<s:form>
<table width="780" align="center" background="${pageContext.request.contextPath}/images/bodybg.jpg">
    <br>
    <br/>
	<br>
    <br/>
    <tr><td>请点击开始采集：</td></tr>
	<tr align="center">
		<td >温度为：</td><td><div id="temp">null</div></td>
		<td><input id="dhtbtn" type="button" value="开始采集" onclick="repeatFlush();"></td>
	</tr>
 </table>	
</s:form>
 
</body>
</html>