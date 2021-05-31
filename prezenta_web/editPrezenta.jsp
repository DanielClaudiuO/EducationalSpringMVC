<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/jsp/common/head_imports.jsp"/>
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      
    </ul>  
  </nav>
  </div>
  <!-- /.navbar -->
 <jsp:include page="/jsp/common/navbar.jsp"/>
  <jsp:include page="/jsp/common/sidebar.jsp"/>
<div class="content-wrapper">
   <br></br>
    <!-- Main content -->
    <div class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-lg-6">
            <div class="card card-primary card-outline">
              <div class="card-header">
                <h3 class="card-title">Editare Prezenta</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="${pageContext.request.contextPath}/salvare-prezenta.htm" method="POST" modelAttribute="prezenta">
                <div class="card-body">
                <div class="form-group">
	<label for="id">Id</label><br/>
	<form:input path="id" readonly="true" class="form-control"/>
</div>
                  <div class="form-group">
                    <label for="exampleInputFile">Data</label>
                    <form:input path="data" class="form-control"/>
                </div>
                  
                    <div class="form-group">
                    <label for="exampleInputFile">Curs</label>
                    <form:input path="curs" class="form-control"/>
                </div>
                  <div class="form-group">
                    <label for="exampleInputFile">Profesor</label>
                    <form:input path="profesor" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="exampleInputFile">Prezenta</label>
                    <form:input path="prezenta" class="form-control"/>
                </div>
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                  <button type="submit" class="btn btn-primary">Submit</button>
                </div>
             </form:form>
            </div>
        </div>
      </div>
    </div>
  </div>
  </div>
<jsp:include page="/jsp/common/footer.jsp"/>


  
  
  <jsp:include page="/jsp/common/footer_imports.jsp"/>
</html>