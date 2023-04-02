<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>

    <c:if test="${not empty msg}">
      <div class="position-fixed bottom-0 end-0 p-3" style="z-index: 11">
        <div id="liveToast" class="toast hide text-white bg-${typeAlert}" role="alert" aria-live="assertive"
          aria-atomic="true">
          <div class="toast-header text-white bg-${typeAlert}">
            <strong class="me-auto">Menssagem</strong>
            <small>now</small>
            <button type="button" class="btn-close text-white" data-bs-dismiss="toast" aria-label="Close"></button>
          </div>
          <div class="toast-body">
            ${msg}
          </div>
        </div>
      </div>

      <script>
        const toast = document.getElementById("liveToast")
        const myToast = new bootstrap.Toast(toast, { autohide: true, dalay: 2000 })
        myToast.show()
      </script>
    </c:if>