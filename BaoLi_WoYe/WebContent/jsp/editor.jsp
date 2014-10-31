<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>HTML编辑器</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/kindeditor/themes/default/default.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/kindeditor/plugins/code/prettify.css" />
		<script type="text/javascript" src="<%=request.getContextPath()%>/kindeditor/kindeditor.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/kindeditor/lang/zh_CN.js"></script>
		<script>
		var htmlEditor = null;
		KindEditor.ready(function(K) {
			htmlEditor = K.create('textarea[name=editContent]', {
				cssPath : "<%=request.getContextPath()%>/kindeditor/themes/default/default.css",
				uploadJson : '<%=request.getContextPath()%>/jsp/upload_json.jsp',
				fileManagerJson : '<%=request.getContextPath()%>/jsp/file_manager_json.jsp',
				allowFileManager : true,
				fullscreenMode :true		//默认全屏
			});
		});
		//同步后，读取编辑框中的数据
		function getValueForEditor(){
			htmlEditor.sync();
			var editContent = document.getElementById("editContent");
			return editContent.value;
		}
	</script>
	</head>

	<body>
		<textarea id="editContent" name="editContent" cols="100" rows="8" style="width: 700px; height: 200px;">${param.editorValue }</textarea>
	</body>
</html>
