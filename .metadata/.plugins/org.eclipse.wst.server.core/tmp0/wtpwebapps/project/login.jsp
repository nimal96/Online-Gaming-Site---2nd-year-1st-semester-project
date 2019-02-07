<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script> 
function validate()
{ 

 	var username = document.form.username.value; 
 	var password = document.form.password.value;


 	if (username==null || username=="")
 	{ 
 		alert("Username can't be blank"); 
	 	return false; 
 	}

 } 
</script> 
</head>
<body>
    <meta charset="ISO-8859-1">
    <title>Login</title>
    <link rel="stylesheet" href="login.css">
    <div class="login-page">
        <div class="form" >
            <form name="form" method = "POST" action ="LoginServlet" onsubmit="return validate()">
                <input type="text" placeholder="username" name = "username" />
                <input type="password" placeholder="password" name = "password"/>

                <button type ="submit">LOGIN</button>
                <p class="message">Not registered? <a href="registration.jsp">Create an account</a></p>
 				<table>
 				<tr>
				 <td><%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%></td>
 				</tr>
				</table>
            </form>
        </div>
    </div>



</body>
</html>