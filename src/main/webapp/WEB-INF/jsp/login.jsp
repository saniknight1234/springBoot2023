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
 <script>
            function validatAuth(){
                var usernameObj = window.document.getElementById("username");
                var usernameText = usernameObj.value;
                if(usernameText.length == 0){
                    document.getElementById("usernameError").innerHTML = "username cannot be blank";
                    return;
                }
                var passwordObj = window.document.getElementById("password");
                var passwordText = passwordObj.value;
                if(passwordText.length == 0){
                    document.getElementById("passwordError").innerHTML = "password cannot be blank";
                    return;
                }

                //This is submiting the form
                document.authForm.submit();
            }


        </script>
	
</head>
<body>
	<header style="height: 30px; background-color: #545b62;"></header>
	<div class="container">
	<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4ybOeJ1hAsBrFGPWMrF_FxieJ8NNWQZkqWg&usqp=CAU" class="img-thumbnail" alt="Cinque Terre" width="304" height="236"> 
	 <img src="images/st-one.jpg" class="img-thumbnail" alt="Cinque Terre" width="304" height="236">
	 <hr>
	 <span style="color: red; font-size: 18px; font-weight: bold">${message}</span>
	 <hr>
	 <form name="authForm" action="login" method="post">
	 
	 <label style="font-size: 18px">User Name </label> <br>
	 <input type="text" name="username" class="from-control" style="width: 50%" id="username"> <br>
	 <span style="color: red; font-size: 19px" id="usernameError"></span>
	 <br>
	 
	 
	 <label style="font-size: 18px">Password </label><br>
	 <input type="password" name="password" class="from-control" style="width: 50%" id="password"><br>
	 <span style="color: red; font-size: 19px" id="passwordError"></span>
	 <br><br>
	 <button type="button" class="btn btn-primary" onclick="validatAuth();">Login</button>
	 <button type="button" class="btn btn-danger">Clear</button>
	 
	 <a href="signup">
	 <button type="button" class="btn btn-danger">Signup</button>
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