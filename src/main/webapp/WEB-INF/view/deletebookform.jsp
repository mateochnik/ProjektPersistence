<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
 <title>Usuwanie</title>
</head>
<body>
DELETE BOOK
<form:form action="deleteBook" modelAttribute="book" method="DELETE">
 <table>
 <tbody>
 <tr>
 <td><label>id:</label></td>
 <td><form:input path="id" /></td>
 </tr>
 <tr>
 <td><label></label></td>
 <td><input type="submit" value="Delete" class="delete" method = "DELETE" /></td>
 </tr>
 </tbody>
 </table>
</form:form>
/<!-- -wracamy do listy bez zapisu->
<p>
 <a href="${pageContext.request.contextPath}/categories/list "> return </a>
</p>
</body>
</html>