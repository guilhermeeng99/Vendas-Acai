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
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="ListarProdutoLojaServlet"><img
					src="assetss/img/acai_icon.png" alt="Icone Açaí" height="55"
					width="55"> Açaí Point</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right pt navbar-brand">
					<li><a href="LoginServlet">Sair Loja</a></li>
					<li><a href="ListarLojaServlet"> <%
 	out.print(lojaLogin.getNome());
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
						<h2>Alterar Loja</h2>
						<br>
						<form action="AlterarLojaServlet" method="POST">
							<div class="form-group">
								<label>Nome da Loja</label> <input class="form-control"
									type="text" name="nome" value="${lojaLogin.getNome()}" />
							</div>
							<div class="form-group">
								<label>E-mail</label> <input class="form-control" type="text"
									name="email" value="${lojaLogin.getEmail()}" />
							</div>
							<div class="form-group">
								<label>Login</label> <input class="form-control" type="text"
									name="login" value="${lojaLogin.getLogin()}" />
							</div>
							<div class="form-group">
								<label>Senha</label> <input class="form-control" type="text"
									name="senha" value="${lojaLogin.getSenha()}" />
							</div>
							<div class="form-group">
								<label>Bairro</label> <input class="form-control" type="text"
									name="bairro" value="${lojaLogin.getBairro()}" />
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