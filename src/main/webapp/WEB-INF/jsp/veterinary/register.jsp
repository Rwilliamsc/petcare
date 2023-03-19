<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Cadastro de Veterinário</title>

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
              <!-- Section: Design Block -->
              <section class="text-center">


                <!-- Jumbotron -->

                <div class="container py-4">
                  <div class="row d-flex justify-content-center">
                    <div class="col-md-12 col-lg-8 mb-5 mb-lg-0">
                      <div class="card cascading-right" style="
            background: hsla(0, 0%, 100%, 0.55);
            backdrop-filter: blur(30px);
            ">
                        <div class="card-body p-5 shadow-5 text-center">
                          <h2 class="fw-bold mb-5">Cadastro de Veterinário</h2>
                          <form action="/veterinary" method="POST">
                            <!-- 2 column grid layout with text inputs for the first and last names -->
                            <div class="row">
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="name" name="name" class="form-control" />
                                  <label class="form-label" for="name">Nome</label>
                                </div>
                              </div>
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="familyName" name="familyName" class="form-control" />
                                  <label class="form-label" for="familyName">Sobrenome</label>
                                </div>
                              </div>
                            </div>

                            <!-- 2 column grid layout with text inputs for the CFMV and CPF -->
                            <div class="row">
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="cpf" name="cpf" class="form-control"
                                    placeholder="999.999.999-99" />
                                  <label class="form-label" for="cpf">CPF</label>
                                </div>
                              </div>
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="cfmv" name="cfmv" class="form-control" />
                                  <label class="form-label" for="cfmv">CFMV</label>
                                </div>
                              </div>
                            </div>


                            <!-- 2 column grid layout with text inputs for the phone and CPF -->
                            <div class="row">
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="tel" id="phone" name="phone" class="form-control" mask="(99) 99999-9999"
                                    placeholder="(99)99999-9999" />
                                  <label class="form-label" for="phone">Celular</label>
                                </div>
                              </div>
                              <div class="col-md-6 mb-4">
                                <div class="form-group">
                                  <input type="text" id="prefix" name="prefix" class="form-control" />
                                  <label class="form-label" for="prefix">Prefixo</label>
                                </div>
                              </div>
                            </div>

                            <div class="row">
                              <span>Especialidade</span>
                              <div class="col-lg-12 mb-4">
                                <div class="btn-group" id="check-group">
                                  <input type="radio" class="btn-check" name="specialty" id="option1" value="GERAL"
                                    autocomplete="off" checked />
                                  <label class="btn btn-secondary" for="option1">Geral</label>

                                  <input type="radio" class="btn-check" name="specialty" id="option2" value="LAB"
                                    autocomplete="off" />
                                  <label class="btn btn-secondary" for="option2">Laboratório</label>

                                  <input type="radio" class="btn-check" name="specialty" id="option3" value="CIRURGIA"
                                    autocomplete="off" />
                                  <label class="btn btn-secondary" for="option3">Cirurgia</label>
                                </div>
                              </div>
                            </div>


                            <!-- Submit button -->
                            <div class="row">
                              <button type="submit" class="btn btn-primary btn-block mb-4">
                                Cadastrar
                              </button>
                            </div>
                            <!-- Cancel -->
                            <div class="row">
                              <a class="small text-muted" href="/veterinary">Cancelar e voltar</a>
                            </div>
                          </form>
                        </div>
                      </div>
                    </div>
                    <!-- <div class="col-lg-6 mb-5 mb-lg-0">
                      <img style=" object-fit: cover; height: 600px;"
                        src="https://images.unsplash.com/photo-1654919638951-87361390c91a?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80"
                        class="w-100 rounded-4 shadow-4" alt="" />
                    </div> -->

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