<!DOCTYPE html>
<%@page import="br.ucsal.acai.model.Usuario"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<c:import url="cabecalho.jsp"></c:import>

<body>
	<%
		Usuario usuarioLogin = (Usuario) session.getAttribute("usuarioLogin");
	%>

	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="ListarProdutoUsuarioServlet"><img
					src="assetss/img/acai_icon.png" alt="Icone Açaí" height="55"
					width="55"> Açaí Point</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right pt navbar-brand">
					<li><a href="ListarUsuarioServlet"> <%
 	out.print(usuarioLogin.getNome());
 %>
					</a></li>
					<li><a href="LogarUsuarioServlet">Sair Usuário</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 centered">
					<h2>Tabela de Usuário</h2>
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
										out.print(usuarioLogin.getId());
									%>
								</td>
								<td>
									<%
										out.print(usuarioLogin.getNome());
									%>
								</td>
								<td>
									<%
										out.print(usuarioLogin.getEmail());
									%>
								</td>
								<td>
									<%
										out.print(usuarioLogin.getLogin());
									%>
								</td>
								<td>
									<%
										out.print(usuarioLogin.getSenha());
									%>
								</td>
								<td>
									<%
										out.print(usuarioLogin.getBairro());
									%>
								</td>
								<td><a
									href="AlterarUsuarioServlet?id=${usuarioLogin.getId()}">ALTERAR</a></td>
								<td><a
									href="RemoverUsuarioServlet?id=${usuarioLogin.getId()}">REMOVER</a></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<c:import url="rodape.jsp"></c:import>

</body>
</html>