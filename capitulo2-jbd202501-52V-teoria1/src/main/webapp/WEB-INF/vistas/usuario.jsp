<%@ page import="pe.edu.cibertec.dto.pe.edu.cibertec.capitulo2.UserDto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 8/08/2025
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>Usuarios</title>
    </head>
    <body>
        <h1>Mantenimiento de Usuarios</h1>
        </br>
        <div class="table-responsive">
        <% List<UserDto> lista = (List<UserDto>) request.getAttribute("lista");%>
        <table style="width:100%" border="1">
            <thead>
                <tr>
                    <th>User</th>
                    <th>Password</th>
                    <th>FullName</th>
                    <th>Photo</th>
                </tr>
            </thead>
            <tbody>
                <% for(UserDto usuario:lista) {%>
                <tr>
                    <td><%=usuario.getUser()%></td>
                    <td><%=usuario.getPassword()%></td>
                    <td><%=usuario.getFullName()%></td>
                    <td><a href="photoShow.cibertec?user=<%=usuario.getUser()%>">Photo</a></td>
                </tr>
                <% }%>
            </tbody>
        </table>
        </div>
        <a href="userNew.cibertec">Insertar usuario</a>
        <br/>
        <h3>Se han creado ${sessionScope.contadorUserSave} usuarios en esta session</h3>
    </body>
</html>
