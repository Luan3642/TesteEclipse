package br.com.alldirect.Util;

import java.sql.SQLException;

import br.com.alldirect.dao.ProdutoDao;
import br.com.alldirect.model.Produto;

public class TestaConnection {
  
    
    public static void main(String args[]) throws SQLException{
    	Produto produto = new Produto();
    	produto.setNome("Allien ware");
    	produto.setDescricao("I10");
    	produto.setPreco(3000.85);
    	
    	ProdutoDao produtodao = new ProdutoDao();
    	
    	produtodao.adicionaProduto(produto);
    }
}
