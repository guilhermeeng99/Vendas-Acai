<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<c:import url="cabecalho.jsp"></c:import>

<body>

	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="ListarProdutoLojaServlet"><img
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
						<h2>Cadastrar Produto</h2>
						<br>
						<form action="CadastrarProdutoServlet" method="POST">
							<div class="form-group">
								<label>Nome do Produto</label> <input class="form-control"
									type="text" name="nome" />
							</div>
							<div class="form-group">
								<label>Conteúdo</label> <input class="form-control" type="text"
									name="conteudo" />
							</div>
							<div class="form-group">
								<label>Gramas</label> <input class="form-control" type="text"
									name="gramas" />
							</div>
							<div class="form-group">
								<label>Preço</label> <input class="form-control" type="text"
									name="preco" />
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