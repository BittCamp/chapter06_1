<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/chapter06_1/sungJuk/result.do" method="post">
	<table>
		<tr>
			<th>이름</th>
			<td><input name="name" type="text"/></td>
		</tr>
		<tr>
			<th>국어</th> 
			<td><input name="kor"type="text"/></td>
		</tr>
		<tr>
			<th>영어</th> 
			<td><input name="eng"type="text"/></td>
		</tr>
		<tr>
			<th>수학</th> 
			<td><input name="math"type="text"/></td>
		</tr>
		<tr>
			<td><button type="submit">계산</button></td>
		</tr>
	</table>
</form>
</body>
</html>