<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<c:import url="cabecalho.jsp"></c:import>

<body>

	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="index.jsp"><img
					src="assetss/img/acai_icon.png" alt="Icone A�a�" height="55"
					width="55"> A�a� Point</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right pt navbar-brand-mt">
					<li><a href="cadastrarLoja.jsp">Cadastrar Loja</a></li>
					<li><a href="LogarUsuarioServlet">Logar Usu�rio</a></li>
					<li><a href="cadastrarUsuario.jsp">Cadastrar Usu�rio</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-lg-offset-4 centered">
					<div class="table-responsive">
						<h2>Logar Loja</h2>
						<br>
						<form action="LogarLojaServlet" method="POST">

							<div class="form-group">
								<label>Login</label> <input class="form-control" type="text"
									name="login" />
							</div>
							<div class="form-group">
								<label>Senha</label> <input class="form-control" type="password"
									name="senha" />
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