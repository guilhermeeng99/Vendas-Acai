<!DOCTYPE html>
<%@page import="br.ucsal.loja.model.Loja"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="assetss/img/acai_icon.png">

<title>Vendas Açaí</title>

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
				<a class="navbar-brand" href="ListarProdutoServlet">Vendas Açaí</a>
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
					<div class="table-responsive">
						<h2>Alterar Loja</h2>
						<br>
						<form action="AlterarLojaServlet" method="POST">
							<div class="form-group">
								<label>Nome da Loja</label> <input class="form-control"
									type="text" name="nome" value="${lojaLogin.getNome()}" />
							</div>
							<div class="form-group">
								<label>E-mail</label> <input class="form-control" type="text"
									name="email" value="${lojaLogin.getEmail()}" />
							</div>
							<div class="form-group">
								<label>Login</label> <input class="form-control" type="text"
									name="login" value="${lojaLogin.getLogin()}" />
							</div>
							<div class="form-group">
								<label>Senha</label> <input class="form-control" type="text"
									name="senha" value="${lojaLogin.getSenha()}" />
							</div>
							<div class="form-group">
								<label>Bairro</label> <input class="form-control" type="text"
									name="bairro" value="${lojaLogin.getBairro()}" />
							</div>
							<button type="submit" class="btn btn-dark">Inserir</button>
						</form>
					</div>

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

</body>
</html>