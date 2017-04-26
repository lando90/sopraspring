<%@taglib prefix="form" uri="/WEB-INF/META-INF/spring-form.tld" %>
<html>
	<head>
		<title>
			Media Edad Spring MVC(Alumno)
		</title>
	</head>
	<body>
		<h3>
			Media de edad del curso ${cursoC}
		</h3>
		<table>
			<tr>
				<td>La media de edad es de: </td>
				<td>${media} años</td>
			</tr>			
			<form:form method="GET" action="estudiante.do">
			<tr>
				<td colspan="2"><input type="submit" value="Inicio" /></td>
			</tr>
			</form:form>
		</table>
	</body>
</html>