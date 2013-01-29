<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Hibernate Task</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link href="/Task7/css/style.css" rel="stylesheet">
<link href="/Task7/css/bootstrap.css" rel="stylesheet">
<link href="/Task7/css/bootstrap-responsive.css" rel="stylesheet">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
	<div class="wrapper">
		<!-- Start header -->
		<div class="navbar">
			<div class="navbar-inner">
				<p class="brand">Hibernate Task</p>
			</div>
		</div>
		<!-- End header -->
		<!-- Start content -->
		<div class="container">
		<%--  ${employeeList } --%>
			<table class="table table-striped table-bordered">
				<caption>List of employees</caption>
				<thead>
					<tr>
						<th>#</th>
						<th>Employee Name</th>
						<th>Employee Address</th>
						<th>Work</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${employeeList }" var="employee"
						varStatus="statusEmployee">

						<tr>
							<td>${statusEmployee.count }</td>
							<td>${employee.firstName } ${employee.lastName }</td>
							<td>${employee.address.city.country.name },
								${employee.address.city.name }, ${employee.address.street}
								street, ${employee.address.building }
								<c:if test="${employee.address.apartment != 0}">
								,${employee.address.apartment} ap.
								</c:if>
								</td>
							<td><c:forEach items="${employee.works }" var="work"
									varStatus="statusWork">
									<p>
										Company: ${work.office.company.name }<br> Company Address:
										${work.office.address.city.country.name },
										${work.office.address.city.name }, ${work.office.address.street} street,
										${work.office.address.building }
										<c:if test="${work.office.address.apartment != 0}">
										, ${work.office.address.apartment} ap.
										</c:if>
										<br> Number of employees: ${work.countOfEmployees }<br>
										Position: ${work.position.name }
									</p>

								</c:forEach></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
	<!-- End content -->
	<div class="footer">
		<p>Copyright &copy; EPAM 2013. All rights reserved.</p>
	</div>
</body>
</html>