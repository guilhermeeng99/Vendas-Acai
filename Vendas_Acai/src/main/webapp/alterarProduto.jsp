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
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="ListarLojaServlet">Visualizar Lojas</a></li>
					<li><a href="adicionarLoja.jsp">Cadastrar Loja</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 centered">
					<div class="table-responsive">
						<h2>Alterar Produto</h2>
						<br>
						<form action="AlterarProdutoServlet" method="POST">
							<input type="hidden" name="id" value="${produto.id}">
							<div class="form-group">
								<label>Nome do Produto</label> <input class="form-control"
									type="text" name="nome" value="${produto.nome}" />
							</div>
							<div class="form-group">
								<label>Conteúdo</label> <input class="form-control" type="text"
									name="conteudo" value="${produto.conteudo}" />
							</div>
							<div class="form-group">
								<label>Gramas</label> <input class="form-control" type="text"
									name="gramas" value="${produto.gramas}" />
							</div>
							<div class="form-group">
								<label>Preço</label> <input class="form-control" type="text"
									name="preco" value="${produto.preco}" />
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