<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../templat/boot.jsp"></c:import>
</head>
<body>
	<c:import url="../templat/header.jsp"></c:import>

	<form action="./memberLogin" method="post">
		<div class="form-group">
			<label for="email">ID:</label> <input type="text"
				class="form-control" id="id" name="id">
		</div>
		<div class="form-group">
			<label for="pwd">Password:</label> <input type="password"
				class="form-control" id="pw" name="pw">
		</div>
		<div class="checkbox">
			<label><input type="checkbox"> Remember me</label>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	
</body>
</html>