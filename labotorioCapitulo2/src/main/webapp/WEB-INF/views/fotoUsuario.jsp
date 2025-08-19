<%@ page import="pe.edu.cibertec.dto.UsuarioDto" %>
<%@ page import="java.util.Base64" %><%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 11/08/2025
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Foto de usuario</title>
  </head>
  <body>
    <h1>Foto del Usuario</h1>
    <% if (request.getAttribute("usuario") == null
            || ((UsuarioDto) request.getAttribute("usuario")).getFoto() == null) { %>
    <h2>Usuario aun sin foto</h2>
    <% } else {%>
    <img src="<%= "data:image/jpeg;base64," +
    Base64.getEncoder().encodeToString(((UsuarioDto)
    request.getAttribute("usuario")).getFoto())%>" />
    <% } %>
    <br />
    <form method="post" action="fotoGrabar.do" enctype="multipart/form-data">
      <table>
        <tr>
          <td>Selecciona foto: </td>
          <td><input type="file" name="archivo"></td>
          IES Cibertec – Java Back-End Developer 4
        </tr>
        <tr>
        </tr>
        <tr><td colspan="2" align="center">
          <input type="submit" value="Subir foto en jpg"></td>
        </tr>
      </table>
      <input type="hidden" name="codigoUsuario"
             value="<%= ((UsuarioDto) request.getAttribute("usuario")).getUsuario() %>">
    </form>
  </body>
</html>
