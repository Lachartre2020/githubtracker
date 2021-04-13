<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--Created by IntelliJ IDEA.
  User: Jesus
  Date: 10/04/2021
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="/header.jsp"/>

<html>
    <body>
    <h1>Liste des githubers</h1>
    <c:forEach items="${requestScope.listGithuber}" var="gitHuber">
       <p>Name : ${gitHuber.name} -- Email : ${gitHuber.email} -- Login : ${gitHuber.login} -- Id :  ${gitHuber.id} </p>
    </c:forEach>

    </body>
</html>