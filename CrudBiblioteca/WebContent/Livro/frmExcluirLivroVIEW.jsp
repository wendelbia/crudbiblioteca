<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="excluirLivro.jsp" method="post">
		<label>Código do Livro: </label><br>
		<input type="text" name="id" value="<%=request.getParameter("id")%>">
		
		<label>Nome do livro: </label><br>
		<input type="text" name="nome" value="<%=request.getParameter("nome")%>">
		
		<button type="submit">Excluir</button>
	</form>
</body>
</html>