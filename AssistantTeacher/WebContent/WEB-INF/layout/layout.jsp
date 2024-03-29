<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ include file="/WEB-INF/views/common/include.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>TeachingAssistantSystem</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>

<body>
	<tiles:insertAttribute name="header" />
	<input type="hidden" id="pageContext" value="<c:url value='/'/>" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
		
	


</body>
<!--end-Footer-part-->

<link href="<c:url value='/resources/assets/css/linearicons.css'/>" rel="stylesheet" >
			<link href="<c:url value='/resources/assets/css/font-awesome.min.css'/>" rel="stylesheet" >
			<link href="<c:url value='/resources/assets/css/bootstrap.css'/>" rel="stylesheet" >
			<link href="<c:url value='/resources/assets/css/magnific-popup.css'/>" rel="stylesheet" >
			<link href="<c:url value='/resources/assets/css/nice-select.css'/>" rel="stylesheet" >
			<link href="<c:url value='/resources/assets/css/animate.min.css'/>" rel="stylesheet" >		
			<link href="<c:url value='/resources/assets/css/owl.carousel.css'/>" rel="stylesheet" >				
			<link href="<c:url value='/resources/assets/css/jquery-ui.css' />" rel="stylesheet" >
			<link href="<c:url value='/resources/assets/css/main.css' />" rel="stylesheet" >
			<link href="<c:url value='/resources/assets/css/w3.css'/>" rel="stylesheet" >
			<script src="<c:url value='/resources/assets/js/vendor/jquery-2.2.4.min.js' />"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
			<script src="<c:url value='/resources/assets/js/vendor/bootstrap.min.js' />"></script>
				
			<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>
  			
  			<script src="<c:url value='/resources/assets/js/jquery.easing.min.js' />"></script>			
			
			<script src="<c:url value='/resources/assets/js/hoverIntent.js' />"></script>
			
			<script src="<c:url value='/resources/assets/js/superfish.min.js' />"></script>
				
			<script src="<c:url value='/resources/assets/js/jquery.ajaxchimp.min.js' />"></script>
		
			<script src="<c:url value='/resources/assets/js/jquery.magnific-popup.min.js' />"></script>	
    			
    		<script src="<c:url value='/resources/assets/js/jquery.tabs.min.js' />"></script>					
	
			<script src="<c:url value='/resources/assets/js/jquery.nice-select.min.js' />"></script>
			
			<script src="<c:url value='/resources/assets/js/owl.carousel.min.js' />"></script>								
			
			<script src="<c:url value='/resources/assets/js/mail-script.js' />"></script>	
			
			<script src="<c:url value='/resources/assets/js/main.js' />"></script>
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
