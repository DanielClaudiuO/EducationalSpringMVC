<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/jsp/common/head_imports.jsp"/>
<style>

div {
  padding-top: 5px;
}
</style>
</head>
<body>
<h1>Detalii Prezenta</h1>


</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
 <jsp:include page="/jsp/common/navbar.jsp"/>
	<jsp:include page="/jsp/common/sidebar.jsp"/>
<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
     <!-- Main content -->
    <div class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-lg-12">
            <div class="card card-primary card-outline">
              <div class="card-header">
                <h5 class="m-0">Detalii Prezenta</h5>
              </div>
              <div class="card-body">
  
Id: <c:out value="${prezenta.id}"/><br/>
Data: <c:out value="${prezenta.data}"/><br/>
Curs: <c:out value="${prezenta.curs}"/><br/>
Profesor: <c:out value="${prezenta.profesor}"/><br/>
Prezenta: <c:out value="${prezenta.prezenta}"/><br/>
<br/><br/>




   </div>
            </div>
          </div>
          <!-- /.col-md-6 -->
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

	<jsp:include page="/jsp/common/footer.jsp"/>
  
</div>
<!-- ./wrapper -->

<jsp:include page="/jsp/common/footer_imports.jsp"/>

</body>
</html>