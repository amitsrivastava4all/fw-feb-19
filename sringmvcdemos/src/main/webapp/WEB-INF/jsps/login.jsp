<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
<form:form action="dologin2" method="post" modelAttribute="user">
<form:input path="userid"/>
<form:input path="pwd"/>
<form:select path="role">
<c:forEach items="${roles}" var="role">
<form:option value="${role}">${role}</form:option>
</c:forEach>
</form:select>
<form:button>Login</form:button>
</form:form>





<%-- <form action="dologin" method="post">
<input name="userid" type='text' placeholder="Type Userid Here">
<input name="pwd" type='password' placeholder="Type Password Here">

<select name="role">
<c:forEach items="${roles}" var="role">
<option>${role}</option>

</c:forEach>
</select>

<button>Login</button>
</form> --%>
</body>
</html>