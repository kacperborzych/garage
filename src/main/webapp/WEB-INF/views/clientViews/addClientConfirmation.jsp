<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Dodano klienta</title>
</head>
<body>
<h1>Sukces</h1>
<p>Dodano nowego klienta ${client.name} ${client.carModel}</p>

<a href="/garage">
    Menu glowne
</a>

</body>
</html>
