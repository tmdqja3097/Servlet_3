<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- nav -->
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="${pageContext.request.contextPath}">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a
					href="${pageContext.request.contextPath }/point/pointList">Point</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</nav>
	<!--/nav-->

	<div class="container">
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS, and JS framework for
				developing responsive, mobile-first projects on the web.</p>
		</div>
		<p>This is some text.</p>
		<p>This is another text.</p>
	</div>
	
	<h1>POINT MOD FORM</h1>
	
	<form action="./pointMod" method="post">
		<div class="form-group">
			<label class="control-label col-sm-2" for="email">Name:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name" value="${dto.name}"
					>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="num">Num:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="num" name="num" readonly="readonly" 
					value="${dto.num}">
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
		
		<button type="submit" class="btn btn-default" >Submit</button>

		
	</form>

</body>
</html>