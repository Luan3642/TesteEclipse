package br.com.alldirect.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alldirect.dao.ProdutoDao;
import br.com.alldirect.model.Produto;

@WebServlet("ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
     

     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
    	 
    	 String nome = request.getParameter("nome");
    	 String descricao = request.getParameter("descricao");
    	 Double preco = Double.parseDouble(request.getParameter("precoproduto"));
    	 
    	 
    	 
    	 Produto produto = new Produto();
    	 produto.setNome(nome);
    	 produto.setDescricao(descricao);
    	 produto.setPreco(preco);
    	 
    	 ProdutoDao produtodao = new ProdutoDao();
    	 produtodao.adicionaProduto(produto);
    	 
}
}