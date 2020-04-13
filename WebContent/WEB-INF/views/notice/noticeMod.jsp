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

	<form action="./noticeMod" method="post">

		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Subject:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="subject" name="subject" >
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Contents:</label>
			<div class="col-sm-10">
				<textarea class="form-control" cols="220" rows="20" id="contents"
					name="contents" ></textarea>
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Name:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" readonly="readonly"
					id="name" name="name" value="${member.id}">
			</div>
		</div>
		
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Num:</label>
			<div class="col-sm-10">
				<input type="text" readonly="readonly" class="form-control" id="num" name="num" value="${dto.num}">
			</div>
		</div>
		
		
		

		<button type="submit" class="btn btn-default">Submit</button>
	</form>
</body>
</html>