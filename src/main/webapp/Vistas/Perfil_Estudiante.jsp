<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Modelo.Usuarios" %>
<html>
<head>
    <title>Menú perfil Estudiante</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .menu{
            margin: 0;
            padding: 0;
            list-style: none;
            background-color: #333333;
        }
        .menu li{display: inline;
        }
        .menu li a {
            color: white;
            padding: 14px 20px;
            text-decoration:none ;
            display: inline-block;
        }
        .menu li a:hover{
            background-color: #111;
        }
    </style>
</head>
<body>
<% Usuarios user = (Usuarios) request.getSession().getAttribute("usuario");
if (user == null) {
    response.sendRedirect(request.getContextPath()+"/Login.jsp");
}
%>
<h1>Bienvenido,<%= user.getCorreo()%></h1>
<div>
    <h2> Opciones del menú</h2>
</div>
<ul class="menu">
    <li><a href="verVacantes.jsp">Ver Vacantes </a></li>
    <li><a href="postularVacante.jsp">Postularse</a></li>
    <li><a href="verPerfil.jsp">Ver Perfil</a></li>
    <li><a href="Logout.jsp">Cerrar sesion</a> </li>
</ul>
</body>
</html>
