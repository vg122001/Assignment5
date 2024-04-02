<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List, java.util.ArrayList"%>
<%@ page
	import="com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Book"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
	
	
<style type="text/css">
#edbtn {
	padding-inline: 5px;
	text-align: center;
	
	color: grey;
	text-decoration: none;
}
#debtn {
	padding-inline: 5px;
	text-align: center;
	
	color: red;
	text-decoration: none;
}
</style>	
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	%>
	<jsp:include page="header.jsp"></jsp:include>



	<header>
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header" style="margin-left: 30%;">

					<h4>Books Listing</h4>
				</div>
				<ul class="nav navbar-nav navbar-right">
					<li>


						<form action="add" method="POST" modelAttribute="adding">

							<input type="submit" value="Add Book" class="btn btn-primary">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</form>
					</li>
				</ul>
			</div>
		</nav>
	</header>

	<br>



	<c:if test="${booklist!=null}">



		<div id="content">
			<table class="table table-striped table-bordered  border   mt-4 p-2"
				cellpadding="3" width=100%">
				<tr>
					<th>ID</th>
					<th>Book Name</th>
					<th>Author Name</th>
					<th>Date</th>
					<th>Actions</th>
				</tr>

				<c:forEach var="book" items="${booklist}">



					<tr>
					
						<td>${book.getId()}</td>
						<td>${book.getBookName()}</td>
						<td>${book.getAuthorName().getName()}</td>
						<td>${book.getDate()}</td>
						<td><a id="edbtn" href="edit?id=${book.getId()}">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a id="debtn" href="deletebook?id=${book.getId()}">Delete</a></td>
                  
						
				</tr>

</c:forEach>

			</table>

		</div>
</c:if>



</body>
</html>