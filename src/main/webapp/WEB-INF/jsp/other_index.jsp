<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="utf-8" lang="pt-BR">
            <title>PetCare</title>

            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
                crossorigin="anonymous" />
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
                crossorigin="anonymous"></script>
            <!-- Font Awesome -->
            <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet" />
            <!-- Google Fonts -->
            <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet" />
            <!-- MDB -->
            <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.css" rel="stylesheet" />
            <script type="text/javascript"
                src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js"></script>


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

                .container {
                    width: 1200px;
                    height: 80px;
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

                .container ul {
                    display: flex;
                    justify-content: center;
                    align-items: center;
                }

                .container ul li {
                    font-family: arial;
                    color: #fff;
                    List-style: none;
                    margin-right: 50px;
                    font-weight: bold;
                    cursor: pointer;
                    transition: 0.5s;
                }

                .container ul li:first-child {
                    color: #3e8ded;
                }

                .container ul li:hover {
                    color: #3e8ded;
                }

                a {
                    text-decoration: none;
                }

                .container ul li a {
                    font-family: arial;
                    color: #fff;
                    List-style: none;
                    margin-right: 50px;
                    font-weight: bold;
                    cursor: pointer;
                    transition: 0.5s;
                }

                .container ul li a:hover {
                    color: #3e8ded;
                }

                .container ul li a:active {
                    color: #fff;
                }

                .container .btn {
                    width: 200px;
                    height: 50px;
                    border-radius: 10px;
                    font-size: 18px;
                    border: none;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    background-color: #fff;
                    color: #3e8ded;
                    transition: 0.5s;
                }

                .container .btn:hover {
                    background-color: #3e8ded;
                    color: #fff;
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
                <div class="container">
                    <h2>Pet Care</h2>
                    <ul>
                        <li>INICIO</li>
                        <li>SOBRE</li>
                        <li>SERVICOS</li>
                        <li><a href="/login">LOGIN/SING UP</a></li>
                    </ul>
                    <button class="btn"><i class="fa fa-phone" aria-hidden="true"></i>(21)1234-7171</button>
                </div>
                <div class="content">
                    <h1>Cuidando sempre <br> do seu Pet</h1>
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit.<br>
                        Dolores accusamus, pariatur dolorum quidem.
                    </p>
                    <button class="btn"><i class="fa fa-phone" aria-hidden="true"></i>(21)1234-7171</button>
                </div>
            </div>

        </body>

        </html>