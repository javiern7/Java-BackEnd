<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Nuevo usuario</title>
    <style type="text/css">
        .formFieldError { background-color: red }
    </style>
</head>
<body>
<h1>User Data</h1>
<br/>
<mvc:form action="userSave.cibertec" modelAttribute="usuarioBean">
    <table>
        <tr>
            <td><mvc:label path="user">User:</mvc:label></td>
            <td><mvc:input path="user" cssErrorClass="formFieldError"/></td>
            <td><mvc:errors path="user"/></td>
        </tr>
        <tr>
            <td><mvc:label path="password">Password:</mvc:label></td>
            <td><mvc:input path="password" cssErrorClass="formFieldError"/></td>
            <td><mvc:errors path="password"/></td>
        </tr>
        <tr>
            <td><mvc:label path="fullName">Full Name:</mvc:label></td>
            <td><mvc:input path="fullName" cssErrorClass="formFieldError"/></td>
            <td><mvc:errors path="fullName"/></td>
        </tr>
        <tr>
            <td colspan="1">
                <input type="submit" value="Insertar"/>
            </td>
        </tr>
    </table>
</mvc:form>
</body>
</html>