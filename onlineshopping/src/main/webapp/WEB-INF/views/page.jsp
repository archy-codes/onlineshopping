<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Shop Homepage - Start Bootstrap Template</title>

  <!-- Bootstrap core CSS -->
  <link href="${css}/bootstrap.min.css" rel="stylesheet">
  <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
   <link href="${css}/all.min.css"  rel="stylesheet" />

  <!-- Custom styles for this template -->
  <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
  <div class="wrapper">
  <!-- Navigation -->
  <%@include file="./shared/navbar.jsp" %>
		<div class="container">
			<!-- Page Content -->
				<div class="row mt-5">
					<%@include file="home.jsp"%>
				</div>
		</div>
		<!-- /.container -->

  <!-- Footer -->
  <%@include file="./shared/footer.jsp" %>
  <!-- Bootstrap core JavaScript -->
  <script src="${js}/jquery.min.js"></script>
  <script src="${js}/bootstrap.min.js"></script>
  <script src="${js}/all.min.js"></script>
  <script src="${js}/myapp.js"></script>
  </div>
</body>
</html>
