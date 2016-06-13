<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<t:header/>
<div class="container-fluid" id="content">
	<div class="row">
		<t:menu/>
		<div class="col-md-10" id="mainContent">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-body">
						<form class="col-md-8 col-md-offset-2">
							<div class="form-group col-md-12">
								
								<label class="col-md-4"> First Name </label>
								<div class="col-md-8">
									<input type="text" class="form-control" value="Jason">
								</div>
							</div>
							
							<div class="form-group col-md-12">
								<label class="col-md-4"> Last Name </label>
								<div class="col-md-8">
									<input type="text" class="form-control" value="Bajade">
								</div>
							</div>
							
							<div class="form-group col-md-12">
								<label class="col-md-4"> Email </label>
								<div class="col-md-8">
									<span>jasonbajade@orangeandbronze.com</span>
								</div>
							</div>
							
							<div class="form-group col-md-12">
								<label class="col-md-4"> Contact Number </label>
								<div class="col-md-8">
									<input type="text" class="form-control" value="09xxxxxxxxxxx">
								</div>
							</div>
							
							<div class="form-group col-md-12">
								<label class="col-md-4"> Employment Date </label>
								<div class="col-md-8">
									<input type="date" class="form-control">
								</div>
							</div>
							
							<div class="form-group col-md-12">
								<label class="col-md-4"> Employee Position </label>
								<div class="col-md-8">
									<input type="text" class="form-control" value="Senior Enterprise Engineer">
								</div>
							</div>
							
							<div class="form-group col-md-12">
								<label class="col-md-4"> Employee Status </label>
								<div class="col-md-8">
									<select class="form-control">
										<option> Probationary </option>
										<option> Regular </option>
									</select>
								</div>
							</div>
							
							<div class="form-group col-md-12">
								<label class="col-md-4"> Department </label>
								<div class="col-md-8">
									<select class="form-control">
										<option> Department 1 </option>
										<option> Department 2 </option>
										<option> Department 3 </option>
										<option> Department 4 </option>
									</select>
								</div>
							</div>
							
							<div class="form-group col-md-12">
								<label class="col-md-4"> Account Enabled </label>
								<div class="col-md-8">
									<input type="checkbox" checked>
								</div>
							</div>

							<div class="form-group col-md-12">
								<label class="col-md-4"> Role </label>
								<div class="col-md-8">
									<div class="checkbox">
										<label><input type="checkbox" checked> Regular Employee </label>
									</div>
									<div class="checkbox">
										<label><input type="checkbox"> HR </label>
									</div>
									<div class="checkbox">
										<label><input type="checkbox"> Admin </label>
									</div>
									<div class="checkbox">
										<label><input type="checkbox"> Supervisor </label>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>		
			</div>	
		</div>
	</div>
</div>
<t:footer/>