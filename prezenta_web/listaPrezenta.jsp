<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prezenta Listing</title>

<jsp:include page="/jsp/common/head_imports.jsp"/>
</head>

<body class="hold-transition sidebar-mini dark-mode">
<div class="wrapper">
 
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
   <jsp:include page="/jsp/common/sidebar.jsp"/>
 <jsp:include page="/jsp/common/navbar.jsp"/>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
   <br></br>
    <!-- Main content -->
    <div class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-lg-12">
            <div class="card card-primary card-outline">
              <div class="card-header">
                <h5 class="m-0">Prezente</h5>
              </div>
              <div class="card-body">
                <table class="table table-bordered table-hover" border=1>
	<tr>
		<td>ID</td>
		<td>Data</td>
		<td>Curs</td>
		<td>Profesor</td>
		<td>Prezenta</td>
		<td></td>
		<td></td>
		<td></td>

	</tr>
	<c:forEach var="prz" items="${prezente}">
		<tr>
			<td><c:out value="${prz.id}"></c:out>
			<td><c:out value="${prz.data}"></c:out>
			<td><c:out value="${prz.curs}"></c:out>
			<td><c:out value="${prz.profesor}"></c:out>
			<td><c:out value="${prz.prezenta}"></c:out>
			<td><a href="<c:url value="/detalii-prezenta.htm?id=${prz.id}"/>" class="btn btn-info"><i class="fas fa-info-circle"></i></a></td>
			<td><a href="<c:url value="/edit-prezenta.htm?id=${prz.id}"/>" class="btn btn-warning"><i class="fas fa-edit"></i></a></td>
			<td><a href="<c:url value="/delete-prezenta.htm?id=${prz.id}"/>" class="btn btn-danger"><i class="fas fa-minus-circle"></i></a></td>
		</tr>
	</c:forEach>
	</table>
	<br><br/>
	<a href="<c:url value="/create-prezenta.htm"/>" class="btn btn-primary dark-mode">Adugare Prezenta</a>
	</div>
          </div>
        </div>
      </div>
    </div>
  </div>
  </div>
 

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
    <div class="p-3">
      <h5>Title</h5>
      <p>Sidebar content</p>
    </div>
  </aside>
  <!-- /.control-sidebar -->

  <!-- Main Footer -->
  <jsp:include page="/jsp/common/footer.jsp"/>
  
  
  <jsp:include page="/jsp/common/footer_imports.jsp"/>
   </div>
  </body>
</html>