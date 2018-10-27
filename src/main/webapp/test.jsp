<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="testList" method="get">
		请输入姓名:<input type="text" name="myContent" value="${requestScope.content}">
		<input type="submit" value="查询"/>
	</form>
	
	<table border="1">
		<tr>
			<th>用户Id</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>手机号</th>
		</tr>
		<c:forEach var="temp" items="${requestScope.testList}">
			<tr>
				<td>${temp.id}</td>
				<td>${temp.name}</td>
				<td>${temp.age}</td>
				<td>${temp.phoneNuber}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>