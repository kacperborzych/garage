<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Dodaj nowego klienta</title>
</head>
<body>
<h1>Dodaj nowego klienta</h1>
<f:form method="post" modelAttribute="client" >
<p>
    <f:input path="name"/>
    <f:errors path="name"/>
</p>
<p>
    <f:input path="carModel"/>
    <f:errors path="carModel"/>
</p>
<button type="submit">
    Dodaj klienta</button>
</f:form>

<p>
<a href="/garage">
    Powrot do strony glownej</a>
</p>

</body>
</html>
