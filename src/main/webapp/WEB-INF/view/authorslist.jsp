<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>Lista autorow</title>
</head>
<body>
 <h2>Autorzy:</h2>
 <div>
 <table>
 <tr>
 <th>Imie</th>
 <th>Nazwisko</th>
 <th>Wyswietl</th>
 <th>Edytuj</th>
 <th>Usun</th>
 </tr>
 <c:forEach var="authors" items="${authors}" >
 <tr>
 <td>${authors.imie}</td>
 <td>${authors.nazwisko}</td>
  <td><input type="button" value="Wyswietl"
        onclick="window.location.href='list/${authors.id}';return false;" /></td>
  <td><input type="button" value="Edytuj"
          onclick="window.location.href='list/${authors.id}/edit';return false;" /></td>
  <td><input type="button" value="Usun"
          onclick="window.location.href='list/${authors.id}/delete';return false;" /></td>
 </tr>
 </c:forEach>
 </table>
 </div>
 <div>
  <input type="button" value="Dodaj autora"
  onclick="window.location.href='formadd';return false;" />
  </div>
</body>
</html>