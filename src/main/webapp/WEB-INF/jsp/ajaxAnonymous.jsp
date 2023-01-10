<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	//sumTowNum is variable which hold function definition
	//function expression or anonymous function.
	var sumTwoNum = function(num1, num2){
		var temp = num1+num2;
		return temp;
	}
	//calling suTowNum
	sumTwoNum(20,10);
	ajax(sumTwoNum, 5);
	
	
	
	
	
	
	//Normal function
	//passing one function to another function
	function ajax(callback, num){
		var result = callback(num, num, + 5);
		console.log("The result is "+ result);
	}
	//or we can pass function difinition directly
	ajax(function(num1, num2){
		var temp = num1+num2;
		return temp;
	}, 5);
	
	
	
</script>


</head>
<body>

</body>
</html>