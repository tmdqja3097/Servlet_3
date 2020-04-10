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
</head>
<body>

	<c:import url="../templat/header.jsp"></c:import>

	<div class="container">
		<div class="row">
			<table class="table table-hover">

				<tr>
					<td>Name</td>
					<td>ID</td>
					<td>Age</td>
					<td>Phone</td>
					<td>Email</td>
				</tr>

				<tr>
					<td>${member.name}</td>
					<td>${member.id}</td>
					<td>${member.age}</td>
					<td>${member.phone}</td>
					<td>${member.email}</td>
				</tr>
			</table>
			
			<button class = "btn btn-primary" id="update">Update</button>
			<button class = "btn btn-danger" id="del">Delete</button>
		</div>
	</div>
	
	<script type="text/javascript">
		$("#del").click(function(){
			var result = confirm("탈퇴하시겠습니까?");
			if(result){
				location.href ="./memberDelete";
			}
		});
		
		$("#update").click(function(){
			location.href = "./memberUpdate";
		});
	</script>
</body>
</html>