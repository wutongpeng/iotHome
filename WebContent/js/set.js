function start(){
	var xmlhttp;
	var url="http://localhost:10080/iotHome/pi.action";//aimat是目标servlet或页面
	if(window.XMLHttpRequest){
		xmlhttp=new XMLHttpRequest();
	}else{
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange=function(){
		if(xmlhttp.readyState==4&&xmlhttp.status==200){
			document.getElementById("temp").innerHTML=xmlhttp.responseText;
			setTimeout("repeatFlush()",5000);//2秒刷新一次
		}
	}
	xmlhttp.open("POST",url,true);
	xmlhttp.send();
}