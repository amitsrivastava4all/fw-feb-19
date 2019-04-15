<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard Page</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class='container'>
<h1>DashBoard Page, Welcome ${sessionScope.userid }</h1>
<a href="addproduct.do" class='btn btn-primary mr-5'>Add Product</a>
<a href="list" class='btn btn-info'>List Products</a>
</div>
</body>
</html>