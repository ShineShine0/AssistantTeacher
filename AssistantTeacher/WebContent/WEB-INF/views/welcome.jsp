<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style>

  
</style>
<title>Student View Page</title>

<link rel="stylesheet" type="text/css" href="<c:url value='/resources/submenucss/menu.css'/>" />
</head>
<body >
<div id="content">
<div id="content-header">

 <div id="breadcrumb" style="color:gray"> 
 <a href="welcome.htm" title="Go to Home" class="tip-bottom" style="color:white" style="fontsize:large"><b><i class="icon-home"></i> Home</b></a> 
 <a href="#" class="tip-bottom" style="color:white" style="fontsize:large"><b></b></a> 

</div>
</div>
 
 <div class="container">
 

 
 
 <div class="container-fluid">
 
  <h1 class="text-center mb-3"></h1>

 
 
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <div class="carousel-inner row w-100 mx-auto">
      <div class="carousel-item col-md-4 active">
        <div class="card">
          <img class="card-img-top img-fluid" src="http://placehold.it/350x200/f44242/fff" alt="Card image cap">
          <div class="card-body">
            <h3 class="card-title"><b>LEARNING LESSONS</b></h3>
            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
            <p class="card-text"><a href="/mailSender.htm" class="btn btn-primary">Go readmore</a></p>
          </div>
        </div>
      </div>
      <div class="carousel-item col-md-4">
        <div class="card">
          <img class="card-img-top img-fluid" src="http://placehold.it/350x200/418cf4/fff" alt="Card image cap">
          <div class="card-body">
            <h3 class="card-title"><b>ACTIVITIES EVENTS</b></h3>
            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
            <p class="card-text"><p class="card-text"><a href="/mailSender.htm" class="btn btn-primary">Go readmore</a></p></p>
          </div>
        </div>
      </div>
      <div class="carousel-item col-md-4">
        <div class="card">
          <img class="card-img-top img-fluid" src="http://placehold.it/350x200/3ed846/fff" alt="Card image cap">
          <div class="card-body">
            <h3 class="card-title"><b>ATTENDANCE RECORDS</b></h3>
            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
            <p class="card-text"><a href="/mailSender.htm" class="btn btn-primary">Go readmore</a></p>
          </div>
        </div>
      </div>
      
  
  </div>
</div>
  
 </div>
</div>
</div>
</body>
</html>