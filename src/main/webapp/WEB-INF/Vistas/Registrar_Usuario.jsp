
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Registrar_Usuario</title>
</head>
<body>
   <div class="container">
       <h2>Registrar Usuario</h2>
       <form action="Registrar_Usuario" method="post">
           <div class="form-group">
               <label for="Correo">Correo:</label>
               <input type="email" id="Correo" name="Correo" required>
           </div>
           <div class="form-group">
               <label for="id_Rol">Rol:</label>
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
