<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<c:import url="cabecalho.jsp"></c:import>

<body>

	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="ListarProdutoUsuarioServlet"><img
					src="assetss/img/acai_icon.png" alt="Icone Açaí" height="55"
					width="55"> Açaí Point</a>
			</div>

		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-lg-offset-4 centered">
					<div class="table-responsive">
						<h2>Compra efetuada com sucesso!</h2>
						<h3>Bom apetite!</h3>
						<br>
						<h3>
							<a href="ListarProdutoUsuarioServlet">Comprar Novamente</a>
						</h3>
					</div>
				</div>
			</div>
		</div>
	</div>

	<c:import url="rodape.jsp"></c:import>

</body>
</html>