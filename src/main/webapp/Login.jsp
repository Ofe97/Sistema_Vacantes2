<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            font-family: Georgia, sans-serif;
            display: flex;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        /*.login-container {
            border: deeppink;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);*/


        .login-container h3 {
            margin-bottom:  20px;
        }


        .login-container input[type="text"]
        .login-container input[type="password"]{
            width: 100%;
            margin: 10px 0;
            border:1px solid #ff80e3;
            border-radius: 5px;
        }


        .login-container input[type="submit"]{
            width: 100%;
            padding: 10px;
            background-color: mediumblue;
            color: azure;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .login-container input[type= "submit"]:hover{
            background-color: #0056b3;
        }

        .login-container a{
            display: block;
            text-align: center;
            margin-top: 20px;
            color: #007BFF;
            text-decoration: none;
        }
        .login-container a {
            text-decoration: underline;
        }



    </style>
</head>
<body>
   <div class="login-container">
       <h2>Inicio</h2>
       <form  action="loginServlet" method="post">
           <label for="email">Correo:</label>
           <input type="text" id="email" name="email" required>
           <label for="password">Contraseña:</label>
           <input type="password" id="password" name="password" required>
           <input type="submit" value="Accder">
       </form>
       <a href="Registrar_Usuario.jsp">Registrarse</a>
   </div>
  </body>
</html>
