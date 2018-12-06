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
				<ul class="nav navbar-nav navbar-right pt navbar-brand">
					<li><a href="ListarLojaServlet">Minha Loja</a></li>
					<li><a href="LogarLojaServlet">Logout</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 centered">
					<h2>Tabela de Produtos</h2>
					<br>
					<table>
						<thead>
							<tr>
								<th>Id</th>
								<th>Nome da Loja</th>
								<th>Nome</th>
								<th>Conteúdo</th>
								<th>Gramas</th>
								<th>Preço</th>
								<th>Alterar</th>
								<th>Remover</th>
							</tr>
						<thead>
						<tbody>
							<c:forEach var="p" items="${produto}">
								<tr>
									<td>${p.id}</td>
									<td>${p.loja.nome}</td>
									<td>${p.nome}</td>
									<td>${p.conteudo}</td>
									<td>${p.gramas}</td>
									<td>${p.preco}</td>
									<td><a href="AlterarProdutoServlet?id=${p.id}">ALTERAR</a></td>
									<td><a href="RemoverProdutoServlet?id=${p.id}">REMOVER</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>

			</div>
		</div>
	</div>

	<c:import url="rodape.jsp"></c:import>

</body>
</html>