<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/exam/student/login" method="get" id="login">
		用户名：<input type="text" name="id" /> 
		<br /> 
		密码：<input type="password" name="password" /> 
		<br /> 
		<select name="usertype" id="usertype" onchange="changeAction()">
			<option value="0">学生</option>
			<option value="1">教职工</option>
		</select> 
		<br /> 
		<input type="submit" name="login" />
	</form>
	<script type="text/javascript">
		function changeAction() {
			var str = document.getElementById("usertype").value;
			if (str == "0") {
				document.getElementById("login").action = "/exam/student/login";
			} else {
				document.getElementById("login").action = "/exam/admin/login";
			} 
		}
	</script>
</body>
</html>