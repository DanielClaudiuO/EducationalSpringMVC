 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="#" class="brand-link">
      <span class="brand-text font-weight-light">Proiect Final</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <li class="nav-item">
            <a href="<c:url value="/list-studenti.htm"/>" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
               Lista Studenti
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="<c:url value="/list-profesori.htm"/>" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
               Lista Profesori
                
              </p>
            </a>
          </li>
          <li class="nav-item">
             <a href="<c:url value="/list-cursuri.htm"/>" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
               Lista Cursuri
                
              </p>
            </a>
          </li>
          <li class="nav-item">
             <a href="<c:url value="/list-prezente.htm"/>" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
               Lista Prezente
                
              </p>
            </a>
          </li>
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>
