<!DOCTYPE html>
<%@page import="br.ucsal.acai.model.Loja"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<c:import url="cabecalho.jsp"></c:import>

<body>
	<%
		Loja lojaLogin = (Loja) session.getAttribute("lojaLogin");
	%>

	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="ListarProdutoLojaServlet"><img
					src="assetss/img/acai_icon.png" alt="Icone Açaí" height="55"
					width="55"> Açaí Point</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right pt navbar-brand">
					<li><a href="ListarLojaServlet"> <%
 	out.print(lojaLogin.getNome());
 %>
					</a></li>
					<li><a href="LogarLojaServlet">Sair Loja</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 centered">
					<h2>Tabela de Loja</h2>
					<br>
					<table>
						<thead>
							<tr>
								<th>Id</th>
								<th>Nome</th>
								<th>Email</th>
								<th>Login</th>
								<th>Senha</th>
								<th>Bairro</th>
								<th>Alterar</th>
								<th>Remover</th>
							</tr>
						<thead>
						<tbody>

							<tr>
								<td>
									<%
										out.print(lojaLogin.getId());
									%>
								</td>
								<td>
									<%
										out.print(lojaLogin.getNome());
									%>
								</td>
								<td>
									<%
										out.print(lojaLogin.getEmail());
									%>
								</td>
								<td>
									<%
										out.print(lojaLogin.getLogin());
									%>
								</td>
								<td>
									<%
										out.print(lojaLogin.getSenha());
									%>
								</td>
								<td>
									<%
										out.print(lojaLogin.getBairro());
									%>
								</td>
								<td><a href="AlterarLojaServlet?id=${lojaLogin.getId()}">ALTERAR</a></td>
								<td><a href="RemoverLojaServlet?id=${lojaLogin.getId()}">REMOVER</a></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="col-lg-8 col-lg-offset-2 centered">
					<br> <br>
					<h4>
						<a href="cadastrarProduto.jsp">Adicionar Novo Produto</a>
					</h4>
				</div>
			</div>
		</div>
	</div>

	<c:import url="rodape.jsp"></c:import>

</body>
</html>