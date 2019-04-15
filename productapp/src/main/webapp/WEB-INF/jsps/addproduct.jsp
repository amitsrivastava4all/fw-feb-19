<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Product</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class='container'>
<h1>Product Add Page</h1>
<h3>${ message}</h3>
<form:form action="add.do" method="post" modelAttribute="productModel">
<div class='form-group'>
<label>Id</label>
<form:input class='form-control' path="id" placeholder='Type Product Id'/>
<form:errors path="id" cssClass="alert-danger"></form:errors>
</div>
<div class='form-group'>
<label>Name</label>
<form:input class='form-control' path="name" placeholder='Type Product Name'/>
<form:errors path="name" cssClass="alert-danger"></form:errors>
</div>
<div class='form-group'>
<label>Desc</label>
<form:textarea rows="10" cols="30" class='form-control' path="desc" placeholder='Type Product Desc'/>
<form:errors path="desc" cssClass="alert-danger"></form:errors>
</div>
<div class='form-group'>
<label>Price</label>
<form:input  class='form-control' path="price" placeholder='Type Product Price'/>
<form:errors path="price" cssClass="alert-danger"></form:errors>
</div>
<div class='form-group'>
<button class='btn btn-primary'>Add</button>
</div>
</form:form>
</div>
</body>
</html>