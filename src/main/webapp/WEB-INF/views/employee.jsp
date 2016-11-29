<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; 
	charset=ISO-8859-1">
	<title>Employee List</title>
	<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header " >
				<span class="navbar-brand">Employee Page</span>  
			</div>

		</div>
	</nav>
	
	<div align="center">
		
		
		<a href="${pageContext.request.contextPath}/employee/addemployee" style="background-color: lightblue;"> <button type="button" class="btn btn-success">Add Employee</button> </a>
		<hr/>
		<h1 style="text-align: center;">Employee List</h1>
		<div class="container">
			<table class="table">
				<thead>
					<tr>
						<th>No</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Job Title</th>
						<th>Department</th>
						<th>Salary</th>
						<th>Delete</th>
					</tr>
				</thead>

				<c:forEach var="employee" items="${employeesList}" varStatus="status">
				<tr class="success">
					<td><b>${status.index + 1}</b></td>
					<td>${employee.firstName}</td>
					<td>${employee.lastName}</td>
					<td>${employee.jobTitle}</td>
					<td>${employee.department}</td>
					<td>${employee.salary}</td>
					<td><a href="${pageContext.request.contextPath}/employee/delete/${employee.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>

		
	</div>
</div>
</body>
</html>
