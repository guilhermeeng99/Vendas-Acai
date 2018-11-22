package br.ucsal.usuario.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/loginUsuario.jsp/*")
public class FiltrarUsuario implements Filter {

    public FiltrarUsuario() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		String url = httpServletRequest .getRequestURI();
		
		HttpSession sessao = httpServletRequest .getSession();
		
		if (sessao.getAttribute("usuarioLogin")!=null || url.lastIndexOf("loginUsuario.jsp")>-1 ||
		url.lastIndexOf("LogarUsuarioServlet") >-1 ){
		chain.doFilter(request, response);
		}else{
		((HttpServletResponse) response).sendRedirect("loginUsuario.jsp");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}