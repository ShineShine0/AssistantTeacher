<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ include file="/WEB-INF/views/common/include.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>TeachingAssistantSystem</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="<c:url value='/resources/template/css/bootstrap.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/template/css/bootstrap-responsive.min.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/template/css/fullcalendar.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/template/css/matrix-style.css'/>" />
<link rel="stylesheet" href="<c:url value='/resources/template/css/matrix-media.css'/>" />
<link href="<c:url value='resources/template/font-awesome/css/font-awesome.css" rel="stylesheet'/>" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800'
	rel='stylesheet' type='text/css'>
<style>

ul, ol {
    padding: 0;
    margin: 0 0 10px 0px !important;
}
</style>
</head>

<body>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="leftMenu" />
	<input type="hidden" id="pageContext" value="<c:url value='/'/>" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
		
	


</body>
<!--end-Footer-part-->
<script src="<c:url value='/resources/template/js/excanvas.min.js'/>"></script>
<script src="<c:url value='/resources/template/js/jquery.min.js'/>"></script>
<script src="<c:url value='/resources/template/js/jquery.ui.custom.js'/>"></script>
<script src="<c:url value='/resources/template/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/resources/template/js/jquery.flot.min.js'/>"></script>
<script src="<c:url value='/resources/template/js/jquery.flot.resize.min.js'/>"></script>
<script src="<c:url value='/resources/template/js/jquery.peity.min.js'/>"></script>
<script src="<c:url value='/resources/template/js/matrix.js'/>"></script>
<script src="<c:url value='/resources/template/js/fullcalendar.min.js'/>"></script>
<script src="<c:url value='/resources/template/js/matrix.calendar.js'/>"></script>
<script src="<c:url value='/resources/template/js/matrix.chat.js'/>"></script>
<script src="<c:url value='/resources/template/js/jquery.validate.js'/>"></script>
<script src="<c:url value='/resources/template/js/matrix.form_validation.js'/>"></script>
<script src="<c:url value='/resources/template/js/jquery.wizard.js'/>"></script>
<script src="<c:url value='/resources/template/js/jquery.uniform.js'/>"></script>
<script src="<c:url value='/resources/template/js/select2.min.js'/>"></script>
<script src="<c:url value='/resources/template/js/matrix.popover.js'/>"></script>
<script src="<c:url value='/resources/template/js/jquery.dataTables.min.js'/>"></script>
<script src="<c:url value='/resources/template/js/matrix.tables.js'/>"></script>
<script src="<c:url value='/resources/template/js/matrix.interface.js'/>"></script>
<script type="text/javascript">
  // This function is called from the pop-up menus to transfer to
  // a different page. Ignore if the value returned is a null string:
  function goPage (newURL) {

      // if url is empty, skip the menu dividers and reset the menu selection to default
      if (newURL != "") {
      
          // if url is "-", it is this page -- reset the menu:
          if (newURL == "-" ) {
              resetMenu();            
          } 
          // else, send page to designated URL            
          else {  
            document.location.href = newURL;
          }
      }
  }

// resets the menu selection upon entry to this page:
function resetMenu() {
   document.gomenu.selector.selectedIndex = 2;
}
</script>
</html>
