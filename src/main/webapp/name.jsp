<%--
  Created by IntelliJ IDEA.
  User: arvin
  Date: 11-11-2021
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Name Page</title>
  </head>
  <body>
    <c:if test="${error}">
      <h1>${error}</h1>
    </c:if>
    <c:if test="${person.lastName}">
      <p>Hey ${person.firstName} ${person.lastName}</p>
    </c:if>
  </body>
</html>
