<!DOCTYPE html>
<%@page import="br.ucsal.loja.model.Loja"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="assetss/img/acai_icon.png">

<title>Vendas A�a�</title>

<link href="assetss/css/bootstrap.css" rel="stylesheet">


<link href="assetss/css/main.css" rel="stylesheet">

<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="assets/js/hover.zoom.js"></script>
<script src="assets/js/hover.zoom.conf.js"></script>

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
				<a class="navbar-brand" href="ListarProdutoServlet">Vendas A�a�</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
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
						<a href="adicionarProduto.jsp">Adicionar Novo Produto</a>
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
					<p>Um site de vendas de a�a� interativo com os usu�rios, de
						forma que os mesmos n�o precisem mais ir at� o local de vendas ou
						pegar filas para comprar o a�a�, j� que os usu�rios receber�o em
						casa.</p>


				</div>
				<div class="col-lg-6 ">
					<h4>
						<a href="https://github.com/guilhermeeng99/Vendas_Acai"
							target="_blank">Reposit�rio</a>
					</h4>
					<p>Atividade realizada atr�ves de conhecimentos adquiridos
						pelas mat�rias: WEB, Eng. Requisitos, Banco de Dados I</p>

				</div>

			</div>

		</div>
	</div>

	<script src="assetss/js/bootstrap.min.js"></script>
</body>
</html>