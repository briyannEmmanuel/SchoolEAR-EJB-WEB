<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta charset="UTF-8" http-equiv="Content-Type">
		<link rel="stylesheet" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" href="css/style.css"/>
		<title>Student</title>
	</head>
	<body>
	
		<div class="container col-lg-6 col-md-6 col-sm-12 col-xs-12 col-lg-offset-3 col-md-offset-3 spacer" align="center">
			<div class="panel panel-info">
				<div class="panel-heading">Formulaire d'ajout des inscriptions</div><br><br>
				<div class="panel-body">
					<form method="post" action="inscription">
						<div class="form-group">
							<label class="control-label">Details</label>
							<input class="form-control" type="text" name="details" id="details"/>
						</div>
						<div class="form-group">
							<label class="control-label">Student</label>
							<input class="form-control" type="text" name="students" id="students"/>
						</div>
						<div class="form-group">
							<label class="control-label">Courses</label>
							<input class="form-control" type="text" name="name" id="courses"/>
						</div>
						<div class="form-group">
							<label class="control-label">Year</label>
							<input class="form-control" type="text" name="years" id="years"/>
						</div>
						<div>
							<input class="btn btn-success" type="submit" name="Ajouer" id="Ajouer"/>
							<input class="btn btn-danger" type="reset" name="Annuler" id="Annuler"/>
						</div>
					</form>
				</div>
			</div>
		</div>
		<div class="container spacer" align="center">
			<div class="panel panel-info">
				<div class="panel-heading">Liste des inscriptions</div><br><br>
				<div class="panel-body">
					<table class="table table-bordered table-striped">
						<tr>
							<th>ID</th>
							<th>DETAILS</th>
							<th>STUDENT</th>
							<th>COURSES</th>
							<th>YEAR</th>
						</tr>
						<c:forEach items="${inscription}" var="inscription">
							<tr>
								<td>${inscription.id}</td>
								<td>${inscription.details}</td>
								<td>${inscription.student}</td>
								<td>${inscription.courses}</td>
								<td>${inscription.year}</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
		 <script src="public/js/jquery-3.3.1.min.js"></script>
    <script src="public/js/popper.min.js"></script>
    <script src="public/js/bootstrap.min.js"></script>
    <script src="public/js/jquery.sticky.js"></script>
    <script src="public/js/main.js"></script>
	</body>
</html>