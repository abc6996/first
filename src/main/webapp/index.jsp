<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
</head>
<body>
<a href="hello?username=tom">hello</a><br>



<form action="aaa" method="post">
	id:<input type="text" name="id"><br>
	name:<input type="text" name="name"><span>${errorMap.name }</span><br>
	gender:<input type="text" name="gender"><span>${errorMap.gender }</span><br>
	day:<input type="text" name="day"><span>${errorMap.day }</span><br>
	<input type="submit" value="提交">
</form>


<form action="converterTest" method="post">
	<input name="useraaa" value="1-dwj-nan"><br>
	<input type="submit" value="提交">
</form>

</body>
</html>