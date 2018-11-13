<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="assetss/img/acai_icon.png">

<title>Vendas Açaí</title>

<link href="assetss/css/bootstrap.css" rel="stylesheet">


<link href="assetss/css/main.css" rel="stylesheet">

<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="assets/js/hover.zoom.js"></script>
<script src="assets/js/hover.zoom.conf.js"></script>

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
				<a class="navbar-brand" href="ListarLojaServlet">Vendas Açaí</a>
			</div>

		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-lg-offset-4 centered">
					<div class="table-responsive">
						<form action="AlterarLojaSenhaServlet" method="POST">
							<div class="form-group">
								<label>Senha</label> <input class="form-control" type="text"
									name="senha" />
							</div>
							<button type="submit" class="btn btn-primary mb-2">Inserir</button>
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
					<p>
						<a href="ListarLojaServlet" target="_blank">Informações das Lojas</a><br>
						<a href="https://github.com/guilhermeeng99/Vendas_Acai"
							target="_blank">Repositório</a><br> Atividade realizada
						atráves de conhecimentos adquiridos pelas matérias: WEB, Eng.
						Requisitos, Banco de Dados I
					</p>

				</div>

			</div>

		</div>
	</div>

	<script src="assetss/js/bootstrap.min.js"></script>
</body>
</html>