<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Registrar_Usuario</title>
    <style>
        body {
            font-family: Arial,sans-serif;
            background-color: lightgreen;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            marging:0;
        }
        .container{
            background-color: azure;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h2{
            margin-top: 0;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input, .form-group select {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }
        .form-group button{
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: azure;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .form-group button:hover{
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Registrar Usuario</h2>
    <form action= <%= request.getContextPath()%> /Registrar_Usuario" method="post">
        <div class="form-group">
            <label for="Correo">Correo:</label>
            <input type="email" id="Correo" name="Correo" required>
        </div>
        <div class="container">
            <label for ="Contraseña">Contraseña:</label>
            <input type="password" id="Contraseña" name="Contraseña" required>
        </div>
        <div class="form-group">
            <label for="id_Rol">Tipo de Usuario:</label>
            <select id="id_Rol" name="id_Rol" required>
                <option value ="1">Estudiante</option>
                <option value="2">Empresa</option>
                <option value="3">Administrador</option>
            </select>
        </div>
        <div class="form-group">
            <button type="submit">Resgistrar</button>
        </div>
    </form>
</div>
</body>
</html>