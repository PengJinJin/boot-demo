<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${name}的主页</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/webjarslocator/jquery/jquery.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/webjarslocator/bootstrap/bootstrap.js"></script>
<script type="text/javascript">
	$(function() {
		$("#first").after("<button id='clicks'>click</button>");
		$("#clicks").on("click", function() {
			alert($("#first").text());
		});
	});
</script>
</head>
<body>
	<div id="first">Hello, ${name}</div>
</body>
</html>