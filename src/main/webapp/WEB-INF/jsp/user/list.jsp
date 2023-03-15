<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
      <!-- BootsTrap -->
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous" />
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
      <!-- Font Awesome -->
      <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet" />
      <!-- Google Fonts -->
      <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet" />
      <!-- MDB -->
      <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.css" rel="stylesheet" />
      <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js"></script>

      <meta charset="UTF-8">
      <title>Sales Product</title>
    </head>

    <body>
      <c:import url="/WEB-INF/jsp/menu/menu.jsp" />

      <section class="home-section vh-100">
        <div class="home-content">
          <i class='bx bx-menu'></i>
          <div class="container h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
              <h2>Usuários</h2>
              <div class="pt-1 mb-4">
                <a class="btn btn-primary text-white" href="user/register" role="button">
                  Novo
                </a>
              </div>
              <c:if test="${empty users}">
                <h5>Não existem usuários cadastrados!!!</h5>
              </c:if>

              <c:if test="${not empty users}">
                <table class="table align-middle mb-0 bg-white">
                  <thead class="bg-light">
                    <tr>
                      <th>Name</th>
                      <th>Apelido</th>
                      <th>CPF</th>
                      <th>Status</th>
                      <th>Ação</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="user" items="${users}">
                      <tr>
                        <td>
                          <div class="d-flex align-items-center">
                            <img src="https://mdbootstrap.com/img/new/avatars/${user.id}.jpg" alt=""
                              style="width: 45px; height: 45px" class="rounded-circle" />
                            <div class="ms-3">
                              <p class="fw-bold mb-1">${user.getFullName()}</p>
                              <p class="text-muted mb-0">${user.email}</p>
                            </div>
                          </div>
                        </td>
                        <td>
                          <p class="fw-normal mb-1">${user.nickName}</p>
                        </td>
                        <td>
                          ${user.cpf}
                        </td>
                        <td>
                          <span class="badge badge-success rounded-pill d-inline">${user.status}</span>
                        </td>
                        <td>
                          <div class="d-flex align-items-center">
                            <a style="color: #3b5998;" href="#!" role="button" class="me-3">
                              <i class="fas fa-pencil-alt"></i>
                            </a>
                            <a style="color: #dd4b39;" href="#!" role="button">
                              <i class="far fa-trash-alt"></i>
                            </a>
                          </div>
                        </td>
                      </tr>
                    </c:forEach>
                  </tbody>
                </table>
              </c:if>
            </div>
          </div>
        </div>
      </section>


      <c:import url="/WEB-INF/jsp/menu/menuAction.jsp" />
    </body>

    </html>