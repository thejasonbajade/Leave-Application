<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
	
<link rel="stylesheet" href='<c:url value="/assets/css/bootstrap.min.css" />'>
<link rel="stylesheet" href='<c:url value="/assets/css/main.css" />'>
<link rel="stylesheet" href='<c:url value="/assets/css/font-awesome.min.css" />'>	
	
<title> Leave Management System </title>
</head>
<body id="index">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-8 col-md-offset-2">
					<h2 class="white"> LEAVE SUBMISSION AND AUTHORIZATION SYSTEM </h2>
					<!--<h4 class="white"> Orange &amp; Bronze Software Labs, Inc. </h4>-->
				</div>
				<div class="col-md-3 col-md-offset-6">
					<a href="account_info" class="white"> 
						<div class="col-md-5">
							<span> Sign in with: </span> 
						</div>
						<div class="col-md-3">
							<img src='<c:url value="/assets/images/google.png" />' class="img img-responsive" alt="Google" title="Google"/>
						</div>
					</a>
				</div>
			</div>
		</div>
	</div>
<t:footer/>