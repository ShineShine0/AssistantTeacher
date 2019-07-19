<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style>
</style>
<title>Student View Page</title>

<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/submenucss/menu.css'/>" />
</head>
<body>
	<div id="content">
		<div id="content-header">

			<div id="breadcrumb" style="color: gray">
				<a href="#" title="Go to Home" class="tip-bottom"
					style="color: white" style="fontsize:large"><b><i
						class="icon-home"></i> Home</b></a>
			</div>
		</div>
		<div class="container">
			<div class="col-lg-12" style="padding-top: 50px;">
				<!-- <div class="row"
				style="border: 1px solid #00bcd4a3; margin-left: 1px; margin-right: 1px;margin-top:5px;"> -->
				<form:form commandName="lessonPlanDto" class="form-horizontal"
					action="${pageContext.request.contextPath}/addPlan.htm"
					role="form" method="POST">
					<div class="form-group">

						<div class="col-md-2" style="margin-top: 10px;">Status:</div>
						<div class="col-md-4" style="margin-top: 10px;">
							<div class="form-select" id="subjectId">
								<form:select path="status">
									<option data-display="">---Choose Status---</option>
									<option value="active">Active</option>
									<option value="inactive">Inactive</option>
								</form:select>
							</div>
						</div>

						<div class="col-md-2" style="margin-top: 10px;">Enter
							DateOfBirth:</div>
						<div class="col-md-4" style="margin-top: 10px;">
							<form:input type="date" path="sysDate" class="form-control"
								required="true" />

						</div>

						<div class="col-md-6"
							style="margin-top: 10px; margin-bottom: 10px;">
							<input type="submit" class="btn btn-sm" value="Add"
								style="color: white; background-color: #00bcd487; width: 100px; border-radius: 5px;" />
						</div>
					</div>


				</form:form>
			</div>
		</div>
	</div>
</body>
</html>