<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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

  </head>

  <body>
    <!-- Section: Design Block -->
    <section class="text-center text-lg-start">
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

      <!-- Jumbotron -->
      <div class="container py-4">
        <div class="row g-0 align-items-center">
          <div class="col-lg-6 mb-5 mb-lg-0">
            <div class="card cascading-right" style="
            background: hsla(0, 0%, 100%, 0.55);
            backdrop-filter: blur(30px);
            ">
              <div class="card-body p-5 shadow-5 text-center">
                <h2 class="fw-bold mb-5">Cadastro de Usuário</h2>
                <form action="/user" method="POST">
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

                  <!-- 2 column grid layout with text inputs for the nickName and CPF -->
                  <div class="row">
                    <div class="col-md-6 mb-4">
                      <div class="form-group">
                        <input type="text" id="nickName" name="nickName" class="form-control" />
                        <label class="form-label" for="nickName">Apelido</label>
                      </div>
                    </div>
                    <div class="col-md-6 mb-4">
                      <div class="form-group">
                        <input type="text" id="cpf" name="cpf" class="form-control" placeholder="999.999.999-99" />
                        <label class="form-label" for="cpf">CPF</label>
                      </div>
                    </div>
                  </div>

                  <!-- Email input -->
                  <div class="form-group mb-4">
                    <input type="email" id="email" name="email" class="form-control" />
                    <label class="form-label" for="email">Email</label>
                  </div>

                  <!-- Password input -->
                  <!-- 2 column grid layout with password inputs for compare password -->
                  <div class="row">
                    <div class="col-md-6 mb-4">
                      <div class="form-group">
                        <input type="password" id="password" name="password" class="form-control" />
                        <label class="form-label" for="password">Senha</label>
                      </div>
                    </div>
                    <div class="col-md-6 mb-4">
                      <div class="form-group">
                        <input type="password" id="confirmation" name="confirmation" class="form-control" />
                        <label class="form-label" for="confirmation">Confirme a senha</label>
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
                    <a class="small text-muted" href="/">Cancelar e voltar</a>
                  </div>

                  <!-- Register buttons -->
                  <div class="text-center">
                    <p>ou cadastre-se com:</p>
                    <button type="button" class="btn btn-link btn-floating mx-1">
                      <i class="fab fa-facebook-f"></i>
                    </button>

                    <button type="button" class="btn btn-link btn-floating mx-1">
                      <i class="fab fa-google"></i>
                    </button>

                    <button type="button" class="btn btn-link btn-floating mx-1">
                      <i class="fab fa-twitter"></i>
                    </button>

                    <button type="button" class="btn btn-link btn-floating mx-1">
                      <i class="fab fa-github"></i>
                    </button>
                  </div>
                </form>
              </div>
            </div>
          </div>

          <div class="col-lg-6 mb-5 mb-lg-0">
            <img
              src="https://images.unsplash.com/photo-1583337130417-3346a1be7dee?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1664&q=80"
              class="w-100 rounded-4 shadow-4" alt="" />
          </div>
        </div>
      </div>
      <!-- Jumbotron -->
    </section>
    <!-- Section: Design Block -->

  </body>

  </html>