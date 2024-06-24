<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Gestion de Vacantes</title>
    <style>
        body {
            background-color: #f0f8ff;
            color: black;
            font-family: Arial,sans-serif;
        }
        h1 {
            color: darkblue;
        }
        table{
            border-collapse: collapse;
            width: 100px;
        }
        th,td{
            border: 1px solid darkblue ;
            padding: 8px;
            text-align: center;
        }
        th{
            background-color: royalblue;
            color: aliceblue;
        }
        .no-data {
            text-align: center;
            padding: 20px;
        }
    </style>
</head>
<body>
<h1>Vacantes Disponibles</h1>
   <table>
       <thead>
       <tr>
           <th>Vacantes disponibles</th>
           <th>Tipo de Vacante</th>
           <th>Horario</th>
       </tr>
       </thead>
       <tbody>
       <c:forEach var="Vacante" items="${vacantes}">
           <tr>
               <td>${vacante.Cantidad}</td>
               <td>${vacante.Tipo_Vacante}</td>
               <td>${vacante.Horario}</td>
           </tr>
       </c:forEach>
         <c:if test="$empty vacantes">
             <tr>
                 <td colspan="3" class="no-data">No hay vacantes disponobles </td>
             </tr>
         </c:if>
       </tbody>
   </table>
  </body>
</html>
