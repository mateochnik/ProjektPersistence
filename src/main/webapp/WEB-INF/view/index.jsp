<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>user Page</title>
</head>
<body>
<h1>Witaj w ksiegarni!</h1>
<h2>Zaloguj sie!</h2>
<div>
  <input type="button" value="Zaloguj sie jako user"
  onclick="window.location.href='user';return false;" />
</div>
<div>
  <input type="button" value="Zaloguj sie jako admin"
  onclick="window.location.href='admin';return false;" />
</div>
</html>