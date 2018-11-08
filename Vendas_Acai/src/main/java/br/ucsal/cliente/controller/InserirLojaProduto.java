package br.ucsal.cliente.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.cliente.dao.ProdutoDao;
import br.ucsal.cliente.model.Produto;

@WebServlet("/InserirLojaProduto")
public class InserirLojaProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InserirLojaProduto() {
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
		
		try {
			produtoDao = new ProdutoDao();
			produtoDao.adiciona(produto);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		response.sendRedirect("/ListaProduto");

	}

}