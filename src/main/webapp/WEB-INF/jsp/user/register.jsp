<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
      crossorigin="anonymous"></script>
    <meta charset="UTF-8">
    <title>Cadastro de Usuário</title>
  </head>

  <body>
    <section id="contact">
      <div class="container-lg">

        <div class="text-center">
          <h2>Cadastro de usuário</h2>
          <p class="lead">Cadastro de usuários do sistema</p>
        </div>
        <div class="row justify-content-center my-5">
          <div class="col-lg-6">

            <form action="/user" method="post">
              <div class="form-group">
                <label for="name">Nome:</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Digite seu nome">
              </div>
              <div class="form-group">
                <label for="familyName">Sobrenome:</label>
                <input type="text" class="form-control" id="familyName" name="familyName"
                  placeholder="Digite seu sobrenome">
              </div>
              <div class="row">
                <div class="col-6 mb-3">
                  <label for="nickName">Apelido:</label>
                  <input type="text" class="form-control" id="nickName" name="nickName"
                    placeholder="Como gostaria de ser chamado?">
                </div>
                <div class="col-6 mb-3">
                  <label for="cpf">CPF:</label>
                  <input type="text" class="form-control" id="cpf" name="cpf" placeholder="000.000.000-00">
                </div>
              </div>
              <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Digite seu email">
              </div>
              <div class="row">
                <div class="col-6">
                  <label for="password">Senha:</label>
                  <input type="password" class="form-control" id="password" name="password"
                    placeholder="Digite sua senha">
                </div>

                <div class="col-6">
                  <label for="passwordconf">Confirme a senha:</label>
                  <input type="password" class="form-control" id="passwordconf" name="passwordconf"
                    placeholder="Confirme sua senha">
                </div>
              </div>

              <br>
              <div class="row">
                <button type="submit" class="btn btn-primary btn-md btn-block">Cadastrar</button>
              </div>
            </form>

          </div>
        </div>
      </div>
    </section>


  </body>

  </html>