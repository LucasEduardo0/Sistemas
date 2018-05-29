package exercicio01;

import java.util.ArrayList;

public class ProdutoPedido {
	
	//Atributos
	private String nomeCliente, nomeProduto, hora, data;
	private int quantidade;
	private double valorProduto;
	
	//ArrayList
	public static ArrayList<ProdutoPedido> dados2 = new ArrayList<>();
	
	//Métodos magicos
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	//Método para exibir o valor no combobox
	public String toString() {
		return nomeCliente;
	}

}











