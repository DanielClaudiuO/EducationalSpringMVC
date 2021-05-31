<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Course</title>
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
                <h3 class="card-title">Add Course</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="${pageContext.request.contextPath}/add-curs.htm" method="POST" modelAttribute="curs">
                <div class="card-body">
                  <div class="form-group">
                    <label for="exampleInputFile">Denumire</label>
                    <form:input path="denumire" class="form-control"/>
                </div>
                  
                    <div class="form-group">
                    <label for="exampleInputFile">Credite</label>
                    <form:input path="credite" class="form-control"/>
                </div>
                  <div class="form-group">
                    <label for="exampleInputFile">Sala</label>
                    <form:select path="sala" id="sala" class="form-control">
                    <form:option  label="A" value="A"/>
                    <form:option  label="B" value="B"/>
                    <form:option  label="C" value="C"/>
                    <form:option  label="D" value="D"/>
                    </form:select>
                </div>
                <div class="form-group">
                    <label for="exampleInputFile">Profesor</label>
                    <form:select path="profesor" id="profesori" class="form-control">
                    <form:options  items="${profesori}" itemValue="id" itemLabel="nume"/>
                    </form:select>
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
</div>

  
  
  <jsp:include page="/jsp/common/footer_imports.jsp"/>
</body>
</html>