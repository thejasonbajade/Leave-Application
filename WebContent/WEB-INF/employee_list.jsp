<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<t:header/>
<div class="container-fluid" id="content">
	<div class="row">
		<t:menu/>
		<div class="col-md-10" id="mainContent">
			<div class="col-md-12">
				<div class="col-md-4 col-md-offset-8">
					<div class="form-group">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="Search Employee"/>
							<div class="input-group-btn">
								<button type="submit" class="btn btn-default">
								<i class="glyphicon glyphicon-search" aria-hidden="true"> </i>
								</button>
							</div>
						</div>
					</div>
				</div>
				<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th> Name </th>
						<th> User Name </th>
						<th> Email </th>
						<th> Department </th>
						<th> Employment Status </th>
					</tr>
				</thead>
				<tbody>
					<!-- loop employees here -->
				</tbody>
			</table>
			<ul class="pagination">
				<li class="active"><a href="">1</a></li>
				<li><a href="">2</a></li>
				<li><a href="">3</a></li>
				<li class="disabled"><a href="">4</a></li>
			</ul>
			</div>
		</div>
	</div>
</div>
<t:footer/>