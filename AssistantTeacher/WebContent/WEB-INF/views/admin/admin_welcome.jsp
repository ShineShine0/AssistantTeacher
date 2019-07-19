<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/include.jsp"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="X-UA-Compatible" content== "IE=edge "/>
<meta name="google" value="notranslate" />


</head>
<body>
	<%-- <sec:authorize access="hasRole('ROLE_Admin')" > --%>
    <!-- Right Panel -->

    <div id="right-panel" class="right-panel">

        <!-- Header-->
        <header id="admin-header" class="header">

            <div class="header-menu">

                <div class="col-sm-7">
                    <a id="menuToggle" class="menutoggle pull-left"><i class="fa fa fa-tasks" style="margin-top: 11px;"></i></a>
                    <!-- <div class="header-left">
                        <button class="search-trigger"><i class="fa fa-search"></i></button>
                        <div class="form-inline">
                            <form class="search-form">
                                <input class="form-control mr-sm-2" type="text" placeholder="Search ..." aria-label="Search">
                                <button class="search-close" type="submit"><i class="fa fa-close"></i></button>
                            </form>
                        </div>

                        <div class="dropdown for-notification">
                          <button class="btn btn-secondary dropdown-toggle" type="button" id="notification" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fa fa-bell"></i>
                            <span class="count bg-danger">5</span>
                          </button>
             
                        </div>

                        <div class="dropdown for-message">
                          <button class="btn btn-secondary dropdown-toggle" type="button"
                                id="message"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="ti-email"></i>
                            <span class="count bg-primary">9</span>
                          </button>
                          
                        </div>
                    </div> -->
                </div>

                <!-- <div class="col-sm-5">
                    <div class="user-area dropdown float-right">
                        
                        <div class="fa fa-user">
                        Thar Nge
                        </div>
                   </div>
                </div> -->
            </div>

        </header><!-- /header -->
        <!-- Header-->

        <div class="breadcrumbs">
            <div class="col-sm-4">
                <div class="page-header float-left">
                    <div class="page-title">
                        <h1>Home</h1>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
                <div class="page-header float-right">
                    <div class="page-title">
                        <ol class="breadcrumb text-right">
                            <li class="active"></li>
                        </ol>
                    </div>
                </div>
            </div>
        </div>
   
   
  
   <!--   view level -->
        <div class="content mt-3">
	
            <div class="col-sm-12">
                <div class="alert  alert-success alert-dismissible fade show" role="alert" style="background-color: #12e0cd52;">
                  <span class="badge badge-pill badge-success">Success</span> You successfully read this important alert message.
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            </div>

			
	<div class="row" style="float:left;">
           <div class="col-sm-4">
                <div class="card text-white bg-flat-color-1">
                    <div class="card-body pb-0">
                        
                        <h4 class="mb-0">
                            <span class="count">Announcement</span>
                        </h4>
                        <p class="text-light">Totally Announcement Information</p>
                        <a href="<c:url value='/adminPermission/addAnnouncement.htm'/>">
<div class="btn waves-effect" style="color: white;border-color: #0fe8d4;margin-right: 10px;margin-bottom: 10px;">Enter-&gt;</div>
</a>
                    </div>

                </div>
            </div>
             <div class="col-sm-4">
                <div class="card text-white bg-flat-color-1">
                    <div class="card-body pb-0">
                        
                        <h4 class="mb-0">
                            <span class="count">Notice board</span>
                        </h4>
                 
                        <p class="text-light">Totally Notic board Information    </p>
					<a href="<c:url value='/adminPermission/addNoticBoard.htm'/>">
                       <div class="btn waves-effect" style="color: white;border-color: #0fe8d4;margin-right: 10px;margin-bottom: 10px;">Enter-&gt;</div>
					</a>
                    </div>

                </div>
            </div>
             <div class="col-sm-4">
                <div class="card text-white bg-flat-color-1">
                    <div class="card-body pb-0">
                        
                        <h4 class="mb-0">
                            <span class="count">Time Table</span>
                        </h4>
                        <p class="text-light">Totally Time Table Information    </p>
					<a href="<c:url value='/adminPermission/insertTimeTable.htm'/>">
                        <div class="btn waves-effect" style="color: white;border-color: #0fe8d4;margin-right: 10px;margin-bottom: 10px;">Enter-&gt;</div>
					</a>
                    </div>

                </div>
            </div>
            <div class="col-sm-4">
                <div class="card text-white bg-flat-color-1">
                    <div class="card-body pb-0">
                        
                        <h4 class="mb-0">
                            <span class="count">Activities</span>
                        </h4>
                        <p class="text-light">Totally Activities Information    </p>
						<a href="<c:url value='/adminPermission/addActivities.htm'/>">
                        <div class="btn waves-effect" style="color: white;border-color: #0fe8d4;margin-right: 10px;margin-bottom: 10px;">Enter-&gt;</div>
</a>
                    </div>

                </div>
            </div>
            <div class="col-sm-4">
                <div class="card text-white bg-flat-color-1">
                    <div class="card-body pb-0">
                        
                        <h4 class="mb-0">
                            <span class="count">Activities Detail</span>
                        </h4>
                        <p class="text-light">Add Activities Detail   </p>
						<a href="<c:url value='/adminPermission/addActivitiesDetail.htm'/>">
                        <div class="btn waves-effect" style="color: white;border-color: #0fe8d4;margin-right: 10px;margin-bottom: 10px;">Enter-&gt;</div>
</a>
                    </div>

                </div>
            </div>
            <div class="col-sm-4">
                <div class="card text-white bg-flat-color-1">
                    <div class="card-body pb-0">
                        
                        <h4 class="mb-0">
                            <span class="count">Latest Post</span>
                        </h4>
                        <p class="text-light">Totally  Latest Post Information    </p>
						<a href="<c:url value='/adminPermission/addActivities.htm'/>">
                        <div class="btn waves-effect" style="color: white;border-color: #0fe8d4;margin-right: 10px;margin-bottom: 10px;">Enter-&gt;</div>
						</a>
                    </div>

                </div>
            </div>
            <div class="col-sm-4">
                <div class="card text-white bg-flat-color-1">
                    <div class="card-body pb-0">
                        
                        <h4 class="mb-0">
                            <span class="count">News</span>
                        </h4>
                        <p class="text-light">Totally News  Information    </p>

                        <a href="<c:url value='/adminPermission/addNews.htm'/>">
                        <div class="btn waves-effect" style="color: white;border-color: #0fe8d4;margin-right: 10px;margin-bottom: 10px;">
                        Enter-&gt;
                        </div>
                        </a>

                    </div>

                </div>
            </div>
            <div class="col-sm-4">
                <div class="card text-white bg-flat-color-1">
                    <div class="card-body pb-0">
                        
                        <h4 class="mb-0">
                            <span class="count">Events</span>
                        </h4>
                        <p class="text-light">Totally  Events Information    </p>

		<a href="<c:url value='/adminPermission/addPreviousEvents.htm'/>">
		<div class="btn waves-effect" style="color: white;border-color: #0fe8d4;margin-right: 10px;margin-bottom: 10px;">
                        
                        Enter-&gt;</div></a>
                    </div>

                </div>
            </div>
            
            
            <div class="col-sm-4">
                <div class="card text-white bg-flat-color-1">
                    <div class="card-body pb-0">
                        
                        <h4 class="mb-0">
                            <span class="count">Academic Course</span>
                        </h4>
                        <p class="text-light">Totally  Academic Course Information    </p>

		<a href="<c:url value='/adminPermission/addAcademicCourse.htm'/>">
		<div class="btn waves-effect" style="color: white;border-color: #0fe8d4;margin-right: 10px;margin-bottom: 10px;">
                        
                        Enter-&gt;</div></a>
                    </div>

                </div>
            </div>
            
            <div class="col-sm-4">
                <div class="card text-white bg-flat-color-1">
                    <div class="card-body pb-0">
                        
                        <h4 class="mb-0">
                            <span class="count">Department</span>
                        </h4>
                        <p class="text-light">Manage Department</p>

		<a href="<c:url value='/adminPermission/addStaffForDepartment.htm'/>">
		<div class="btn waves-effect" style="color: white;border-color: #0fe8d4;margin-right: 10px;margin-bottom: 10px;">
                        
                        Enter-&gt;</div></a>
                    </div>

                </div>
            </div>
            
            
           
        </div>



        </div> 
       <!-- .content -->
    </div><!-- /#right-panel -->

    <!-- Right Panel -->
 
<%-- </sec:authorize> --%>
</body>
</html>