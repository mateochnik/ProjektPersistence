<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>Lista ksiazek</title>
</head>
<body>
 <h2>Lista ksiazek:</h2>
 <div>
 <table>
 <tr>
 <th>ID</th>
 <th>Nazwa</th>
 <th>Wydawnictwo</th>
 <th>Cena</th>
 <th>Kategoria</th>
 <th>Wyswietl</th>
 <th>Edytuj</th>
 <th>Usun</th>
 </tr>
 <c:forEach var="books" items="${books}" >
 <tr>
 <td>${books.id}</td>
 <td>${books.nazwa}</td>
 <td>${books.wydawnictwo}</td>
 <td>${books.cena}</td>
 <td>${books.kategoria.nazwa}</td>
 <td><input type="button" value="Wyswietl"
        onclick="window.location.href='list/${books.id}';return false;" /></td>
  <td><input type="button" value="Edytuj"
             onclick="window.location.href='list/${books.id}/edit';return false;" /></td>
 <td><input type="button" value="Usun"
       onclick="window.location.href='list/${books.id}/delete';return false;" /></td>
 </tr>
 </c:forEach>
 </table>
 </div>
 <div>
  <input type="button" value="Dodaj ksiazke"
  onclick="window.location.href='formadd';return false;" />
  </div>

</body>
</html>