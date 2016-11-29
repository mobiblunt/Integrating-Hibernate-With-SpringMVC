<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Add Employee</title>
	<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header " >
				<span class="navbar-brand">Add New Employee Page</span>  
			</div>
			
		</div>
	</nav>
	<div align="center">
		<h1 style="text-align: center;">Employee Information</h1>
		<hr/>
		</div>
		<div class="container">
		<!--form class="form-horizontal" role="form" -->
					<form:form method="POST" action="updatemployee" >
					
						
                                            <div class="row">
                                                    <div class="center-block col-md-4" style="float: none; background-color: grey">
      
    
                                                        <br><div class="col-sm-4"><form:label path="firstName">First Name</form:label></div>
								
							<div class="col-sm-4">
								<form:input path="firstName" />
							</div><br/><br/>
                                            
						
							
                                                        <div class="col-sm-4"><form:label path="lastName">Last Name</form:label></div>
							<div class="col-sm-4">
								<form:input path="lastName" />
							</div><br/><br/>
						
						
							
                                                        <div class="col-sm-4"><form:label path="jobTitle">Job Title</form:label></div>
							<div class="col-sm-4">
								<form:input path="jobTitle" />
							</div><br/><br/>
						
						
							
                                                        <div class="col-sm-4"><form:label path="department">Department</form:label></div>
							<div class="col-sm-4">
								<form:input path="department" />
							</div><br/><br/>
						
						
							
                                                        <div class="col-sm-4"><form:label path="salary">Salary</form:label></div>
								<div class="col-sm-4">
								<form:input path="salary" />
							
								</div><br/><br/>
						
						<div class="col-sm-8">
                                                    <br>
						<button type="submit" value="Submit" class="btn btn-danger" style="margin-left: 75px">Submit</button>
						</div>
						
                                                    </div>	<!--input type="submit" value="Submit" /-->
						
					</div>
  </div>
				</form:form>
				</div>
			

</body>
</html>    
