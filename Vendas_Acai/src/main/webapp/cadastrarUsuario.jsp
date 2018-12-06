<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<c:import url="cabecalho.jsp"></c:import>

<body>

	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="index.jsp"><img
					src="assetss/img/acai_icon.png" alt="Icone Açaí" height="55"
					width="55"> Açaí Point</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right pt navbar-brand-mt">
					<li><a href="LogarUsuarioServlet">Logar Usuário</a></li>
					<li><a href="LogarLojaServlet">Logar Loja</a></li>
					<li><a href="cadastrarLoja.jsp">Cadastrar Loja</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-lg-offset-4 centered">
					<div class="table-responsive">
						<h2>Cadastrar Usuário</h2>
						<br>
						<form action="CadastrarUsuarioServlet" method="POST">
							<div class="form-group">
								<label>Nome do Usuário</label> <input class="form-control"
									type="text" name="nome" />
							</div>
							<div class="form-group">
								<label>E-mail</label> <input class="form-control" type="text"
									name="email" />
							</div>
							<div class="form-group">
								<label>Login</label> <input class="form-control" type="text"
									name="login" />
							</div>
							<div class="form-group">
								<label>Senha</label> <input class="form-control" type="password"
									name="senha" />
							</div>
							<div class="form-group">
								<label>Bairro</label> <input class="form-control" type="text"
									name="bairro" />
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