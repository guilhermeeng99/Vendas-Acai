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
		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-lg-offset-4 centered">
					<ul class="nav navbar-nav pt navbar-brand">
						<li><a href="LogarUsuarioServlet">Logar Usuário</a></li>
						<li><a href="cadastrarUsuario.jsp">Cadastrar Usuário</a></li>
						<li><a href="LogarLojaServlet">Logar Loja</a></li>
						<li><a href="cadastrarLoja.jsp">Cadastrar Loja</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<c:import url="rodape.jsp"></c:import>

</body>
</html>