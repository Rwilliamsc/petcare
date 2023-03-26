<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1" lang="pt-BR">
            <title>PetCare</title>

            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">


            <style>
                * {
                    margin: 0;
                    padding: 0;
                }

                .container-fluid {
                    width: 100%;
                    height: 100vh;
                    background: linear-gradient(to left, rgba(0, 0, 0, 0.5)50%, rgba(0, 0, 0, 0.5)50%), url(https://images.unsplash.com/photo-1510020553968-30f966e1ec9e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2874&q=80);
                    background-size: cover;
                    background-repeat: no-repeat;
                }

                .navbar-header {
                    margin-right: 100px;
                }

                .navbar-header a {
                    color: #fff;
                }

                .container {
                    width: 1200px;
                    height: 100px;
                    margin: auto;
                    display: flex;
                    justify-content: space-between;
                    align-items: center;
                    padding: 0px 25px;
                }

                .container h2 {
                    font-family: arial;
                    font-size: 30px;
                    color: #fff;
                    cursor: pointer;
                }

                .item-menu ul {
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    margin-top: 15px;
                }

                .item-menu ul li {
                    font-family: arial;
                    color: #fff;
                    List-style: none;
                    margin-right: 50px;
                    font-weight: bold;
                    cursor: pointer;
                    transition: 0.5s;
                }

                .item-menu ul li:first-child {
                    color: #3e8ded;
                }

                .item-menu ul li:hover {
                    color: #3e8ded;
                }

                a {
                    text-decoration: none;
                }

                .item-menu ul li a {
                    font-family: arial;
                    color: #fff;
                    List-style: none;
                    margin-right: 50px;
                    font-weight: bold;
                    cursor: pointer;
                    transition: 0.5s;
                }

                .item-menu ul li a:hover {
                    color: #3e8ded;
                    text-decoration: none;
                }

                .item-menu ul li a:active {
                    color: #fff;
                    text-decoration: none;
                }

                .content {
                    width: 1200px;
                    height: 80vh;
                    margin: auto;
                }

                .content h1 {
                    font-family: arial;
                    font-weight: bold;
                    color: #fff;
                    font-size: 50px;
                    padding-top: 100px;
                }

                .content p {
                    font-family: arial;
                    font-weight: bold;
                    color: #eae8e8;
                    Line-height: 30px;
                    padding-top: 30px;
                }

                .content .btn {
                    width: 200px;
                    height: 50px;
                    border-radius: 10px;
                    font-size: 18px;
                    border: 2px solid #fff;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    background-color: transparent;
                    color: #fff;
                    transition: 0.5s;
                    margin-top: 30px;
                }

                .content .btn:hover {
                    background-color: #fff;
                    color: #3e8ded;
                }
            </style>
        </head>

        <body>
            <div class="container-fluid">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="/">PET CARE</a>
                    </div>
                    <div class="item-menu">
                        <ul class="navbar-nav">
                            <li class="active"><a href="/home">Inicio</a></li>
                            <c:if test="${not empty sessionUser}">
                                <li><a href="/schedule">Agendamento</a></li>
                                <li><a href="/appointment">Consulta</a></li>
                                <li><a href="/surgery">Cirurgia</a></li>
                                <li><a href="/exam">Exame</a></li>
                                <li><a href="/user">Usuario</a></li>
                            </c:if>
                        </ul>

                        <ul class="navbar-nav navbar-right">
                            <c:if test="${empty sessionUser}">
                                <li><a href="/user/register"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
                                </li>
                                <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                            </c:if>

                            <c:if test="${not empty sessionUser}">
                                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout,
                                        ${sessionUser.name}</a></li>
                            </c:if>
                        </ul>
                    </div>
                </nav>
                <div class="container">
                    <div class="content">
                        <h1>Cuidando sempre <br> do seu Pet</h1>
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit.<br>
                            Dolores accusamus, pariatur dolorum quidem.
                        </p>
                        <button class="btn"><i class="fa fa-phone" aria-hidden="true"></i>(21)1234-7171</button>
                    </div>
                </div>
            </div>
        </body>

        </html>