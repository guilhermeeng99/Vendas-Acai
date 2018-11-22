<!DOCTYPE html>
<%@page import="br.ucsal.loja.model.Loja"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="assetss/img/acai_icon.png">

<title>Açaí Point</title>

<link href="assetss/css/bootstrap.css" rel="stylesheet">

<link href="assetss/css/main.css" rel="stylesheet">

</head>

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
					<li><a href="LogarLojaServlet">Sair Loja</a></li>
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
					<h2>Tabela de Loja</h2>
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
								<th>Alterar</th>
								<th>Remover</th>
							</tr>
						<thead>
						<tbody>

							<tr>
								<td>
									<%
										out.print(lojaLogin.getId());
									%>
								</td>
								<td>
									<%
										out.print(lojaLogin.getNome());
									%>
								</td>
								<td>
									<%
										out.print(lojaLogin.getEmail());
									%>
								</td>
								<td>
									<%
										out.print(lojaLogin.getLogin());
									%>
								</td>
								<td>
									<%
										out.print(lojaLogin.getSenha());
									%>
								</td>
								<td>
									<%
										out.print(lojaLogin.getBairro());
									%>
								</td>
								<td><a href="AlterarLojaServlet?id=${lojaLogin.getId()}">ALTERAR</a></td>
								<td><a href="RemoverLojaServlet?id=${lojaLogin.getId()}">REMOVER</a></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="col-lg-8 col-lg-offset-2 centered">
					<br> <br>
					<h4>
						<a href="cadastrarProduto.jsp">Adicionar Novo Produto</a>
					</h4>
				</div>
			</div>
		</div>
	</div>

	<div id="footer">
		<div class="container">
			<div class="row">

				<div class="col-lg-5">
					<h4>SOBRE O PROJETO:</h4>
					<a href="AdminListarServlet">Administrador</a>
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

</body>
</html>