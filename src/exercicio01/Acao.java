package exercicio01;

import javax.swing.table.DefaultTableModel;

public class Acao {
	
	//Método para cadastrar
	public void cadastrar(String nomeProduto, double valorProduto){
		
		//Criar objeto
		Produto p = new Produto();
		p.setNomeProduto(nomeProduto);
		p.setValorProduto(valorProduto);
		
		//Add ao ArrayList
		Produto.dados.add(p);
		
	}
	
	//Metodos para retornar os dados do produto
	public DefaultTableModel listarProdutos(){
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Valor");
		
		for(int indice = 0; indice < Produto.dados.size(); indice++){
			modelo.addRow(new Object [] {
				Produto.dados.get(indice).getNomeProduto(),
				Produto.dados.get(indice).getValorProduto()
			});
		}
		
		//Retorno
		return modelo;
		
		
	}
	
	//Método para cadastrar pedidos
	public void cadastraProduto(String nomeCliente, String nomeProduto, int quantidade){
		
		//Criar objeto
		ProdutoPedido pp = new ProdutoPedido();
		pp.setNomeCliente(nomeCliente);
		pp.setNomeProduto(nomeProduto);
		pp.setQuantidade(quantidade);
		
		//Add ao ArrayList
		ProdutoPedido.dados2.add(pp);
		
	}
	
	//Método para retornar os dados do produto pedido
	public DefaultTableModel listarProdutoPedido(){
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome do cliente");
		modelo.addColumn("Produto");
		modelo.addColumn("Quantidade");
		modelo.addColumn("Horas");
		
		for(int indice = 0; indice < ProdutoPedido.dados2.size(); indice++){
			modelo.addRow(new Object [] {
					ProdutoPedido.dados2.get(indice).getNomeCliente(),
					ProdutoPedido.dados2.get(indice).getNomeProduto(),
					ProdutoPedido.dados2.get(indice).getQuantidade(),
					ProdutoPedido.dados2.get(indice).getHora()
			});
		}
		
		//Retorno
		return modelo;
		
	}

}
