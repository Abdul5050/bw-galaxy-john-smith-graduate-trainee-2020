<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-user">Add User</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of Users</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="20%">First Name</th>
						<th width="20%">Last Name</th>
						<th width="40%">Email Address</th>
						
						<th width="20%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users}" var="user">
						<tr>
							<td>${user.firstName}</td>
							<td>${user.lastName}</td>
							<td>${user.email}</td>
							
							<td><a type="button" class="btn btn-success"
								href="/update-user?id=${user.id}">Update</a>
							<a type="button" class="btn btn-warning"
								href="/delete-user?id=${user.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>