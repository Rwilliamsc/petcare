<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
    <style>
      /* Google Fonts Import Link */
      @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap');

      * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: 'Poppins', sans-serif;
      }

      body {
        overflow: hidden;
      }

      .sidebar {
        position: fixed;
        top: 0;
        left: 0;
        height: 100%;
        width: 260px;
        background: #2d56b7;
        z-index: 100;
        transition: all 0.5s ease;
      }

      .sidebar.close {
        width: 78px;
      }

      .sidebar .logo-details a {
        height: 60px;
        width: 100%;
        display: flex;
        align-items: center;
      }

      .sidebar .logo-details i {
        font-size: 30px;
        color: #fff;
        height: 50px;
        min-width: 78px;
        text-align: center;
        line-height: 50px;
      }

      .sidebar .logo-details .logo_name {
        font-size: 22px;
        color: #fff;
        font-weight: 600;
        transition: 0.3s ease;
        transition-delay: 0.1s;
      }

      .sidebar.close .logo-details .logo_name {
        transition-delay: 0s;
        opacity: 0;
        pointer-events: none;
      }

      .sidebar .nav-links {
        height: 100%;
        padding: 30px 0 150px 0;
        overflow: auto;
      }

      .sidebar.close .nav-links {
        overflow: visible;
      }

      .sidebar .nav-links::-webkit-scrollbar {
        display: none;
      }

      .sidebar .nav-links li {
        position: relative;
        list-style: none;
        transition: all 0.4s ease;
      }

      .sidebar .nav-links li:hover {
        background: #1d1b31;
      }

      .sidebar .nav-links li .iocn-link {
        display: flex;
        align-items: center;
        justify-content: space-between;
      }

      .sidebar.close .nav-links li .iocn-link {
        display: block
      }

      .sidebar .nav-links li i {
        height: 50px;
        min-width: 78px;
        text-align: center;
        line-height: 50px;
        color: #fff;
        font-size: 20px;
        cursor: pointer;
        transition: all 0.3s ease;
      }

      .sidebar .nav-links li.showMenu i.arrow {
        transform: rotate(-180deg);
      }

      .sidebar.close .nav-links i.arrow {
        display: none;
      }

      .sidebar .nav-links li a {
        display: flex;
        align-items: center;
        text-decoration: none;
      }

      .sidebar .nav-links li a .link_name {
        font-size: 18px;
        font-weight: 400;
        color: #fff;
        transition: all 0.4s ease;
      }

      .sidebar.close .nav-links li a .link_name {
        opacity: 0;
        pointer-events: none;
      }

      .sidebar .nav-links li .sub-menu {
        padding: 6px 6px 14px 80px;
        margin-top: -10px;
        background: #1d1b31;
        display: none;
      }

      .sidebar .nav-links li.showMenu .sub-menu {
        display: block;
      }

      .sidebar .nav-links li .sub-menu a {
        color: #fff;
        font-size: 15px;
        padding: 5px 0;
        white-space: nowrap;
        opacity: 0.6;
        transition: all 0.3s ease;
      }

      .sidebar .nav-links li .sub-menu a:hover {
        opacity: 1;
      }

      .sidebar.close .nav-links li .sub-menu {
        position: absolute;
        left: 100%;
        top: -10px;
        margin-top: 0;
        padding: 10px 20px;
        border-radius: 0 6px 6px 0;
        opacity: 0;
        display: block;
        pointer-events: none;
        transition: 0s;
      }

      .sidebar.close .nav-links li:hover .sub-menu {
        top: 0;
        opacity: 1;
        pointer-events: auto;
        transition: all 0.4s ease;
      }

      .sidebar .nav-links li .sub-menu .link_name {
        display: none;
      }

      .sidebar.close .nav-links li .sub-menu .link_name {
        font-size: 18px;
        opacity: 1;
        display: block;
      }

      .sidebar .nav-links li .sub-menu.blank {
        opacity: 1;
        pointer-events: auto;
        padding: 3px 20px 6px 16px;
        opacity: 0;
        pointer-events: none;
      }

      .sidebar .nav-links li:hover .sub-menu.blank {
        top: 50%;
        transform: translateY(-50%);
      }

      .sidebar .profile-details {
        position: fixed;
        bottom: 0;
        width: 260px;
        display: flex;
        align-items: center;
        justify-content: space-between;
        background: #1d1b31;
        padding: 12px 0;
        transition: all 0.5s ease;
      }

      .sidebar.close .profile-details {
        background: none;
      }

      .sidebar.close .profile-details {
        width: 78px;
      }

      .sidebar .profile-details .profile-content {
        display: flex;
        align-items: center;
      }

      .sidebar .profile-details img {
        height: 52px;
        width: 52px;
        object-fit: cover;
        border-radius: 16px;
        margin: 0 14px 0 12px;
        background: #1d1b31;
        transition: all 0.5s ease;
      }

      .sidebar.close .profile-details img {
        padding: 10px;
      }

      .sidebar .profile-details .profile_name,
      .sidebar .profile-details .job {
        color: #fff;
        font-size: 12px;
        font-weight: 500;
        white-space: nowrap;
      }

      .sidebar.close .profile-details i,
      .sidebar.close .profile-details .profile_name,
      .sidebar.close .profile-details .job {
        display: none;
      }

      .sidebar .profile-details .job {
        font-size: 12px;
      }

      .home-section {
        position: relative;
        background: #E4E9F7;
        height: 100vh;
        left: 260px;
        width: calc(100% - 260px);
        transition: all 0.5s ease;
        padding: 12px;
      }

      .sidebar.close~.home-section {
        left: 78px;
        width: calc(100% - 78px);
      }

      .home-content {
        display: flex;
        align-items: center;
        /* flex-wrap: wrap; */
      }

      .bx-menu {
        color: #11101d;
        font-size: 35px;
      }

      .home-section {
        overflow-y: auto;
      }

      .home-section .home-content .bx-menu,
      .home-section .home-content .text {
        color: #11101d;
        font-size: 35px;
      }

      .home-section .home-content .bx-menu {
        cursor: pointer;
        margin-right: 10px;
      }

      .home-section .home-content .text {
        font-size: 26px;
        font-weight: 600;
      }

      @media screen and (max-width: 400px) {
        .sidebar {
          width: 240px;
        }

        .sidebar.close {
          width: 78px;
        }

        .sidebar .profile-details {
          width: 240px;
        }

        .sidebar.close .profile-details {
          background: none;
        }

        .sidebar.close .profile-details {
          width: 78px;
        }

        .home-section {
          left: 240px;
          width: calc(100% - 240px);
        }

        .sidebar.close~.home-section {
          left: 78px;
          width: calc(100% - 78px);
        }
      }
    </style>

    <div class="sidebar close">
      <div class="logo-details">
        <a href="/">
          <i class='fas fa-paw fa-2x me-3'></i>
          <span class="logo_name">PetCare</span>
        </a>

      </div>
      <ul class="nav-links">
        <li>
          <a href="/home">
            <i class='bx bxs-dashboard'></i>
            <span class="link_name">Início</span>
          </a>
          <ul class="sub-menu blank">
            <li><a class="link_name" href="/home">Início</a></li>
          </ul>
        </li>
        <li>
          <a href="#">
            <i class='bx bx-calendar'></i>
            <span class="link_name">Agendamentos</span>
          </a>
          <ul class="sub-menu blank">
            <li><a class="link_name" href="#">Agendamentos</a></li>
          </ul>
        </li>
        <!-- <li>
          <div class="iocn-link">
            <a href="#">
              <i class='bx bx-book-alt'></i>
              <span class="link_name">Pacientes</span>
            </a>
            <i class='bx bxs-chevron-down arrow'></i>
          </div>
          <ul class="sub-menu">
            <li><a class="link_name" href="#">Pacientes</a></li>
            <li><a href="#">Listar</a></li>
            <li><a href="#">Prontuários</a></li>
          </ul>
        </li> -->
        <li>
          <div class="iocn-link">
            <a href="#">
              <i class='bx bx-task'></i>
              <span class="link_name">Serviços</span>
            </a>
            <i class='bx bxs-chevron-down arrow'></i>
          </div>
          <ul class="sub-menu">
            <li><a class="link_name" href="#">Serviços</a></li>
            <li><a href="/appointment">Consultas</a></li>
            <li><a href="/surgery">Cirurgias</a></li>
            <li><a href="/exam">Exames</a></li>
          </ul>
        </li>
        <li>
          <a href="/user">
            <i class='bx bx-user'></i>
            <span class="link_name">Usuários</span>
          </a>
          <ul class="sub-menu blank">
            <li><a class="link_name" href="/user">Usuários</a></li>
          </ul>
        </li>
        <li>
          <a href="#">
            <i class="fas fa-users"></i>
            <span class="link_name">Veterinários</span>
          </a>
          <ul class="sub-menu blank">
            <li><a class="link_name" href="/veterinary">Veterinários</a></li>
          </ul>
        </li>

        <li>
          <div class="profile-details">
            <div class="profile-content">
              <img src="https://randomuser.me/api/portraits/men/${sessionUser.id}.jpg" alt="profileImg">
            </div>
            <a href="/logout">
              <div class="name-job">
                <div class="profile_name">${sessionUser.name} Logout</div>
              </div>
              <i class='bx bx-log-out'></i>
            </a>
          </div>
        </li>
      </ul>
    </div>