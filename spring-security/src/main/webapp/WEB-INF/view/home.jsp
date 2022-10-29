
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
	<title>luv2code Company Home Page</title>

</head>


<body>
	Welcome to spring security demo application
	User:<security:authentication property="principal.username" />
	Roles:<security:authentication property="principal.authorities" />
	
	<security:authorize access="hasRole('MANAGER')">
	
	<hr>
		<p>
			<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a>
			(Only for Manager peers)
		</p>
	<hr>
	</security:authorize>
	<security:authorize access="hasRole('ADMIN')">
	
	<hr>
		<p>
			<a href="${pageContext.request.contextPath}/systems">Admin fix</a>
			(Only for admin peers)
		</p>
	<hr>	
	</security:authorize>
	
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout" />
	</form:form>
	
</body>

</html>