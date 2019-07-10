<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
 <title>books</title>
</head>
<body>
EDYCJA AUTORA
<form:form action="editAuthor" modelAttribute="author" method="POST">
 <table>
 <tbody>
 <tr>
 <td><label>imie:</label></td>
 <td><form:input path="imie" /></td>
 </tr>
 <tr>
 <td><label>nazwisko:</label></td>
 <td><form:input path="nazwisko" /></td>
 </tr>
 <tr>
 <td><label></label></td>
 <td><input type="submit" value="Save" class="save" /></td>
 </tr>
 </tbody>
 </table>
</form:form>
/<!-- -wracamy do listy bez zapisu->
<p>
 <a href="${pageContext.request.contextPath}/authors/list "> return </a>
</p>
</body>
</html>