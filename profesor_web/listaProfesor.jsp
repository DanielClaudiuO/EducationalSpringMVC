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

  <!-- /.navbar -->
 <jsp:include page="/jsp/common/navbar.jsp"/>
  <!-- Main Sidebar Container -->
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
                <h5 class="m-0">Profesor</h5>
                <div class="col-sm-12 col-md-6">
                <div class="dataTables_filter">
                <label>Search:<input type="search" class="form-control form-control-sm" placeholder="" aria-controls="example1"></label>
                </div></div>
              </div>
              <div class="card-body">
                <table class="table table-bordered table-hover table-head-fixed text-nowrap table-striped" border=1>
	<tr>
		<td>ID</td>
		<td>Nume</td>
		<td>Varsta</td>
		<td>Curs</td>
		<td>Email</td>
		<td>Vechime</td>
		<td></td>
		<td></td>
		<td></td>

	</tr>
	<c:forEach var="pr" items="${profesori}">
		<tr>
			<td><c:out value="${pr.id}"></c:out>
			<td><c:out value="${pr.nume}"></c:out>
			<td><c:out value="${pr.varsta}"></c:out>
			<td><c:out value="${pr.curs}"></c:out>
			<td><c:out value="${pr.email}"></c:out>
			<td><c:out value="${pr.vechime}"></c:out>
			<td><a href="<c:url value="/detalii-profesor.htm?id=${pr.id}"/>" class="btn btn-info"><i class="fas fa-info-circle"></i></a></td>
			<td><a href="<c:url value="/editare-profesor.htm?id=${pr.id}"/>" class="btn btn-warning"><i class="fas fa-edit"></i></a></td>
			<td><a href="<c:url value="/delete-profesor.htm?id=${pr.id}"/>" class="btn btn-danger"><i class="fas fa-minus-circle"></i></a></td>
		</tr>
	</c:forEach>
	</table>
	<br><br/>
	<a href="<c:url value="/create-profesor.htm"/>" class="btn btn-primary">Adugare Profesor</a>

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
</body>
</html>