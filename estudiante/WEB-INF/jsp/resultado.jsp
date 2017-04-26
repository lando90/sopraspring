<%@taglib prefix="form" uri="/WEB-INF/META-INF/spring-form.tld" %>
<html>
	<head>
		<title>
			Formulario Spring MVC(Alumno)
		</title>
	</head>
	<body>
		<h3>
			Informacion recibida del estudiante
		</h3>
		<table>
			<tr>
				<td>Id alumno:</td>
				<td>${id}</td>
			</tr>
			<tr>
				<td>Nombre:</td>
				<td>${nombre}</td>
			</tr>
			<tr>
				<td>Apellidos:</td>
				<td>${apellidos}</td>
			</tr>
			<tr>
				<td>Edad:</td>
				<td>${edad}</td>
			</tr>
			<tr>
				<td>Curso:</td>
				<td>${curso}</td>
			</tr>
			
			<form:form method="POST" action="bienvenidaEstudiante.do">
			<tr>
				<td colspan="2"><input type="submit" value="Siguiente" /></td>
			</tr>
			</form:form>
		</table>
	</body>
</html>