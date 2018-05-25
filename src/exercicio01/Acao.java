package exercicio01;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
	public void cadastraProduto(String nomeCliente, String nomeProduto, int quantidade, int horas, int data){
		
		LocalDateTime tempo = LocalDateTime.now();
		
		int segundo = tempo.getSecond();
		int minuto = tempo.getMinute();
		int hora = tempo.getHour();
		
		String horas2 = hora+":"+minuto+":"+segundo;
		
		horas = Integer.parseInt(horas2);
		
		LocalDateTime tempo1 = LocalDateTime.now();
		
		LocalDate datas = tempo.toLocalDate();
		
		int dataqe = 0;
		
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
		modelo.addColumn("Data");
		
		for(int indice = 0; indice < ProdutoPedido.dados2.size(); indice++){
			modelo.addRow(new Object [] {
					ProdutoPedido.dados2.get(indice).getNomeCliente(),
					ProdutoPedido.dados2.get(indice).getNomeProduto(),
					ProdutoPedido.dados2.get(indice).getQuantidade(),
					ProdutoPedido.dados2.get(indice).getHora(),
					ProdutoPedido.dados2.get(indice).getData()
			});
		}
		
		//Retorno
		return modelo;
		
	}

}
