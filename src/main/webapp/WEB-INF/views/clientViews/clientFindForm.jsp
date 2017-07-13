<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11.07.2017
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Szukaj klienta</title>
</head>
<body>
<h1>Wszykaj klienta po ID</h1>
<f:form method="post" modelAttribute="client">
    <p>
        <f:input path="id"/>
        <f:errors path="id"/>
    </p>
    <button type="submit">
    Wyszukaj</button>
</f:form>

<a href="/garage">
    Menu glowne
</a>

</body>
</html>
