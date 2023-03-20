<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Edição de Exame</title>


      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous" />
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>

      <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet" />

      <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet" />

      <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.css" rel="stylesheet" />
      <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js"></script>

      <style>
        .cascading-right {
          margin-right: -50px;
        }

        @media (max-width: 991.98px) {
          .cascading-right {
            margin-right: 0;
          }
        }
      </style>
    </head>

    <body>
      <c:import url="/WEB-INF/jsp/menu/menu.jsp" />

      <section class="home-section vh-100">
        <i class='bx bx-menu'></i>
        <div class="home-content">
          <div class="container h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
              <section class="text-center">
                <div class="container py-4">
                  <div class="row d-flex justify-content-center">
                    <div class="col-md-12 col-lg-8 mb-5 mb-lg-0">
                      <div class="card cascading-right" style="
            background: hsla(0, 0%, 100%, 0.55);
            backdrop-filter: blur(30px);
            ">
                        <div class="card-body p-5 shadow-5 text-center">
                          <h2 class="fw-bold mb-5">Cadastro de Exame</h2>
                          <form action="/exam/edit/${exam.id}" method="POST">

                            <div class="row">
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="name" name="name" class="form-control" value="${exam.name}" />
                                  <label class="form-label" for="name">Nome</label>
                                </div>
                              </div>
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="description" name="description" class="form-control"
                                    value="${exam.description}" />
                                  <label class="form-label" for="description">Descrição</label>
                                </div>
                              </div>
                            </div>

                            <div class="row">
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="date" id="availableDate" name="availableDate" class="form-control"
                                    value="${exam.availableDate}" />
                                  <label class="form-label" for="availableDate">Data Disponivel</label>
                                </div>
                              </div>
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <select class="form-select" name="idVet" id="idVet">
                                    <option selected>Selecione um Veterinário</option>
                                    <c:forEach var="vet" items="${veterinaries}">
                                      <option value="${vet.id}" selected="${exam.idVet == vet.id }">${vet.name}
                                      </option>
                                    </c:forEach>
                                  </select>
                                  <label class="form-label" for="level">Veterinário</label>
                                </div>
                              </div>
                            </div>

                            <div class="row">
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="price" name="price" class="form-control"
                                    value="${exam.price}" />
                                  <label class="form-label" for="price">Preço</label>
                                </div>
                              </div>
                            </div>

                            <div class="row">
                              <button type="submit" class="btn btn-primary btn-block mb-4">
                                Cadastrar
                              </button>
                            </div>

                            <div class="row">
                              <a class="small text-muted" href="/exam">Cancelar e voltar</a>
                            </div>
                          </form>
                        </div>
                      </div>
                    </div>

                  </div>
                </div>

              </section>
            </div>
          </div>
        </div>
      </section>

      <c:import url="/WEB-INF/jsp/menu/menuAction.jsp" />
    </body>

    </html>