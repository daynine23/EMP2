<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">(ISIL - JEE) PROYECTO WAR --</h1>
	 <form method="post" action="example">
		<table align="center">
			<tr>
				<td>Ingrese primer numero:</td>
				<td><input type="text" name="number1"></input></td>
			</tr>
			<tr>
				<td>Ingrese segundo numero:</td>
				<td><input type="text" name="number2"></input></td>
			</tr>
			<tr align="center">
				<td colspan="2"> <input type="submit" value="CALCULATE"></td>
			</tr>
			<tr align="center">
				<td colspan="2">El resultado es: <%=request.getAttribute("sum")==null?String.valueOf(""):request.getAttribute("sum") %></td>
			</tr>
		</table>
	 </form>
</body>
</html>