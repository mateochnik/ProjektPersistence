<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>List categories</title>
</head>
<body>
 <h2>Categories:</h2>
 <div>
 <table>
 <tr>
 <th>Nazwa</th>
 <th>Opis</th>
 </tr>
 <c:forEach var="categories" items="${categories}" >
 <tr>
 <td>${categories.nazwa}</td>
  <td><input type="button" value="Opis"
        onclick="window.location.href='${categories.id}';return false;" /></td>
 </tr>
 </c:forEach>
 </table>
 </div>
 <div>
  <input type="button" value="Add Category"
  onclick="window.location.href='formadd';return false;" />
  </div>
</body>
</html>