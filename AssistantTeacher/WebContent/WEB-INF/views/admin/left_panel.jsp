<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- Left Panel -->

	<aside id="left-panel" class="left-panel"> 
	<nav class="navbar navbar-expand-sm navbar-default">

	<div class="navbar-header">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#main-menu" aria-controls="main-menu"
			aria-expanded="false" aria-label="Toggle navigation">
			<i class="fa fa-bars"></i>
		</button>
		<a class="navbar-brand" href="">UCS(Momywa) Admin</a> 
		<%-- <a
			class="navbar-brand hidden" href="./"><img
			src="<c:url value='/resources/assets/img/logo.png'/>" alt="Logo"></a> --%>
	</div>

	<div id="main-menu" class="main-menu collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="<c:url value='/adminPermission/admin_welcome.htm'/>"> <i
					class="menu-icon ti-home"></i>Home
			</a>
			</li>
			<sec:authorize access="hasRole('ROLE_Teacher')" >
			<h3 class="menu-title">student element</h3>
			<li class="menu-item-has-children dropdown" id="student"><a href="#"
				class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i
					class="menu-icon fa fa-universal-access"></i>Student
			</a>
				<ul class="sub-menu children dropdown-menu" style="background-color:#115a54;">
					<!--                             <li><i class="fa fa-plus-square-o"></i><a href="#">Add Student</a></li>
 					-->
					<%-- <li class="" id="first-year"><i class="fa fa-eye"></i><a href="<c:url value='/adminPermission/admin/first_year.htm'/>">First Year</a></li>
					<li><i class="fa fa-eye"></i><a href="#">Second Year</a></li>
					<li><i class="fa fa-eye"></i><a href="#">Third Year</a></li>
					<li><i class="fa fa-eye"></i><a href="#">Fourth Year</a></li>
					<li><i class="fa fa-eye"></i><a href="#">Fifth Year</a></li> --%>
					<%-- <li class="" id="allStudent"><i class="fa fa-eye"></i><a href="<c:url value='/adminPermission/admin/allStudent.htm'/>">All Student</a></li>
					<li><i class="fa fa-edit"></i><a href="<c:url value='/adminPermission/export/student-list.htm'/>">Student Id</a></li>
					<li><i class="fa fa-share-square-o"></i><a href="#">Transfer
							Student</a></li>
					<li><i class="fa fa-registered"></i><a href="<c:url value='/adminPermission/admin/register-list.htm'/>">Registration List</a></li>
					<li><i class="fa fa-user-plus"></i><a href="<c:url value='/adminPermission/manual-add-student.htm'/>">Manually
							Add</a></li> --%>
				</ul></li>
				
				</sec:authorize>
			<%-- <sec:authorize access="hasRole('ROLE_Admin')" >
                    
                   </sec:authorize> --%>
		<sec:authorize access="hasRole('ROLE_Admin')" >
    	<h3 class="menu-title">user role element</h3>
			<li class="menu-item-has-children dropdown"><a href="#"
				class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="menu-icon fa fa-id-card"></i>Role
			</a>
				<ul class="sub-menu children dropdown-menu"style="background-color:#115a54;">
					<li><i class="fa fa-eye"></i><a href="<c:url value='/adminPermission/admin/viewRole.htm'/>">View User</a></li>
					<li><i class="fa fa-plus-square-o"></i><a href="<c:url value='/adminPermission/admin/addRole.htm'/>"> Add User</a></li>

					<!--
                            <li><i class="fa fa-user-plus"></i><a href="#"> </a></li> -->
				</ul></li>
				</sec:authorize> 
				
				<h3 class="menu-title">User profile</h3>
			<li><a href="<c:url value='/adminPermission/changePassword.htm'/>"> <i
					class="menu-icon fa fa-key"></i>Change Password</a></li>
					<li><a href="<c:url value='/logout.htm'/>"><i class="menu-icon fa fa-power-off"></i>Logout</a></li>
		</ul>
	</div>
	<div class="row" style="border: 0.6px dotted #009688;">
	
	</div>
	<!-- /.navbar-collapse --> </nav> 
	
	</aside>
	<!-- /#left-panel -->

</body>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</html>