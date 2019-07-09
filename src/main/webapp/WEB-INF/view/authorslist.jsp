<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>List authors</title>
</head>
<body>
 <h2>Authors:</h2>
 <div>
 <table>
 <tr>
 <th>Imie</th>
 <th>Nazwisko</th>
 <th>Opis</th>
 </tr>
 <c:forEach var="authors" items="${authors}" >
 <tr>
 <td>${authors.imie}</td>
 <td>${authors.nazwisko}</td>
  <td><input type="button" value="Opis"
        onclick="window.location.href='${authors.id}';return false;" /></td>
 </tr>
 </c:forEach>
 </table>
 </div>
 <div>
  <input type="button" value="Add Author"
  onclick="window.location.href='formadd';return false;" />
  </div>
</body>
</html>