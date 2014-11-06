<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>保利物业信息管理系统</title>
<link type="text/css" rel="stylesheet"
	href="<%=basePath%>css/font-awesome.css">
<link type="text/css" rel="stylesheet"
	href="<%=basePath%>css/module.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>extjs/ext-theme-neptune/build/resources/ext-theme-neptune-all.css">
<script type="text/javascript" src="<%=basePath%>extjs/ext-all.js"></script>
<script type="text/javascript"
	src="<%=basePath%>extjs/ext-theme-neptune/build/ext-theme-neptune.js"></script>
<script type="text/javascript"
	src="<%=basePath%>extjs/ext-locale-zh_CN.js"></script>
<script type="text/javascript" src="<%=basePath%>app/util/comm.js"></script>
<script type="text/javascript" src="<%=basePath%>app/loader.js"></script>
<script type="text/javascript" src="<%=basePath%>app.js"></script>
</head>
<body>
	<script type="text/javascript">
	<!--加载分辨率大小-->
		var clientWidth = document.body.clientWidth;
		var clientHeight = document.body.clientHeight;
		var screenWidth = document.body.scrollWidth;
		var screenHeight = document.body.scrollHeight;
		var resolutionHeight = window.screen.height;
		var resolutionWidth = window.screen.width;
		comm.add("clientWidth", clientWidth);
		comm.add("clientHeight", clientHeight);
		comm.add("screenWidth", screenWidth);
		comm.add("screenHeight", screenHeight);
		comm.add("resolutionWidth", resolutionWidth);
		comm.add("resolutionHeight", resolutionHeight);
		//开启动态加载
		Ext.Loader.setConfig({
			enabled : true
		});
	</script>
</body>
</html>