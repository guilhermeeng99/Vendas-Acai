<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="assetss/img/acai_icon.png">

<title>A�a� Point</title>

<link href="assetss/css/bootstrap.css" rel="stylesheet">

<link href="assetss/css/main.css" rel="stylesheet">

</head>

<body>

	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="ListarProdutoServlet"><img
					src="assetss/img/acai_icon.png" alt="Icone A�a�" height="55"
					width="55"> A�a� Point</a>
			</div>

		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-lg-offset-4 centered">
					<ul class="nav navbar-nav pt navbar-brand">
						<li><a href="LoginUsuarioServlet">Logar Usu�rio</a></li>
						<li><a href="adicionarUsuario.jsp">Cadastrar Usu�rio</a></li>
						<li><a href="LoginServlet">Logar Loja</a></li>
						<li><a href="adicionarLoja.jsp">Cadastrar Loja</a></li>
					</ul>
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

</body>
</html>