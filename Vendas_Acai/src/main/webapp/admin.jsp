<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<c:import url="cabecalho.jsp"></c:import>

<body>

	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="ListarProdutoServlet"><img
					src="assetss/img/acai_icon.png" alt="Icone Açaí" height="55"
					width="55"> Açaí Point</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right pt navbar-brand">
					<li><a href="LogarLojaServlet">Sair</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 centered">
					<h2>Tabela de Todas as Lojas</h2>
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
								<th>Remover</th>
							</tr>
						<thead>
						<tbody>
							<c:forEach var="l" items="${loja}">
								<tr>
									<td>${l.id}</td>
									<td>${l.nome}</td>
									<td>${l.email}</td>
									<td>${l.login}</td>
									<td>${l.senha}</td>
									<td>${l.bairro}</td>
									<td><a href="RemoverLojasServlet?id=${l.id}">REMOVER</a></td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="col-lg-8 col-lg-offset-2 centered">
					<h2>Tabela de Todos os Usuários</h2>
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
								<th>Remover</th>
							</tr>
						<thead>
						<tbody>
							<c:forEach var="u" items="${usuario}">
								<tr>
									<td>${u.id}</td>
									<td>${u.nome}</td>
									<td>${u.email}</td>
									<td>${u.login}</td>
									<td>${u.senha}</td>
									<td>${u.bairro}</td>
									<td><a href="RemoverUsuariosServlet?id=${u.id}">REMOVER</a></td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<div id="footer">
		<div class="container">
			<div class="row">

				<div class="col-lg-5">
					<h4>SOBRE O PROJETO:</h4>
					<p>Um site de vendas de açaí interativo com os usuários, de
						forma que os mesmos não precisem mais ir até o local de vendas ou
						pegar filas para comprar o açaí, já que os usuários receberão em
						casa.</p>


				</div>
				<div class="col-lg-6 ">
					<h4>
						<a href="https://github.com/guilhermeeng99/Vendas_Acai"
							target="_blank">Repositório</a>
					</h4>
					<p>Atividade realizada atráves de conhecimentos adquiridos
						pelas matérias: WEB, Eng. Requisitos, Banco de Dados I</p>

				</div>

			</div>

		</div>
	</div>

	<c:import url="rodape.jsp"></c:import>

</body>
</html>