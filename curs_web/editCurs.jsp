<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Course</title>
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
                <h3 class="card-title">Edit Course</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="${pageContext.request.contextPath}/salvare-curs.htm" method="POST" modelAttribute="curs">
                <div class="card-body">
                <div class="form-group">
	<label for="id">Id</label><br/>
	<form:input path="id" readonly="true" class="form-control"/>
</div>
                  <div class="form-group">
                    <label for="denumire">Denumire</label>
                    <form:input path="denumire" class="form-control"/>
                </div>
                  
                    <div class="form-group">
                    <label for="credite">Credite</label>
                    <form:input path="credite" class="form-control"/>
                </div>
                  <div class="form-group">
                    <label for="sala">Sala</label>
                    <form:input path="sala" class="form-control"/>
                    <select class="form-control select2" style="width: 100%;">
                    <option selected="selected">A</option>
                    <option>B</option>
                    <option>C</option>
                    <option>D</option>
                    <option>E</option>
                  </select>
                </div>
                <div class="form-group">
                    <label for="profesor">Profesor</label>
                   <form:select path="profesor" id = "profesor" class="form-control">
	<form:options items="${profesor}" itemValue="id" itemLabel="nume"/>
	</form:select>
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
</div>

  
  
  <jsp:include page="/jsp/common/footer_imports.jsp"/>
</body>
</html>