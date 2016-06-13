<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<t:header/>
<div class="container-fluid" id="content">
	<div class="row">
		<t:menu/>
		<div class="col-md-10" id="mainContent">
			<t:leave_credits_display/>
			<div class="col-md-12">
				<h1> ${welcomeMessage} </h1>
				<t:admin_tabs/>
				<div class="panel panel-default">
					<div class="panel-body">
					</div>
				</div>
			</div>	
		</div>
	</div>
</div>
<t:footer/>