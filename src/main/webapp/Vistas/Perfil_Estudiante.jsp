
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

<div class="container">
    <h2>Complementa tu informacon basica </h2>

    <div id="editarPerfil" class="edit-perfil">
        <form action="Perfil_Estudiante.jsp" method="post">
            <label for="Nombre">Nombre:</label>
            <input type="text" id="Nombre" name="Nombre" required>
            <label for="Apellido_Paterno">Apellido Paterno</label>
            <input type="text" id="Apellido_Paterno" name="Apellido_Paterno">
            <label for="Apellido_Materno">Apellido Materno:</label>
            <input type="text" id="Apellido_Materno" name="Apellido_Materno" required>

            <label for="Tipo_de_Titulo">Tipo de Título:</label>
            <input type="number" id="Tipo_de_Titulo" name="Tipo_de_Titulo" required>

            <label for="Carrera">Carrera:</label>
            <input type="number" id="Carrera" name="Carrera" required>

            <label for="Universidad">Universidad:</label>
            <input type="number" id="Universidad" name="Universidad" required>

            <label for="Telefono_fijo">Teléfono Fijo:</label>
            <input type="text" id="Telefono_fijo" name="Telefono_fijo" required>

            <label for="Telefono_celular">Teléfono Celular:</label>
            <input type="text" id="Telefono_celular" name="Telefono_celular" required>

            <input type="submit" value="Actualizar">
        </form>
    </div>
</div>

</body>
</html>