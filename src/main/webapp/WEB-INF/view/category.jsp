<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>${category.nazwa}</title>
</head>
<body>
 <h2>${category.nazwa}</h2>
 <p></p>
 <p>Lista ksiazek: </p>
 <div>

   <table>
    <tr>
    <th>ID</th>
    <th>Nazwa</th>
    <th>Wydawnictwo</th>
    <th>Cena</th>
    </tr>
   <c:forEach var="books" items="${books}" >
    <tr>
    <td>${books.id}</td>
    <td>${books.nazwa}</td>
    <td>${books.wydawnictwo}</td>
    <td>${books.cena}</td>
     </tr>
     </c:forEach>
     </table>
 </div>
 <p></p>
 <div>
     <input type="button" value="Usun kategorie"
     onclick="window.location.href='${id}/delete';return false;" />
     </div>
     <p></p>
  <div>
       <input type="button" value="Edytuj kategorie"
       onclick="window.location.href='${id}/edit';return false;" />
       </div>
</body>
</html>