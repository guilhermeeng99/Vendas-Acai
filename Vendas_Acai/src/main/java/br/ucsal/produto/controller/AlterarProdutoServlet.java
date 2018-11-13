package br.ucsal.produto.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.produto.dao.ProdutoDao;
import br.ucsal.produto.model.Produto;

@WebServlet("/AlterarProdutoServlet")
public class AlterarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AlterarProdutoServlet() {
		super();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");

		ProdutoDao produtoDao = new ProdutoDao();

		Produto produto = produtoDao.getProduto(Long.parseLong(id));

		req.setAttribute("produto", produto);
		RequestDispatcher rd = req.getRequestDispatcher("alterarProduto.jsp");
		rd.forward(req, resp);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Produto produto = new Produto();
		
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String conteudo = request.getParameter("conteudo");
		String gramas = request.getParameter("gramas");
		String preco = request.getParameter("preco");

		produto.setId(Long.parseLong(id));
		produto.setNome(nome);
		produto.setConteudo(conteudo);
		produto.setGramas(gramas);
		produto.setPreco(preco);

		ProdutoDao produtoDao;

		produtoDao = new ProdutoDao();
		produtoDao.altera(produto);

		response.sendRedirect("/ListarProdutoServlet");
	}

}