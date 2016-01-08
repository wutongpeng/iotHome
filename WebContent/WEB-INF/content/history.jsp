<%@ page contentType="text/html; charset=GBK" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
   <title>查看dht历史记录</title>
</head>
<body>
<%@include file="main/maintop.jsp"%>
<%@include file="main/mainheader.jsp"%>
<table width="780" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
	<tr>
	<td>
	<br>
	<table width="80%" border="0" align="center" 
			cellspacing="1" bgcolor="#cccccc">
		  <tr bgcolor="#e1e1e1" >
			<td colspan="3" ><div class="mytitle">您正在查看dht历史记录</div></td> 
		  </tr>
		  <tr class="pt11" height="45">
			<td><b>序号</b></td>
			<td><b>温度值</b></td>
		  </tr>
		<s:iterator value="dhts" status="index">  
		 	<s:if test="#index.odd == true"> 
				 <tr style="background-color:#dddddd" class="pt11" height="32">
			</s:if> 
			<s:else> 
				 <tr class="pt11" height="32">
			</s:else>
			<td><s:property value="id"/></td>
			<td><s:property value="tem"/></td>
		  </tr>
	  </s:iterator>  
	</table>
	</td>
	</tr>
</table>
</body>
</html>