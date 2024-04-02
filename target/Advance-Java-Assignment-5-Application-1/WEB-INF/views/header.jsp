<%@page import="com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Librarian"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<header >
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header" style="margin-left: 30%;">
					<h2>Library Management System</h2>
				</div>
				<ul class="nav navbar-nav navbar-right">
				<li>
				
				
						<form action="logout" method="post">
						Welcome !!
				<b style="color:#1a1a8a;">${usr}</b> &nbsp;
							<input class="btn btn-outline-primary"
								type="submit" value="Logout">
						</form>
					</li>
				</ul>
			</div>
		</nav>
	</header>
<hr>
</body>
</html>