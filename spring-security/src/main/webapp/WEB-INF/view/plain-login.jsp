<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Login form</title>
</head>
<body>

<h3>My Custom Login Page</h3>
	
<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">


<c:if test="${param.error!=null}">
	<i>Sorry! You entered invalid username/password!</i>
</c:if>

<p>
	User name:<input type="text" name="username" />
</p>

<p>
	Password:<input type="password" name="password" />
</p>

<input type="submit" value="Login" />

</form:form>

</body>
</html>