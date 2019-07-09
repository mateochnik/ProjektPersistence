<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>${category.nazwa}</title>
</head>
<body>
 <h2>Informacje:</h2>
 <div>
  <table>
   <tr>
   <th>ID</th>
   <th>Kategoria</th>
   </tr>
   <tr>
   <td>${category.id}</td>
   <td>${category.nazwa}</td>
   </tr>
   </table>
   <table>
    <tr>
    <th>ID</th>
    <th>Nazwa</th>
    <th>Wydawnictwo</th>
    <th>Cena</th>
    </tr>
   <c:forEach var="books" items="${category.ksiazki}" >
    <tr>
    <td>${books.id}</td>
    <td>${books.nazwa}</td>
    <td>${books.wydawnictwo}</td>
    <td>${books.cena}</td>
     </tr>
     </c:forEach>
     </table>
 </div>
 <div>
     <input type="button" value="Delete Category"
     onclick="window.location.href='${id}/delete';return false;" />
     </div>
  <div>
       <input type="button" value="Edit Category"
       onclick="window.location.href='${id}/edit';return false;" />
       </div>
</body>
</html>