<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<div id="content">
<div id="content-header">

 <div id="breadcrumb" style="color:gray"> 
 <a href="welcome.htm" title="Go to Home" class="tip-bottom" style="color:white" style="fontsize:large"><b><i class="icon-home"></i> Home</b></a> 
 <a href="firstyear.htm" class="tip-bottom" style="color:white" style="fontsize:large"><b>FIRST YEAR</b></a> 
 <a href="#" class="tip-bottom" style="color:white" style="fontsize:large"><b>LEARNING</b></a> 

</div>
</div>
 
 <div class="container">
 
<div class="container-fluid">
  <hr>
  <div class="row-fluid">
  <div class="span3"></div>
    <div class="span6">
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>Personal-info</h5>
        </div>
        <div class="widget-content nopadding">
          <form:form action="${pageContext.request.contextPath}/createyear.htm" method="post" class="form-horizontal" commandName="year">
            <div class="control-group">
              <label class="control-label">Class :</label>
              <div class="controls">
                <form:input type="text" class="span11" path="name"/>
              </div>
            </div>
           
          
            <div class="form-actions">
             <div class="controls">
              <button type="submit" class="btn btn-info">Save</button>
              </div>
            </div>
          </form:form>
        </div>
      </div>
      
      
    </div>
    
  </div>
  
</div>

</div>
</div>

</body>
</html>