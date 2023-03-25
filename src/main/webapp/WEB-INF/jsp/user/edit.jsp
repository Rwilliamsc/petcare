<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Cadastro de Usuário</title>

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
                  <div class="row d-flex justify-content-center mt-n5">
                    <div class="col-md-12 col-lg-8 mb-5 mb-lg-0">
                      <div class="card cascading-right" style="
                            background: hsla(0, 0%, 100%, 0.55);
                            backdrop-filter: blur(30px);
                            ">
                        <div class="card-body p-5 shadow-5 text-center">
                          <h2 class="fw-bold mb-5">Cadastro de Usuário</h2>
                          <form action="/user/edit/${user.id}" method="POST">
                            <div class="row">
                            </div>

                            <div class="row">
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="name" name="name" class="form-control" value="${user.name}" />
                                  <label class="form-label" for="name">Nome</label>
                                </div>
                              </div>
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="familyName" name="familyName" class="form-control"
                                    value="${user.familyName}" />
                                  <label class="form-label" for="familyName">Sobrenome</label>
                                </div>
                              </div>
                            </div>

                            <div class="row">
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="nickName" name="nickName" class="form-control"
                                    value="${user.nickName}" />
                                  <label class="form-label" for="nickName">Apelido</label>
                                </div>
                              </div>
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="cpf" name="cpf" class="form-control"
                                    placeholder="999.999.999-99" value="${user.cpf}" />
                                  <label class="form-label" for="cpf">CPF</label>
                                </div>
                              </div>
                            </div>

                            <div class="row">
                              <div class="col-md-6 mb-4">
                                <select class="form-select" name="type" id="type">
                                  <option value="ADMINISTRATOR" selected="${user.type == 'ADMINISTRATOR'}">Admin
                                  </option>
                                  <option value="USER" selected="${user.type == 'USER'}">Usuário</option>
                                </select>
                                <label class="form-label" for="type">Tipo</label>
                              </div>

                              <div class="col-md-6 mb-4">
                                <div class="btn-group" id="check-group">
                                  <c:choose>
                                    <c:when test="${user.status == 'ACTIVE'}">
                                      <input type="radio" class="btn-check" name="status" id="option1" value="ACTIVE"
                                        autocomplete="off" checked />
                                      <label class="btn btn-secondary" for="option1">ATIVO</label>

                                      <input type="radio" class="btn-check" name="status" id="option2" value="INACTIVE"
                                        autocomplete="off" />
                                      <label class="btn btn-secondary" for="option2">INATIVO</label>
                                    </c:when>

                                    <c:otherwise>
                                      <input type="radio" class="btn-check" name="status" id="option1" value="ACTIVE"
                                        autocomplete="off" />
                                      <label class="btn btn-secondary" for="option1">ATIVO</label>

                                      <input type="radio" class="btn-check" name="status" id="option2" value="INACTIVE"
                                        autocomplete="off" checked />
                                      <label class="btn btn-secondary" for="option2">INATIVO</label>
                                    </c:otherwise>
                                  </c:choose>
                                </div>
                                <br />
                                <span>Status</span>
                              </div>
                            </div>

                            <div class="form-group mb-4">
                              <input type="email" id="email" name="email" class="form-control" value="${user.email}" />
                              <label class="form-label" for="email">Email</label>
                            </div>

                            <div class="row">
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="password" id="password" name="password" class="form-control"
                                    value="${user.password}" />
                                  <label class="form-label" for="password">Senha</label>
                                </div>
                              </div>
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="password" id="confirmation" name="confirmation" class="form-control"
                                    value="${user.password}" />
                                  <label class="form-label" for="confirmation">Confirme a senha</label>
                                </div>
                              </div>
                            </div>

                            <!-- Submit button -->
                            <div class="row">
                              <button type="submit" class="btn btn-primary btn-block mb-4">
                                Atualizar
                              </button>
                            </div>
                          </form>

                          <hr />

                          <c:if test="${empty user.pets}">
                            <h5>Não existem pets cadastrados para este usuário!!!</h5>
                          </c:if>
                          <c:choose>
                            <c:when test="${user.type == 'USER'}">
                              <div class="pt-1 mb-4">
                                <a class="btn btn-primary text-white" href="/pet/register" role="button">
                                  Adicionar Pet
                                </a>
                              </div>
                            </c:when>
                            <c:when test="${user.type == 'ADMINISTRATOR'}">
                              <div class="row">
                                <button type="submit" class="btn btn-primary btn-block mb-4" disabled>
                                  Adicionar Pet
                                </button>
                              </div>
                            </c:when>
                          </c:choose>

                          <c:if test="${not empty user.pets}">
                            <table class="table align-middle mb-0 bg-white">
                              <thead class="bg-light">
                                <tr>
                                  <th>Nome</th>
                                  <th>Tipo</th>
                                  <th>Raça</th>
                                  <th>Idade</th>
                                  <th>Data Nasc</th>
                                  <th>Ação</th>
                                </tr>
                              </thead>
                              <tbody>
                                <c:forEach var="pet" items="${pets}">
                                  <tr>
                                    <td>
                                      <p class="fw-normal mb-1">${pet.name}</p>
                                    </td>
                                    <td>
                                      <p class="fw-normal mb-1">${pet.type}</p>
                                    </td>
                                    <td>
                                      <p class="fw-normal mb-1">${pet.breed}</p>
                                    </td>
                                    <td>
                                      <p class="fw-normal mb-1">${pet.age}</p>
                                    </td>
                                    <td>
                                      <p class="fw-normal mb-1">${pet.brithDate}</p>
                                    </td>
                                    <td>
                                      <div class="d-flex align-items-center">
                                        <a style="color: #dd4b39;" href="/pet/${pet.id}/remove" role="button">
                                          <i class="far fa-trash-alt"></i>
                                        </a>
                                      </div>
                                    </td>
                                  </tr>
                                </c:forEach>
                              </tbody>
                            </table>
                          </c:if>

                          <!-- Cancel -->
                          <div class="row">
                            <a class="small text-muted" href="/user">Cancelar e voltar</a>
                          </div>


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