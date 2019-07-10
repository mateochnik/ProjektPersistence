<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>Lista kategorii</title>
</head>
<body>
 <h2>Kategorie:</h2>
 <div>
 <table>
 <tr>
 <th>Nazwa</th>
 <th>Wyswietl</th>
 <th>Edytuj</th>
 <th>Usun</th>
 </tr>
 <c:forEach var="categories" items="${categories}" >
 <tr>
 <td>${categories.nazwa}</td>
  <td><input type="button" value="Wyswietl"
        onclick="window.location.href='list/${categories.id}';return false;" /></td>
    <td><input type="button" value="Edytuj"
               onclick="window.location.href='list/${categories.id}/edit';return false;" /></td>
   <td><input type="button" value="Usun"
         onclick="window.location.href='list/${categories.id}/delete';return false;" /></td>
   </tr>
 </tr>
 </c:forEach>
 </table>
 </div>
 <div>
  <input type="button" value="Dodaj kategorie"
  onclick="window.location.href='formadd';return false;" />
  </div>
</body>
</html>