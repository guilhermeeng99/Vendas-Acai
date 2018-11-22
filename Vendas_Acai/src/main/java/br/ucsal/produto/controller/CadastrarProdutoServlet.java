package br.ucsal.produto.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.produto.dao.ProdutoDao;
import br.ucsal.produto.model.Produto;

@WebServlet("/CadastrarProdutoServlet")
public class CadastrarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastrarProdutoServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Produto produto = new Produto();

		String nome = request.getParameter("nome");
		String conteudo = request.getParameter("conteudo");
		String gramas = request.getParameter("gramas");
		String preco = request.getParameter("preco");

		produto.setNome(nome);
		produto.setConteudo(conteudo);
		produto.setGramas(gramas);
		produto.setPreco(preco);

		ProdutoDao produtoDao;

		produtoDao = new ProdutoDao();
		produtoDao.adiciona(produto);

		response.sendRedirect("/ListarProdutoServlet");

	}

}