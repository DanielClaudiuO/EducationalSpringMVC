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
  </div>
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
                <h5 class="m-0">Studenti</h5>
              </div>
              <div class="card-body">
                <table class="table table-bordered table-hover table-head-fixed text-nowrap table-striped" border=1>
	<tr>
		<td>ID</td>
		<td>Nume</td>
		<td>Varsta</td>
		<td>Medie</td>
		<td>Facultate</td>
		<td>Promotie</td>
		<td></td>
		<td></td>
		<td></td>

	</tr>
	<c:forEach var="st" items="${studenti}">
		<tr>
			<td><c:out value="${st.id}"></c:out>
			<td><c:out value="${st.nume}"></c:out>
			<td><c:out value="${st.varsta}"></c:out>
			<td><c:out value="${st.medie}"></c:out>
			<td><c:out value="${st.facultate}"></c:out>
			<td><c:out value="${st.promotie}"></c:out>
			<td><a href="<c:url value="/detalii-student.htm?id=${st.id}"/>" class="btn btn-info"><i class="fas fa-info-circle"></i></a></td>
			<td><a href="<c:url value="/editare-student.htm?id=${st.id}"/>" class="btn btn-warning"><i class="fas fa-edit"></i></a></td>
			<td><a href="<c:url value="/delete-student.htm?id=${st.id}"/>" class="btn btn-danger"><i class="fas fa-minus-circle"></i></a></td>
		</tr>
	</c:forEach>
	</table>
	<br><br/>
	<a href="<c:url value="/create-student.htm"/>" class="btn btn-primary">Adugare Student</a>

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