<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@tag description="Menu Tag" pageEncoding="UTF-8"%>
<div class="col-md-2 remove-padding" id="verticalNav">
	<ul class="list-group">
		<a href="account_info" role="button" class="list-group-item active"> 
			<i class="fa fa-user fa-3x" aria-hidden="true"></i>  <br/>
			<span> Account Info </span> 
		</a>
		<a href="apply_for_leave" role="button" class="list-group-item"> 
			<i class="fa fa-pencil fa-3x" aria-hidden="true"></i> 
			<p> Apply for Leave </p> 
		</a>
		<a href="leave_history" role="button" class="list-group-item"> 
			<i class="fa fa-history fa-3x" aria-hidden="true"></i> 
			<p> Leave History </p>
		</a>
		<a href="employee_list" role="button" class="list-group-item"> 
			<i class="fa fa-list-ul fa-3x" aria-hidden="true"></i> 
			<p> Employee List </p>
		</a>
		<a href="leave_list" role="button" class="list-group-item"> 
			<i class="fa fa-list-alt fa-3x" aria-hidden="true"></i> 
			<p> Leave List </p>
		</a>
		<a href="add_employee" role="button" class="list-group-item">
			<i class="fa fa-user-plus fa-3x" aria-hidden="true"></i> 
			<p> Add Employee </p>
		</a>
	</ul>
</div>