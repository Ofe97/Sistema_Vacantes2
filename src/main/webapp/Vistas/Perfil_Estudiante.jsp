
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Modelo.Usuarios" %>
<html>
<head>
    <title>Menú del Estudiante</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .menu {
            margin: 0;
            padding: 0;
            list-style: none;
            background-color: #333;
        }
        .menu li {
            display: inline;
        }
        .menu li a {
            color: white;
            padding: 14px 20px;
            text-decoration: none;
            display: inline-block;
        }
        .menu li a:hover {
            background-color: #111;
        }
    </style>
</head>
<body>
<% Usuarios user = (Usuarios) request.getSession().getAttribute("usuario");
    if (user == null) {
        response.sendRedirect(request.getContextPath()+"/Login.jsp");
        return;
    }
%>
<h1>Bienvenido, <%= user.getCorreo() %></h1>
<div>
    <h2>Opciones del Menú</h2>
</div>
<ul class="menu">
    <li><a href="verVacantes.jsp">Ver Vacantes</a></li>
    <li><a href="postularVacante.jsp">Postular a Vacante</a></li>
    <li><a href="verPerfil.jsp">Ver Perfil</a></li>
    <li><a href="logout.jsp">Cerrar Sesión</a></li>
</ul>

</body>
</html>