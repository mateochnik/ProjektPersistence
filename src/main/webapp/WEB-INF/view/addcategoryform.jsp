<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
 <title>categories</title>
</head>
<body>
DODAWANIE KATEGORII
<form:form action="saveCategory" modelAttribute="category" method="POST">
 <table>
 <tbody>
 <tr>
 <td><label>nazwa:</label></td>
 <td><form:input path="nazwa" /></td>
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
 <a href="${pageContext.request.contextPath}/categories/list "> return </a>
</p>
</body>
</html>