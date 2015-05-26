<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inclTags.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Persons Management</title>
</head>
<body>

	<h1>Persons List</h1>

	<form:form action="person.doit" method="POST" commandName="person">
		<table>
			<tr>
				<td>Person Id</td>
				<td><form:input path="personId" /></td>
				<td><input type="submit" name="action" value="Search" /></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstname" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastname" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:input path="gender" /></td>
			</tr>
			<tr>
				<td>Login</td>
				<td><form:input path="login" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input path="password" /></td>
			</tr>

			<tr>
				<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" /> 
				<input type="submit" name="action" value="Delete" /> 
					</td>
			</tr>
		</table>
	</form:form>

	<br>

	<table border="1">

		<th>Person: ID</th>
		<th>Person: First Name</th>
		<th>Person: Last Name</th>
		<th>Person: Age</th>
		<th>Person: Gender</th>
		<th>Person: Login</th>
		<th>Person: Password</th>
		<c:forEach items="${personList}" var="person">
			<tr>
				<td>${person.personId }</td>
				<td>${person.firstname }</td>
				<td>${person.lastname }</td>
				<td>${person.age }</td>
				<td>${person.gender }</td>
				<td>${person.login }</td>
				<td>${person.password }</td>
			<tr />
		</c:forEach>
	</table>

</body>
</html>