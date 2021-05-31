<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home</title>

<jsp:include page="/jsp/common/head_imports.jsp"/>
</head>
<body class="hold-transition sidebar-mini dark-mode">


  <!-- Navbar -->
  <jsp:include page="/jsp/common/navbar.jsp"/>
  
  <!-- /.navbar -->

  <jsp:include page="/jsp/common/sidebar.jsp"/>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper" style="min-height: 895px;">
  
  <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0">Home Page</h1>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    
    <section class="content">
    <div class="container-fluid">
  <div class="row">
          <div class="col-12 col-sm-6 col-md-3">
            <div class="info-box">
              <span class="info-box-icon bg-info elevation-1"><i class="far fa-address-book"></i></span>

              <div class="info-box-content">
                <span class="info-box-text">Students</span>
                <span class="info-box-number">
                  <c:forEach var="prez" items="${studenti}">
	<c:set var="a"  value="${a+1}"/>
	</c:forEach>
	<c:out value="${a}"></c:out>
                </span>
              </div>
              <!-- /.info-box-content -->
            </div>
            <!-- /.info-box -->
          </div>
          <!-- /.col -->
          <div class="col-12 col-sm-6 col-md-3">
            <div class="info-box mb-3">
              <span class="info-box-icon bg-danger elevation-1"><i class="fas fa-address-card"></i></span>

              <div class="info-box-content">
                <span class="info-box-text">Teachers</span>
                <span class="info-box-number">
<c:forEach var="prez" items="${profesori}">
	<c:set var="b"  value="${b+1}"/>
	</c:forEach>
	<c:out value="${b}"></c:out>
	</span>
              </div>
              <!-- /.info-box-content -->
            </div>
            <!-- /.info-box -->
          </div>
          <!-- /.col -->

          <!-- fix for small devices only -->
          <div class="clearfix hidden-md-up"></div>

          <div class="col-12 col-sm-6 col-md-3">
            <div class="info-box mb-3">
              <span class="info-box-icon bg-success elevation-1"><i class="fas fa-book"></i></span>

              <div class="info-box-content">
                <span class="info-box-text">Classes</span>
                <span class="info-box-number">
               <c:forEach var="prez" items="${cursuri}">
	<c:set var="c"  value="${c+1}"/>
	</c:forEach>
	<c:out value="${c}"></c:out>
                </span>
              </div>
              <!-- /.info-box-content -->
            </div>
            <!-- /.info-box -->
          </div>
          <!-- /.col -->
          <div class="col-12 col-sm-6 col-md-3">
            <div class="info-box mb-3">
              <span class="info-box-icon bg-warning elevation-1"><i class="far fa-calendar-alt"></i></span>

              <div class="info-box-content">
                <span class="info-box-text">Attendance</span>
                <span class="info-box-number">
                <c:forEach var="prez" items="${prezente}">
	<c:set var="d"  value="${d+1}"/>
	</c:forEach>
	<c:out value="${d}"></c:out>
                </span>
              </div>
              <!-- /.info-box-content -->
            </div>
            <!-- /.info-box -->
          </div>
          <!-- /.col -->
        </div>
        </div>
        </section>
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