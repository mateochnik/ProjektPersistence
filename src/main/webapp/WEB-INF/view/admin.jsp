<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>admin page</title>
</head>
<body>
<h1>${ message }</h1>
<form id="logout" action="<%=request.getContextPath()%>/logout" method="post" >
 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
 <input type="submit" value="logout" />
</form>
</p>
<div>
  <input type="button" value="Lista Ksiazek"
  onclick="window.location.href='books/list';return false;"
  style="height:50px; width:400px"/>
  </div>
  <p></p>
<div>
  <input type="button" value="Lista Kategorii"
  onclick="window.location.href='categories/list';return false;"
   style="height:50px; width:400px"/>
  </div>
  <p></p>
 <div>
   <input type="button" value="Lista Autorow"
   onclick="window.location.href='authors/list';return false;"
    style="height:50px; width:400px"/>
   </div>
</body>
</html>
