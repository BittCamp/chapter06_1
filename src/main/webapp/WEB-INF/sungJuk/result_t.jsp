<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>*** ${sungJukDTO.name} 성적 ***</h2><!-- ${sungJukDTO.getName()} 달러표현식은 get 하고 () 떼고 변수명으로 써줘도된다. -->
	<h3>
		총점 : ${sungJukDTO.tot}
		평균 : ${sungJukDTO.avg}
	</h3>
	
	
</body>
</html>