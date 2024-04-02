<%@ page contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="A"%>




<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
<title>Login Page</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" />

<style>
@charset "ISO-8859-1";

body {
	padding-top: 90px;
}

.astrick:after {
	content: " *";
	color: red;
}

label {
	font-weight: 500;
	font-size: 20px;
}

.panel-login input {
	height: 45px;
	border: 1px solid #ddd;
	font-size: 16px;
	-webkit-transition: all 0.1s linear;
	-moz-transition: all 0.1s linear;
	transition: all 0.1s linear;
}

.panel-login input:hover, .panel-login input:focus {
	outline: none;
	-webkit-box-shadow: none;
	-moz-box-shadow: none;
	box-shadow: none !important;
}


</style>
</head>
<body>

	<div class="container">
		<div class="row">

			<div class=" panel-login">
				<div class="panel-heading">


					<h2>Enter Your Credentials</h2>

<b style="color:red;">${msg}</b>
					<hr>
				</div>
				<div class="panel-body">
					<div class="row">
					<A:form class="form-horizontal" action="login" method="POST" modelAttribute="logged">
						<div class="form-group row p-2">
								<label class="astrick col-sm">Username</label> <input
									type="text" class="form-control col-sm" id="inputName"
									name="username" aria-describedby="Name" placeholder="UserName"
									required />
							</div>
							<div class="form-group row p-2">
								<label class="astrick col-sm">Password</label> <input
									name="password" type="password" id="loginPass" required
									tabindex="2" class="form-control col-sm" placeholder="Password">
							</div>
							<br>
							<div class="p-2 d-grid gap-2 d-md-block text-center">
								<button type="submit" class="btn btn-secondary">Login</button>
								
							</div>
							<br>
					</A:form>

</div>
			</div>		
				
			</div>
	</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

