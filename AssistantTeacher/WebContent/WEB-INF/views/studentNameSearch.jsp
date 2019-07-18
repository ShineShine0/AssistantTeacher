<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Activities Form</h2>
<center>
<div id="content">
<div id="content-header">

 <div id="breadcrumb" style="color:gray"> 
 </div>

</div>


<div class="container"> 

 
<form:form method="post" action="${pageContext.request.contextPath}/search.htm" commandName="searchstu">

<tr><td>Search Name:</td><td> <form:input path="name" type="text"/></td>
<td><input type="submit" value="Search" /></td></tr>
            
        </form:form>
        
        </div><br><br>
       <c:if test="${list.size() != 0}"> 
      <table boder=1>
	<thead>
		<tr>
		<th>No</th>
		<th>Name</th>
		<th>RollNo</th>
		<th>Email</th>
		<th>Password</th>
		<th>PhoneNo</th>
		<th>Gender</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="emp" items="${list}" varStatus="index">
		<tr>
		<td>${index.count }</td>
		<td>${emp.name }</td>
		<td>${emp.rollNo }</td>
		<td>${emp.email }</td>
		<td>${emp.password}</td>
		<td>${emp.phno}</td>
		<td>${emp.gender}</td>
		<td><a href="<c:url value='/deleteStudent/${emp.id}'/>">DELETE</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>  
      </c:if>  
    </div>

</body>
</html>