<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="card mt-2 p-2">
 <h1>This is our first Servlet demo</h1>
 <form action="<%=request.getContextPath()%>/participant" method="post">
 	<label>Full Name:</label>
 	<input type="text" name="full_name">
 	<br>
 	<label>Email:</label>
 	<input type="email" name="email">
 	<br>
 	<label>Semester</label>
 	<input type="text" name="semester">
 	
 	<br>
 	<input type="submit" value="submit">
 </form>
</div>
</body>
</html>