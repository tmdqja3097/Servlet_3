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

	<form action="./memberUpdate" method="post">
		<div class="form-group">
			<label class="control-label col-sm-2" for="email">Name:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name" value="${member.name}">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">ID:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="id" name="id" readonly="readonly" value="${member.id}">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">AGE:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="age" name="age" value="${member.age}">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Phone:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="phone" id="phone" value="${member.phone}">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Email:</label>
			<div class="col-sm-10">
				<input type="email" class="form-control" name="email" id="email" value="${member.email}">
			</div>
		</div>

		<button type="submit" class="btn btn-default">Submit</button>

	</form>
</body>
</html>