<%@taglib prefix="form" uri="/WEB-INF/META-INF/spring-form.tld" %>
<html>
	<head>
		<title>
			Formulario Spring MVC
		</title>
	</head>
	<body>
		<h3>
			Informacion del estudiante
		</h3>
		<form:form method="POST" action="addEstudiante.do">
			<table>
				<tr>
					<td><form:label path="id">Id alumno:</form:label></td>
					<td><form:input path="id" /></td>
				</tr>
				<tr>
					<td><form:label path="nombre">Nombre:</form:label></td>
					<td><form:input path="nombre" /></td>
				</tr>
				<tr>
					<td><form:label path="apellidos">Apellidos:</form:label></td>
					<td><form:input path="apellidos" /></td>
				</tr>
				<tr>
					<td><form:label path="edad">Edad:</form:label></td>
					<td><form:input path="edad" /></td>
				</tr>
				<tr>
					<td><form:label path="curso">Curso:</form:label></td>
					<td><form:input path="curso" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Enviar" /></td>
					<td><input type="reset" value="Borrar" /></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>