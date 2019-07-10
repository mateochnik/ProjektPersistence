<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>${author.nazwisko}</title>
</head>
<body>
 <h2>Informacje:</h2>
 <div>
  <table>
   <tr>
   <th>ID</th>
   <th>Imie</th>
   <th>Nazwisko</th>
   </tr>
   <tr>
   <td>${author.id}</td>
   <td>${author.imie}</td>
   <td>${author.nazwisko}</td>
   </tr>
   </table>
 </div>
 <p></p>
 <p>Lista Ksiazek:</p>
 <div>
   <table>
    <tr>
    <th>Nazwa</th>
    <th>Wydawnictwo</th>
    <th>Cena</th>
    </tr>
   <c:forEach var="books" items="${books}" >
    <tr>
    <td>${books.nazwa}</td>
    <td>${books.wydawnictwo}</td>
    <td>${books.cena}</td>
     </tr>
     </c:forEach>
     </table>
 </div>
 <div>
     <input type="button" value="Dodaj Autora"
     onclick="window.location.href='${id}/delete';return false;" />
     </div>
  <div>
       <input type="button" value="Edytuj Autora"
       onclick="window.location.href='${id}/edit';return false;" />
       </div>
</body>
</html>