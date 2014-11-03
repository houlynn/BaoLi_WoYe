<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
   <link rel="stylesheet" type="text/css" href="<%=basePath%>extjs/ext-theme-neptune/build/resources/ext-theme-neptune-all.css">
       <script type="text/javascript" src="<%=basePath%>extjs/ext-all.js"></script> 
       <script type="text/javascript" src="<%=basePath%>extjs/ext-theme-neptune/build/ext-theme-neptune.js"></script>
       <script type="text/javascript" src="<%=basePath%>extjs/ext-locale-zh_CN.js"></script>
       <script type="text/javascript" src="<%=basePath %>app/util/comm.js"></script>
       <script type="text/javascript" src="<%=basePath%>app/loader.js"></script>
       <script type="text/javascript" src="<%=basePath%>app.js"></script>
</head>
<body>
</body>
</html>