package br.ucsal.loja.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucsal.acai.dao.LojaDao;
import br.ucsal.acai.model.Loja;

@WebServlet("/AlterarLojaServlet")
public class AlterarLojaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AlterarLojaServlet() {
		super();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");

		LojaDao lojaDao = new LojaDao();

		Loja loja = lojaDao.getLoja(Long.parseLong(id));

		HttpSession sessao = req.getSession();
		sessao.setAttribute("lojaAntiga", loja);
		RequestDispatcher rd = req.getRequestDispatcher("alterarLoja.jsp");
		rd.forward(req, resp);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sessao = request.getSession();
		Loja loja = new Loja();
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String bairro = request.getParameter("bairro");
		loja.setNome(nome);
		loja.setEmail(email);
		loja.setLogin(login);
		loja.setSenha(senha);
		loja.setBairro(bairro);
		LojaDao lojaDao = new LojaDao();
		loja.setId(lojaDao.getId(loja,(Loja) sessao.getAttribute("lojaAntiga")));
		lojaDao.altera(loja);
		
		sessao.setAttribute("lojaLogin", loja);

		response.sendRedirect("/ListarLojaServlet");
	}

}