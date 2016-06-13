<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<t:header/>
<div class="container-fluid" id="content">
	<div class="row">
		<t:menu/>
		<div class="col-md-10" id="mainContent">
			<div class="col-md-12">
				<table class="table table-striped table-bordered">
					<thead>
						<tr>
							<th> Status (Supervisor) </th>
							<th> Status (HR) </th>
							<th> Name </th>
							<th> Leave Type </th>
							<th> Date Filed </th>
							<th> Start Date </th>
							<th> End Date </th>
							<th> Duration </th>
							<th> Action </th>
						</tr>
					</thead>
					<tbody>
						<!-- loop leaves here -->
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
<t:footer/>