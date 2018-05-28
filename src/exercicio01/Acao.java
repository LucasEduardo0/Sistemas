package exercicio01;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.table.DefaultTableModel;

public class Acao {
	
	//Método para cadastrar produtos
	public void cadastrar(String nomeProduto, double valorProduto) {
		
		//Criar objeto
		Produto p = new Produto();
		p.setNomeProduto(nomeProduto);
		p.setValorProduto(valorProduto);
		
		//Add ao ArrayList
		Produto.dados.add(p);
		
	}
	
	//Método para retornar os dados do produtos
	public DefaultTableModel listarProdutos() {
		
		//DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome do Produto");
		modelo.addColumn("Valor do Produto");
		
		for(int indice = 0; indice < Produto.dados.size(); indice++) {
			
			modelo.addRow(new Object[] {
					Produto.dados.get(indice).getNomeProduto(),
					Produto.dados.get(indice).getValorProduto()
			});
			
		}
		
		//Retorno
		return modelo;
		
	}
	
	//Método para cadastrar produto pedido
	public void cadastrarProdutoPedido(String nomeCliente, String nomeProduto, int quantidade, double valorProduto, String hora, String data) {
		
		//Criar objeto
		ProdutoPedido pp = new ProdutoPedido();
		pp.setNomeCliente(nomeCliente);
		pp.setNomeProduto(nomeProduto);
		pp.setValorProduto(valorProduto);
		pp.setQuantidade(quantidade);
		pp.setHora(hora);
		pp.setData(data);
		
		//Add ao ArrayList
		ProdutoPedido.dados2.add(pp);
		
	}
	
	//Método para retornar os dados do produto
	public DefaultTableModel listarProdutoPedido() {
		
		//DefaultTableModel
		DefaultTableModel modelo2 = new DefaultTableModel();
		modelo2.addColumn("Nome do Cliente");
		modelo2.addColumn("Nome do produto");
		modelo2.addColumn("Valor");
		modelo2.addColumn("Quantidade");
		modelo2.addColumn("Horas");
		modelo2.addColumn("Data");
		
		for(int indice = 0; indice < ProdutoPedido.dados2.size(); indice++) {
			
			modelo2.addRow(new Object[] {
					ProdutoPedido.dados2.get(indice).getNomeCliente(),
					ProdutoPedido.dados2.get(indice).getNomeProduto(),
					ProdutoPedido.dados2.get(indice).getValorProduto(),
					ProdutoPedido.dados2.get(indice).getQuantidade(),
					ProdutoPedido.dados2.get(indice).getHora(),
					ProdutoPedido.dados2.get(indice).getData()
			});
			
		}
		
		//Retorno
		return modelo2;
		
	}

}