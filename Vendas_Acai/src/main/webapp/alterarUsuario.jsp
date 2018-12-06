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
					<li><a href="LoginUsuarioServlet">Sair Loja</a></li>
					<li><a href="ListarUsuarioServlet"> <%
 	out.print(usuarioLogin.getNome());
 %>
					</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 centered">
					<div class="table-responsive">
						<h2>Alterar Usuário</h2>
						<br>
						<form action="AlterarUsuarioServlet" method="POST">
							<div class="form-group">
								<label>Nome da Loja</label> <input class="form-control"
									type="text" name="nome" value="${usuarioLogin.getNome()}" />
							</div>
							<div class="form-group">
								<label>E-mail</label> <input class="form-control" type="text"
									name="email" value="${usuarioLogin.getEmail()}" />
							</div>
							<div class="form-group">
								<label>Login</label> <input class="form-control" type="text"
									name="login" value="${usuarioLogin.getLogin()}" />
							</div>
							<div class="form-group">
								<label>Senha</label> <input class="form-control" type="text"
									name="senha" value="${usuarioLogin.getSenha()}" />
							</div>
							<div class="form-group">
								<label>Bairro</label> <input class="form-control" type="text"
									name="bairro" value="${usuarioLogin.getBairro()}" />
							</div>
							<button type="submit" class="btn btn-dark">Inserir</button>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>

	<c:import url="rodape.jsp"></c:import>

</body>
</html>