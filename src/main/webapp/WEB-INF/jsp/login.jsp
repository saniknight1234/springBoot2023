<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Login</title>
</head>
<body>
	<header style="height: 30px; background-color: #545b62;"></header>
	<div class="container">
	<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4ybOeJ1hAsBrFGPWMrF_FxieJ8NNWQZkqWg&usqp=CAU" class="img-thumbnail" alt="Cinque Terre" width="304" height="236"> 
	 <img src="images/st-one.jpg" class="img-thumbnail" alt="Cinque Terre" width="304" height="236">
	 <hr>
	 <span style="color: red; font-size: 18px; font-weight: bold">${message}</span>
	 <hr>
	 <form action="abdul" method="post">
	 
	 <label style="font-size: 18px">User Name </label> <br>
	 <input type="text" name="username" class="from-control" style="width: 50%">
	 <br>
	 
	 <label style="font-size: 18px">Password </label><br>
	 <input type="password" name="password" class="from-control" style="width: 50%">
	 <br><br>
	 <button type="submit" class="btn btn-primary">Login</button>
	 <button type="button" class="btn btn-danger">Clear</button>
	 
	 <a href="signup.jsp">
	 <button type="button" class="btn btn-success">Sign Up</button>
	 </a>
	 <br>
	  <hr>
  		<a href="kiki">
  		
  		<marquee direction="right" scrolldelay="100"><img src="images/st-one.jpg" class="img-thumbnail" alt="Cinque Terre" width="100" height="70"></marquee>
  		</a>
	 </form>
	</div>

</body>
</html>