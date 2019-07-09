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
 <div>
     <input type="button" value="Delete Author"
     onclick="window.location.href='${id}/delete';return false;" />
     </div>
  <div>
       <input type="button" value="Edit Author"
       onclick="window.location.href='${id}/edit';return false;" />
       </div>
</body>
</html>