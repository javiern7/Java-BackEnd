<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 8/08/2025
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
  </head>
  <body>
    <h1>Login User</h1>
    <br/>
    <form action="userLogin.cibertec" method="post">
      User: <input type="text" name="user"><br><br/>
      Password: <input type="password" name="password"><br><br/>
      <input type="submit" value="Login">
    </form>
    <% if(request.getAttribute("mensajeError")!=null){
      out.println(request.getAttribute("mensajeError"));}
    %>
  </body>
</html>
