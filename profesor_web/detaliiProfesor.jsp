<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="/jsp/common/head_imports.jsp"/>
<style>
div {
  padding-top: 5px;
}
</style>
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
                <h5 class="m-0">Detalii Profesor</h5>
              </div>
              <div class="card-body">
  
Id: <c:out value="${profesor.id}"/><br/>
Nume: <c:out value="${profesor.nume}"/><br/>
Curs: <c:out value="${profesor.curs}"/><br/>
Email: <c:out value="${profesor.email}"/><br/>
Vechime: <c:out value="${profesor.vechime}"/><br/>
<br/><br/>
<a href="<c:url value="/list-profesor.htm"/>">Inapoi la lista</a>



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