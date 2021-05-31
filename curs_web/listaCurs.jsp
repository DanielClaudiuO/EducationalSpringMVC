<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Client Listing</title>

<jsp:include page="/jsp/common/head_imports.jsp"/>
</head>
<body class="hold-transition sidebar-mini dark-mode">
<div class="wrapper">
 
  <!-- /.navbar -->
 <jsp:include page="/jsp/common/navbar.jsp"/>
  <jsp:include page="/jsp/common/sidebar.jsp"/>

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
                <h5 class="m-0">Cursuri</h5>
                <div class="col-sm-12 col-md-6">
                <div class="dataTables_filter">
                <label>Search:<input type="search" class="form-control form-control-sm" placeholder="ex. Daniel" aria-controls="cursuri"></label>
                </div></div>
              </div>
              <div class="card-body">
                <table class="table table-bordered table-hover table-head-fixed text-nowrap table-striped" border=1>
               
	<tr>
		<th>ID</th>
		<th>Denumire</th>
		<th>Credite</th>
		<th>Sala</th>
		<th>Profesor</th>
		<th></th>
		<th></th>
		<th></th>
	</tr>
	
	<c:forEach var="crs" items="${cursuri}">
		<tr>
			<td><c:out value="${crs.id}"></c:out>
			<td><c:out value="${crs.denumire}"></c:out>
			<td><c:out value="${crs.credite}"></c:out>
			<td><c:out value="${crs.sala}"></c:out>
			<td><c:out value="${profesori[crs.profesor]}"></c:out>
			<td><a href="<c:url value="/detalii-curs.htm?id=${crs.id}"/>" class="btn btn-info"><i class="fas fa-info-circle"></i></a></td>
			<td><a href="<c:url value="/edit-curs.htm?id=${crs.id}"/>" class="btn btn-warning"><i class="fas fa-edit"></i></a></td>
			<td><a href="<c:url value="/delete-curs.htm?id=${crs.id}"/>" class="btn btn-danger"><i class="fas fa-minus-circle"></i></a></td>
		</tr>
	</c:forEach>
	</table>
	<br><br/>
	<a href="<c:url value="/create-curs.htm"/>" class="btn btn-primary">Adugare Curs</a>
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