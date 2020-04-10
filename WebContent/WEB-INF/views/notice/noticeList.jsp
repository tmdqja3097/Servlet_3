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
	<div class="container">
		<div class="row">
			<table class="table table-hover">
				<h1>Notice List Page</h1>
				<tr>
					<td>NO</td>
					<td>Subject</td>
					<td>Name</td>
					<td>Date</td>
					<td>Hit</td>
				</tr>
				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.num}</td>
						<td><a href="./noticeSelect?num=${dto.num}">${dto.subject}</a></td>
						<td>${dto.name}</td>
						<td>${dto.today}</td>
						<td>${dto.hit}</td>
					</tr>
				</c:forEach>

			</table>
		 	<c:if test="${member.id eq 'admin'}"> 
			<a href="./noticeAdd" class="btn btn-primary">글쓰기</a> 
			</c:if>
		</div>
	</div>
</body>
</html>