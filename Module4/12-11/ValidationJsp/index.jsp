<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type='text/javascript'>

function formValidator()
{
	var fname = document.getElementById('fname');
	 var lname = document.getElementById('lname');
	var email = document.getElementById('email');
	var mobile = document.getElementById('mobile');
	var pass = document.getElementById('pass'); 
	
	if(isAlphabet(fname, "Please enter only letters for your Firstname")){
		  if(isAlphabet(lname, "Please enter only letters for your Lastname")){
			 
			 if(emailValidator(email, "Please enter a valid email address")){
				  if(isNumeric(mobile, "Please enter 10-digit number")){
					if(ispass(pass, "Please enter password with one lowercase,one uppercase,one special character,one numeric,atleast 8-20.")){
						return true;
						}
					
					}  
				 
				}
			 
			}
		
		 }  
	
	 
	
	
	
	return false;
}
function isAlphabet(elem, helperMsg)
{
	var alphaExp = /^[a-zA-Z]+$/;
	if(elem.value.match(alphaExp))
	{
		return true;
	}
	else
	{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}

function emailValidator(elem, helperMsg)
{
	var emailExp =/^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
	 
	 if(elem.value.match(emailExp))
	{
		return true;
	}
	else
	{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}
function isNumeric(elem, helperMsg)
{
	var numericExpression = /^[0-9]{10}$/;
	if(elem.value.match(numericExpression)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}

function ispass(elem, helperMsg)
{
	var passExp = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[ -/:-@\[-`{-~]).{8,20}$/;
	if(elem.value.match(passExp)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
} 

</script>





</head>
<body>

	<form action="insertdata.jsp"   onsubmit='formValidator()' >
	<div >
	 Enter your Firstname:<input type="text" name="fname" placeholder="Enter your name" id="fname"/>
	<p>
	Enter your Lastname:<input type="text" name="lname" id="lname">
	</p>
	
	 <p> 
	
	Enter your Email:<input type="text" name="email" id="email"/>
	
	<p>
	 Enter your Mobile:<input type="text" name="mobile" id="mobile"/>
	<p>
	Enter your Gender:<input type="text" name="gender"  />
	<p>
	Enter your Password:<input type="password" name="pass" id="pass"/>
	<p> 
	<input type="submit" value="submit"/>
	
	
	</div>
	</form>



</body>
</html>