<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of Users</h3>
		</div>
		<div class="panel-body">
		<form:form method="post" modelAttribute="users">
		
			<table class="table table-striped">
				<thead>
					<tr>
					<th width="5%">#</th>
						<th width="20%">First Name</th>
						<th width="20%">Last Name</th>
						<th width="40%">Email Address</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users}" var="user">
						<tr>
						  <td>#</td>
							<td>${user.firstName}</td>
							<td>${user.lastName}</td>
							<td>${user.email}</td>
							
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<button type="submit" class="btn btn-primary btn-right">Assign Task</button>
					</form:form>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>