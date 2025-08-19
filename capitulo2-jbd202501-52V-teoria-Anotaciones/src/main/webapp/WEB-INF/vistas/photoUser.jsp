<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 11/08/2025
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pe.edu.cibertec.capitulo2.dto.UserDto" %>
<%@ page import="java.util.Base64" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Foto de usuario</title>
  </head>
  <body>
    <h1>Photo User</h1>
    <% if (request.getAttribute("usuario") == null
            || ((UserDto) request.getAttribute("usuario")).getFoto() == null) { %>
    <h2>Usuario aún sin foto</h2>
    <% } else {%>
      <img src="<%= "data:image/jpeg;base64," + Base64.getEncoder().encodeToString(((UserDto)
      request.getAttribute("usuario")).getFoto())%>" />
    <% } %>
    <br />
    <form method="post" action="photoSave.cibertec" enctype="multipart/form-data">
      <table>
        <tr>
          <td>Seleccione la foto: </td>
          <td><input type="file" name="archivo"></td>
        </tr>
        <tr>
          <td colspan="2" align="center">
            <input type="submit" value="Load Photo">
          </td>
        </tr>
      </table>
      <input type="hidden" name="codigoUsuario" value="<%=((UserDto)request.getAttribute("usuario")).getUser()%>">
    </form>
  </body>
</html>
