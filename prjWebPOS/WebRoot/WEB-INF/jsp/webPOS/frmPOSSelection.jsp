<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="True" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
  
   	<link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon" sizes="16x16"/>
	<script type="text/javascript" src="<spring:url value="/resources/js/jQuery.js"/>"></script>
	<script type="text/javascript" src="<spring:url value="/resources/js/jquery-ui.min.js"/>"></script>
	<script type="text/javascript" src="<spring:url value="/resources/js/jquery.numeric.js"/>"></script>
	<link rel="stylesheet" type="text/css" media="screen" href="<spring:url value="/resources/css/design.css"/>"/>

  
  
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Web Stocks</title>
     <script type="text/javascript">
//     $(document).ready(function(){
//     	var s=getContextPath()+"/resources/images/";
    	
    	
//     	$("#Desktop").attr('src', s+'Desktop.png');
//     	$("#Desktop").attr('title','Desktop');
// 	});
    
    </script> 
   
  </head>
  
	<body>
	
	<br>
<!-- 	<div class="mainMenuIcon" > -->
<!-- 	<div style="padding-left: 30%; padding-right: 10%"> -->
<!-- 	<a href="frmUserDesktop.html"><img id="Desktop" src="" ></a> -->
<!-- 	</div> -->
<!-- 	<div style="text-align: center;font-size:0.7em;font-weight:bold;"> -->
<!-- 	Desktop -->
<!-- 	</div> -->
<!-- 	</div> -->

		<c:forEach items="${posList}" var="draw1" varStatus="status1">
			<div class="mainMenuIcon" >
				<a style="text-decoration: none;" href="frmGetPOSSelection.html?strPosCode=${draw1.strPosCode}"> 
					<div class="imgOverText">
						<p style="color: white;">${draw1.strPosName}</p>
					</div>
				</a>
<%-- 				<div style=" text-align: center;font-size:0.7em;font-weight:bold;">${draw1.strFormDesc}</div> --%>
			</div>
		</c:forEach>
	</body>
</html>