<%@taglib prefix="form" uri="/WEB-INF/META-INF/spring-form.tld" %>
<html>
	<head>
		<title>
			(Recepcion Alumno)
		</title>
	</head>
	<body bgcolor="#ccccff">
		<h3>
			Bienvenido al curso ${cursoB}.-
		</h3>
		<table width="50%">
			<tr align="left">
				<td>Buena ventura en este curso que comienzas:</td>
				<td align="left">${nombreB} ${apellidosB}</td>
			</tr>
			<tr align="left">
				<td>Estos son tus compañeros:</td>
			</tr>
			<tr align="left">
				<td>${listacursoB}</td>
			</tr>
			<form:form method="POST" action="mediaEstudiante.do">
			<tr>
				<td colspan="2"><input type="submit" value="Media Edad" /></td>
			</tr>
			</form:form>
		</table>
	</body>
</html>