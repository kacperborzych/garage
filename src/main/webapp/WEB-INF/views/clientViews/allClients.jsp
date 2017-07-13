<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11.07.2017
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wszyscy klienci</title>
</head>
<body>
<h1>Lista wszystkich klientow</h1>
<thead>
<tr>
    <th>Lp.</th>
    <th>Id.</th>
    <th>Imie.</th>
    <th>Model samochodu</th>
<%--</tr>
</thead>
<tbody>
<c:forEach items="${clientsList}" var="client" varStatus="status">
    <tr>
        <td>${status.index + 1}</td>
        <td>${client.id}</td>
        <td>${client.name}</td>
        <td>${client.carModel}</td>
        <td><a href="editClientForm.html?id=${client.id}">Edit</a></td>
        <td><a href="removeClient.html?id=${client.id}">Remove</a></td>
    </tr>
</c:forEach>
</tbody>--%>

<a href="/garage">
    Menu glowne
</a>
</body>
</html>
