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
      <title>Agendamentos</title>
    </head>

    <body>
      <c:import url="/WEB-INF/jsp/menu/menu.jsp" />

      <section class="home-section vh-100">
        <i class='bx bx-menu'></i>
        <div class="home-content">
          <div class="container h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
              <h2>Lista de Agendamentos</h2>
              <div class="pt-1 mb-4">
                <a class="btn btn-primary text-white" href="schedule/register" role="button">
                  Novo
                </a>
              </div>
              <c:if test="${empty schedules}">
                <h5>Não existem Agedamentos cadastrados!!!</h5>
              </c:if>

              <c:if test="${not empty schedules}">
                <table class="table align-middle mb-0 bg-white">
                  <thead class="bg-light">
                    <tr>
                      <th>Serviço</th>
                      <th>Descrição</th>
                      <th>Pet</th>
                      <th>Veterinário</th>
                      <c:if test="${sessionUser.type == 'ADMINISTRATOR'}">
                        <th>Guardião</th>
                      </c:if>
                      <th>Preço</th>
                      <th>Data</th>
                      <th>Emergência</th>
                      <th>Ação</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="sched" items="${schedules}">
                      <tr>
                        <td>
                          <div class="d-flex align-items-center">
                            <p class="fw-bold mb-1">${sched.service.name}</p>
                          </div>
                        </td>
                        <td>
                          <p class="fw-normal mb-1">${sched.service.description}</p>
                        </td>
                        <td>
                          <p class="fw-normal mb-1">${sched.pet.name}</p>
                        </td>
                        <td>
                          <p class="fw-normal mb-1">${sched.vet.name}</p>
                        </td>
                        <c:if test="${sessionUser.type == 'ADMINISTRATOR'}">
                          <td>
                            <p class="fw-normal mb-1">${sched.user.name}</p>
                          </td>
                        </c:if>
                        <td>
                          <p class="fw-normal mb-1">${sched.service.price}</p>
                        </td>
                        <td>
                          <p class="fw-normal mb-1">${sched.date}</p>
                        </td>
                        <td>
                          <p class="fw-normal mb-1">${sched.isEmergency}</p>
                        </td>
                        <td>
                          <div class="d-flex align-items-center">
                            <a style="color: #3b5998;" href="/schedule/${sched.id}/edit" role="button" class="me-3">
                              <i class="fas fa-pencil-alt"></i>
                            </a>
                            <a style="color: #dd4b39;" href="/schedule/${sched.id}/remove" role="button">
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