<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-todo">Add New Task</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of Task</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="20%">ShortDescription</th>
						<th width="40%">DetailedDescription</th>
						<th width="7%">DueDate</th>
						<th width="40%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.shortDescription}</td>
							<td>${todo.description}</td>
							<td><fmt:formatDate value="${todo.targetDate}"
									pattern="dd/MM/yyyy" /></td>
							<td><a type="button" class="btn btn-success"
								href="/assign-users?id=${todo.id}">Assign User</a>
								<a type="button" class="btn btn-success"
								href="/update-todo?id=${todo.id}">Update</a>
							<a type="button" class="btn btn-warning"
								href="/delete-todo?id=${todo.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>