<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profesor</title>
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
                <h3 class="card-title">Edit Profesor</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="${pageContext.request.contextPath}/salvare-profesor.htm" method="POST" modelAttribute="profesor">
                <div class="card-body">
                <div class="form-group">
	<label for="id">Id</label><br/>
	<form:input path="id" readonly="true" class="form-control"/>
</div>
                  <div class="form-group">
                    <label for="nume">Nume</label>
                    <form:input path="nume" class="form-control"/>
                </div>
                  
                    <div class="form-group">
                    <label for="varsta">Varsta</label>
                    <form:input path="varsta" class="form-control"/>
                </div>
                  <div class="form-group">
                    <label for="curs">Curs</label>
                    <form:input path="curs" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <form:input path="email" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="vechime">Vechime</label>
                    <form:input path="vechime" class="form-control"/>
                </div>
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                  <input type="submit" class="btn btn-primary" value="Submit" />
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
</body>
</html>