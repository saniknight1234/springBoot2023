<!DOCTYPE html>
<html>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=number] {
	width: 40%;
	padding: 4px;
	margin: 3px 0 17px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #4ed6c5;
	outline: none;
}

hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

button:hover {
	opacity: 1;
}

/* Extra styles for the cancel button */
.cancelbtn {
	padding: 14px 20px;
	background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
	float: left;
	width: 50%;
}

/* Add padding to container elements */
.container {
	padding: 16px;
}

/* Clear floats */
.clearfix::after {
	content: "";
	clear: both;
	display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
	.cancelbtn, .signupbtn {
		width: 100%;
	}
}
</style>
<body>

	<form action="updateImage" method="post" style="border: 1px solid #ccc">
		<div class="container">
			<h2>Edit Image</h2>

			<hr>

		
			<label for="email"><b>Email</b></label><br> <input type="text"
				name="email" style="width: 20%" value="${sData.email}"><br>

			<h2>Current Image</h2>
			<div class="card" style="width: 400px">
			<h4 class="card-title">${sData.username} </h4>

				<img class="card-img-bottom" src="${sData.image}" alt="image"
					style="width: 100%">
				<p>Please enter the image url</p>
			<input type="hidden" name="sid" value="${sData.sid}"><br>
			<input type="text" name="newimage" class="form-control" style="width: 90%"><br>
					
				<button type="submit" class="signupbtn" style="width: 30%">Update</button>
			</div>



		</div>

	</form>

</body>
</html>
