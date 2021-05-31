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
                <h3 class="card-title">Add Prezenta</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="${pageContext.request.contextPath}/add-prezenta.htm" method="POST" modelAttribute="prezenta">
                <div class="card-body">
                   
                    
                    <div class="form-group">
                  <label for="exampleInputFile">Date:</label>
                    <div class="input-group date" id="reservationdate" data-target-input="nearest">
                        <form:input path="data" type="text" class="form-control datetimepicker-input" data-target="#reservationdate"/>
                        <div class="input-group-append" data-target="#reservationdate" data-toggle="datetimepicker">
                            <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                        </div>
                    </div>
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
 </div>
  
  </body>
</html>