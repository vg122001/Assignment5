<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="A"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>

	<link rel="stylesheet" href=addBook.css>

	<style>

		.addbookdetails{
			margin-left:462px ;
		}
	</style>

</head>
<body>
<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	%>

	<div class="addbookdetails">
		<h4>Add Book Details</h4>
		<b class="text-center" style="color: red;">${error}</b>
	</div>

	<div class=" p-2" style="margin-left: 30%; width: 500px;">



		<A:form class="form-horizontal" action="addbook" method="POST"
			modelAttribute="abook">
			<table class="table table-borderless">
				<tr>
					<td>Book Code</td>
					<td><input name="id" type="text" pattern="[a-zA-Z0-9]+" required></td>

				</tr>
				<tr>
					<td>Book Name</td>
					<td><input name="bookName" type="text" required></td>

				</tr>
				<tr>
					<td>Author</td>
					<td><c:if test="${authorlist!=null}">

							<select name="authorName" style="width: 170px !important;"
								required>
								<option hidden disabled selected value="">-- select an
									option --</option>
								<c:forEach var="a" items="${authorlist}">

									<option value="${a.getName()}">${a.getName()}</option>

								</c:forEach>
							</select>

						</c:if></td>

				</tr>
				<tr>
					<td>Added On</td>
					<td>
						<% Date date = new Date(); 
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
						%> <input name="date" type="text" style="border:none;"
						value="<%= formatter.format(date) %>" readonly="readonly">



					</td>

				</tr>
			</table>
			<div class="btn-toolbar p-2" >
				<input type="submit" name="save" value="Submit"
					class="btn-group p-2 mr-2 btn btn-primary"> &nbsp;
		</A:form>


		<form action=cancel method="post">
			<input type="submit" name="cancel" value="Cancel"
				class="btn-group p-2 mr-2 btn btn-danger">
		</form>
</div>
	</div>

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
</body>
</html>