<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../templat/boot.jsp"></c:import>
</head>
<body>
	<c:import url="../templat/header.jsp"></c:import>


	<div class="container">
		<div class="row">
			<table class="table table-hover">

				<h1>Notice Select Page</h1>
				<tr>
					<td>NO</td>
					<td>Subject</td>
					<td>Name</td>
					<td>Date</td>
					<td>Hit</td>
					<td>Contents</td>
				</tr>

				<tr>
					<td>${dto.num}</td>
					<td>${dto.subject}</td>
					<td>${dto.name}</td>
					<td>${dto.today}</td>
					<td>${dto.hit}</td>
					<td>${dto.contents}</td>					
				</tr>
			</table>
			
		
			<c:if test="${member.id eq 'admin'}"> 
			<a href="./noticeMod?num=${dto.num}" 	class="btn btn-primary">Update</a>
			<a href="./noticeDelete?num=${dto.num}" class="btn btn-danger">Delete</a> 
			</c:if>
		</div>
	</div>
</body>
</html>