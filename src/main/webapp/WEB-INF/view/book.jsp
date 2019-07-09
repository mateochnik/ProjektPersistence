<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>${book.nazwa}</title>
</head>
<body>
 <h2>Informacje:</h2>
 <div>
  <table>
   <tr>
   <th>ID</th>
   <th>Nazwa</th>
   <th>Wydawnictwo</th>
   <th>Cena</th>
   <th>Kategoria</th>
   </tr>
   <tr>
   <td>${book.id}</td>
   <td>${book.nazwa}</td>
   <td>${book.wydawnictwo}</td>
   <td>${book.cena}</td>
   <td>${book.kategoria.nazwa}</td>
   </tr>
   </table>
 </div>
 <div>
     <input type="button" value="Delete Book"
     onclick="window.location.href='${id}/delete';return false;" />
     </div>
  <div>
       <input type="button" value="Edit Book"
       onclick="window.location.href='${id}/edit';return false;" />
       </div>
</body>
</html>