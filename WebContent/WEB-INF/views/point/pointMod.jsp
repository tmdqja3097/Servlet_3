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

	<form action="./pointMod" method="post">
		<div class="form-group">
			<label class="control-label col-sm-2" for="email">Name:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name"
					value="${dto.name}">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="num">Num:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="num" name="num"
					readonly="readonly" value="${dto.num}">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Kor:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="kor" name="kor"
					value="${dto.kor}">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Eng:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="eng" name="eng"
					value="${dto.eng}">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Math:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="math" id="math"
					value="${dto.math}">
			</div>
		</div>

		<button type="submit" class="btn btn-default">Submit</button>


	</form>

</body>
</html>