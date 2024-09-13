<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="p-5 container col-6">
	<h2 class="text-center">College Registration</h2>
	<form action="<%=request.getContextPath()%>/Registration" method="post">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">College Name</label>
 			 <input type="text" class="form-control" id="exampleFormControlInput1" name="college_name" >
		</div>
		<div class="mb-3">
		    <label for="exampleFormControlInput1" class="form-label">Email address</label>
 			 <input type="email" class="form-control" id="exampleFormControlInput1" name="email">
		</div>
		<div class="mb-3">
 			 <label for="exampleFormControlInput1" class="form-label">College Reg No:</label>
  			<input type="text" class="form-control" id="exampleFormControlInput1" name="college_reg">
		</div>
		<div class="mb-3">
 			 <label for="exampleFormControlInput1" class="form-label">College address</label>
 			 <input type="text" class="form-control" id="exampleFormControlInput1" name="college_address">
		</div>
		<div class="mb-3">
  			<label for="exampleFormControlInput1" class="form-label">College Website</label>
  			<input type="text" class="form-control" id="exampleFormControlInput1" name="college_website">
	</div>
	<div class="mb-3">
 		 <input type="submit" class="form-control btn btn-primary" value="submit" id="exampleFormControlInput1">
	</div>
	
	
	</form>
  


</div>
	

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>