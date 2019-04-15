<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Page</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class='container'>
	<h2 class='alert-info text-center'>User Page</h2>
	<h3>${message}</h3>
	<form:form action="dologin" method="post" modelAttribute="userModel">
		<div class='form-group'>
		<label>Userid</label>
		<form:input path="userid" class='form-control' type='text' placeholder="Type Userid Here"/>
		</div>
		<div class='form-group'>
		<label>Password</label>
		<form:input path="pwd" class='form-control' type='password' placeholder="Type Password Here"/>
		</div>
		<div class='form-group'>
		<form:button name="login" value="Login" class='btn btn-primary'>Login</form:button>
		<form:button name="register" value="Register" class='btn btn-success'>Register</form:button>
		</div>
		
	</form:form>
	</div>
</body>
</html>