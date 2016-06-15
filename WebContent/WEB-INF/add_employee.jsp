<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<t:header/>
<div class="container-fluid" id="content">
	<div class="row">
		<t:menu/>
		<div class="col-md-10" id="mainContent">
			<div class="col-md-12">
				<h1>Add Employee Form</h1>
				<div class="panel panel-default">
					<div class="panel-body">
						<t:add_employee_form/>
					</div>
				</div>		
			</div>	
		</div>
	</div>
</div>
<t:footer/>