<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <h1>${param.x}+${param.y} = ${param.x+param.y }</h1> --%> <!-- request.getParameter꺽쇠표현식도 마찬가지다.
																	  param으로 받아 와야 된다.jquery참고 jsp나 서블릿에서 http요청에 의해서 값을 가져오는 방식이다.
																	jquery 에서야 비로소 달러표현식으로 쓴다. 제이쿼리는 축약형 javascript 자바스크립트의 라이브러리이므로
																	자바스크립트에서는 function으로 가져오는 거라 가져오는 방식은 같다고봐야한다.
																	  -->
<h1>${x }+${y }=${x+y }</h1>	
</body>
</html>