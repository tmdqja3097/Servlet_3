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
				<li><a href="${pageContext.request.contextPath }/member/memberJoin"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="${pageContext.request.contextPath }/member/memberLogin"><span class="glyphicon glyphicon-log-in"></span>
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
	<h1>MEMBER JOIN FORM</h1>

	<form action="./memberJoin" method="post">
		<div class="form-group">
			<label class="control-label col-sm-2" for="email">Name:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name"
					>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">ID:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="id" name="id"
					>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">PW:</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="pw" name="pw">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">AGE:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="age" name="age">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Phone:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="phone" id="phone">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Phone:</label>
			<div class="col-sm-10">
				<input type="email" class="form-control" name="email" id="email">
			</div>
		</div>

		<button type="submit" class="btn btn-default">Submit</button>

	</form>
</body>
</html>