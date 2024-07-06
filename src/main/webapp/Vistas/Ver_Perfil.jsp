<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Modelo.Estudiantes" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<html>
<head>
    <title>Mi Perfil</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: white;
            color: #111111;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 80%;
            margin: 20px auto;
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h1, h2 {
            color: #007BFF;
        }
        .perfil-info {
            margin-bottom: 20px;
        }
        .edit-perfil {
            text-align: right;
            margin-top: 10px;
        }
        .edit-perfil a {
            color: #007BFF;
            text-decoration: none;
        }
        .edit-perfil a:hover {
            text-decoration: underline;
        }
    </style>
    <%-- Verificamos si se actualizaron los campos y se ocultan los datos --%>
    <% if ("true".equals(request.getParameter("actualizado"))) { %>
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            var datosBasicos = document.getElementById("editarPerfil");
            if (datosBasicos) {
                datosBasicos.style.display = "none";
            }
        });
    </script>
    <% } %>
</head>
<body>
<%
    HttpSession Session = request.getSession();
    Estudiantes estudiante = (Estudiantes) Session.getAttribute("usuario");
    if (estudiante == null) {
        response.sendRedirect(request.getContextPath() + "/Login.jsp");
    }
%>
<div class="container">
    <h1>Bienvenido a tu perfil <%= estudiante.getNombre() %> <%= estudiante.getApellido_Paterno() %></h1>

    <div class="perfil-info">
        <label>Correo Electrónico:</label> <%= estudiante.getCorreo() %><br>
        <label>Tipo de Título:</label> <%= estudiante.getTipo_de_titulo() %><br>
        <label>Carrera:</label> <%= estudiante.getCarrera() %><br>
        <label>Universidad:</label> <%= estudiante.getTelefono_fijo() %><br>
        <label>Teléfono Celular:</label> <%= estudiante.getTelefono_celular() %><br>
    </div>
    <div class="edit-perfil">
        <a href="Editar_Perfil.jsp">Editar Perfil</a>
    </div>
</div>
</body>
</html>

